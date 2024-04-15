package dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language

interface Language {
    val name: String?
    val unicodeRegex: Boolean?
    val rawDefinition: () -> Language?
    val aliases: Array<String>?
    val disableAutodetect: Boolean?
    val contains: dynamic

    @JsName("case_insensitive")
    val caseInsensitive: Boolean?
    val keywords: dynamic
    val isCompiled: Boolean?
    val exports: dynamic
    val classNameAliases: dynamic
    val compilerExtensions: dynamic
    val supersetOf: String?
}

typealias LanguageFn = (hljs: dynamic) -> Language
