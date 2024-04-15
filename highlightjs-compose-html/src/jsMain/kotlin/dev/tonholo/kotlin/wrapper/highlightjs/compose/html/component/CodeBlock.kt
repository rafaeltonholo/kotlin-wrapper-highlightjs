package dev.tonholo.kotlin.wrapper.highlightjs.compose.html.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import dev.tonholo.kotlin.wrapper.highlightjs.compose.html.HighlightJsEffect
import dev.tonholo.kotlin.wrapper.highlightjs.core.language.SupportedLanguage
import dev.tonholo.kotlin.wrapper.highlightjs.core.style.SupportedStyle
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Code
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Pre
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLElement

interface CodeBlockScope {
    val languageName: String
}

private data class CodeBlockScopeImpl(
    override val languageName: String,
) : CodeBlockScope

@Composable
fun CodeBlock(
    code: String,
    isDarkMode: Boolean,
    supportedLanguage: SupportedLanguage,
    style: SupportedStyle? = null,
    attrs: AttrBuilderContext<HTMLElement>? = null,
    bottomContent: @Composable CodeBlockScope.() -> Unit = {},
) {
    HighlightJsEffect(
        isDarkMode = isDarkMode,
        supportedLanguages = listOf(supportedLanguage),
        style = style,
    )
    val scope = remember(supportedLanguage) {
        CodeBlockScopeImpl(
            languageName = supportedLanguage.displayName,
        )
    }

    Div(
        attrs = attrs,
    ) {
        Pre {
            Code {
                Text(
                    value = code,
                )
            }
        }

        scope.bottomContent()
    }
}
