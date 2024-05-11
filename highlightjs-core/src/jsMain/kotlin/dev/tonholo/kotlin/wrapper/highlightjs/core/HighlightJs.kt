package dev.tonholo.kotlin.wrapper.highlightjs.core

import dev.tonholo.kotlin.wrapper.highlightjs.core.language.SupportedLanguage
import dev.tonholo.kotlin.wrapper.highlightjs.core.language.import
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.HighlightJsApi
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.hljs
import dev.tonholo.kotlin.wrapper.highlightjs.core.style.SupportedStyle
import dev.tonholo.kotlin.wrapper.highlightjs.core.style.applyStyle
import dev.tonholo.kotlin.wrapper.highlightjs.core.style.toggleStyle

internal sealed class LanguageModuleState(
    open val alias: String,
) {
    data class Registered(override val alias: String) : LanguageModuleState(alias)
    data class WaitRegistration(override val alias: String) : LanguageModuleState(alias)
}

@OptIn(ExperimentalJsExport::class)
@JsExport
object HighlightJs : HighlightJsApi by hljs {
    val languageModules: Array<SupportedLanguage> = arrayOf()

    @JsExport.Ignore
    internal val languageModuleRegister: MutableSet<LanguageModuleState> = mutableSetOf()

    @JsExport.Ignore
    val isPendingLanguageModelRegistration: Boolean
        get() = languageModuleRegister.any { it is LanguageModuleState.WaitRegistration }

    @JsExport.Ignore
    internal var currentStyle: SupportedStyle = SupportedStyle.Default

    fun toggleStyle(isDarkMode: Boolean) {
        currentStyle.toggleStyle(isDarkMode)
    }
}

@DslMarker
annotation class HighlightJsDsl

class HighlightJsBuilder {
    private val languages = mutableListOf<SupportedLanguage>()
    var style: SupportedStyle? = null
    var isDarkMode: Boolean = false

    fun languages(vararg supportedLanguages: SupportedLanguage) {
        languages.addAll(supportedLanguages.toList())
    }

    fun languages(supportedLanguages: List<SupportedLanguage>) {
        languages.addAll(supportedLanguages)
    }

    fun build(): HighlightJs {
        js.globals.globalThis.KotlinWrapperHighlightJs = HighlightJs
        require(languages.isNotEmpty()) {
            "At least one language is required"
        }

        for (language in languages) {
            val languageModel = HighlightJs.languageModuleRegister.find {
                it.alias == language.alias
            }

            language.import { alias ->
                val module = HighlightJs.languageModules.find { it.alias == language.alias }?.module
                    ?: error("Language ${language.alias} is not supported")

                hljs.registerLanguage(languageName = language.alias, module)
                HighlightJs.languageModuleRegister.apply {
                    remove(LanguageModuleState.WaitRegistration(alias))
                    add(LanguageModuleState.Registered(alias))
                }
            }

            if (languageModel == null) {
                HighlightJs.languageModuleRegister.add(
                    LanguageModuleState.WaitRegistration(language.alias),
                )
            }
        }

        HighlightJs.currentStyle = (style ?: HighlightJs.currentStyle).also {
            it.applyStyle(isDarkMode)
        }

        return HighlightJs
    }
}

@HighlightJsDsl
fun hljs(builder: HighlightJsBuilder.() -> Unit): HighlightJs = highlightJs(builder)

@HighlightJsDsl
fun highlightJs(builder: HighlightJsBuilder.() -> Unit): HighlightJs =
    HighlightJsBuilder().apply(builder).build()
