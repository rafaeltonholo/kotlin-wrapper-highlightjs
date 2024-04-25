package dev.tonholo.kotlin.wrapper.highlightjs.compose.html.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import dev.tonholo.kotlin.wrapper.highlightjs.compose.html.HighlightJsEffect
import dev.tonholo.kotlin.wrapper.highlightjs.core.language.SupportedLanguage
import dev.tonholo.kotlin.wrapper.highlightjs.core.style.SupportedStyle
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Code
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Pre
import org.w3c.dom.HTMLElement

interface CodeBlockScope {
    val languageName: String?
}

private data class CodeBlockScopeImpl(
    override val languageName: String?,
) : CodeBlockScope

@Composable
fun CodeBlock(
    code: String,
    isDarkMode: Boolean,
    supportedLanguage: SupportedLanguage?,
    style: SupportedStyle? = null,
    attrs: AttrBuilderContext<HTMLElement>? = null,
    bottomContent: @Composable CodeBlockScope.() -> Unit = {},
) {
    val scope = remember(supportedLanguage) {
        CodeBlockScopeImpl(
            languageName = supportedLanguage?.displayName,
        )
    }
    if (supportedLanguage != null) {
        HighlightJsEffect(
            isDarkMode = isDarkMode,
            supportedLanguages = listOf(supportedLanguage),
            style = style,
        )
    }

    Div(
        attrs = attrs,
    ) {
        Pre(
            attrs = {
                supportedLanguage?.alias?.let { alias ->
                    classes(alias)
                }
            }
        ) {
            Code(
                attrs = {
                    supportedLanguage?.alias?.let { alias ->
                        classes("language-$alias")
                    }
                },
            ) {
                DisposableEffect(this) {
                    scopeElement.innerHTML = code
                    onDispose { }
                }
            }
        }

        scope.bottomContent()
    }
}
