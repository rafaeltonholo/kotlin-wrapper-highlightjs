package dev.tonholo.kotlin.wrapper.highlightjs.core.mappings

import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.LanguageFn
import org.w3c.dom.HTMLElement
import kotlin.js.RegExp

internal external interface HighlightJsApi {
    fun registerLanguage(languageName: String, language: LanguageFn)
    fun unregisterLanguage(languageName: String)
    fun highlight(code: String, options: HighlightOptions): HighlightResult
    fun highlightAuto(code: String, languageSubset: Array<String>): AutoHighlightResult
    fun highlightBlock(element: HTMLElement)
    fun highlightElement(element: HTMLElement)
    fun highlightAll()
    fun listLanguages(): Array<String>
    fun configure(options: HLJSOptions)
}

external interface HLJSOptions {
    var noHighlightRe: RegExp
    var languageDetectRe: RegExp
    var classPrefix: String
    var cssSelector: String
    var languages: Array<String>
    var ignoreUnescapedHTML: Boolean?
    var throwUnescapedHTML: Boolean?
}

external interface HighlightOptions {
    val language: String
    val ignoreIllegals: Boolean?
}

external interface HighlightResult {
    val code: String?
    val relevance: Number
    val value: String
    val language: String?
    val illegal: Boolean
    val errorRaised: Error?
    val secondBest: HighlightResult?
}

external interface AutoHighlightResult : HighlightResult

@JsModule("highlight.js/lib/core")
@JsNonModule
internal external val hljs: HighlightJsApi
