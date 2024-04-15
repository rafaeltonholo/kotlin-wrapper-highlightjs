package dev.tonholo.kotlin.wrapper.highlightjs.compose.html

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import dev.tonholo.kotlin.wrapper.highlightjs.core.HighlightJs
import dev.tonholo.kotlin.wrapper.highlightjs.core.highlightJs
import dev.tonholo.kotlin.wrapper.highlightjs.core.language.SupportedLanguage
import dev.tonholo.kotlin.wrapper.highlightjs.core.style.SupportedStyle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

@Composable
fun HighlightJsEffect(
    isDarkMode: Boolean,
    vararg supportedLanguages: SupportedLanguage,
    style: SupportedStyle? = null,
    highlightJs: HighlightJsCompose = rememberHighlightJs(
        isDarkMode,
        supportedLanguages = supportedLanguages,
        style = style,
    ),
) = HighlightJsEffect(
    isDarkMode,
    supportedLanguages = supportedLanguages.toList(),
    style,
    highlightJs,
)

@Composable
fun HighlightJsEffect(
    isDarkMode: Boolean,
    supportedLanguages: List<SupportedLanguage>,
    style: SupportedStyle? = null,
    highlightJs: HighlightJsCompose = rememberHighlightJs(
        isDarkMode,
        supportedLanguages = supportedLanguages,
        style = style,
    ),
) {
    LaunchedEffect(isDarkMode) {
        highlightJs.toggleStyle(isDarkMode)
    }

    val highlightJsState by highlightJs.state.collectAsState()
    LaunchedEffect(highlightJsState) {
        if (highlightJsState == HighlightJsState.Completed) {
            highlightJs.highlightAll()
        }
    }
}

@Composable
fun rememberHighlightJs(
    isDarkMode: Boolean,
    vararg supportedLanguages: SupportedLanguage,
    style: SupportedStyle? = null,
    scope: CoroutineScope = rememberCoroutineScope(),
): HighlightJsCompose = rememberHighlightJs(
    isDarkMode,
    supportedLanguages = supportedLanguages.toList(),
    style = style,
    scope = scope,
)

@Composable
fun rememberHighlightJs(
    isDarkMode: Boolean,
    supportedLanguages: List<SupportedLanguage>,
    style: SupportedStyle? = null,
    scope: CoroutineScope = rememberCoroutineScope(),
): HighlightJsCompose {
    return remember(supportedLanguages, isDarkMode) {
        HighlightJsCompose(
            scope = scope,
            highlightJs = highlightJs {
                if (style != null) {
                    this.style = style
                }
                this.isDarkMode = isDarkMode
                languages(supportedLanguages = supportedLanguages)
            }
        )
    }
}

sealed interface HighlightJsState {
    data object Configuring : HighlightJsState
    data object Completed : HighlightJsState
}

class HighlightJsCompose(
    scope: CoroutineScope,
    private val highlightJs: HighlightJs,
) {
    private val _state: MutableStateFlow<HighlightJsState> = MutableStateFlow(HighlightJsState.Configuring)
    val state: StateFlow<HighlightJsState> = _state.asStateFlow()

    init {
        flow {
            while (highlightJs.isPendingLanguageModelRegistration) {
                delay(250.milliseconds)
                emit(HighlightJsState.Configuring)
            }
            emit(HighlightJsState.Completed)
        }.onEach {
            _state.value = it
        }.launchIn(scope)
    }

    fun highlightAll() {
        if (state.value == HighlightJsState.Completed) {
            highlightJs.highlightAll()
        } else {
            console.warn("HighlightJs is not ready yet")
        }
    }

    fun toggleStyle(isDarkMode: Boolean) {
        highlightJs.toggleStyle(isDarkMode)
    }
}
