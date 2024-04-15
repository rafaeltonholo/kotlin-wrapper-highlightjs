package dev.tonholo.kotlin.wrapper.highlightjs.core.language

import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.LanguageFn
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.SupportedLanguageModule
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.abnf
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.accesslog
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.actionscript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.ada
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.angelscript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.apache
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.applescript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.arcade
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.arduino
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.armasm
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.asciidoc
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.aspectj
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.autohotkey
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.autoit
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.avrasm
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.awk
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.axapta
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.bash
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.basic
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.bnf
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.brainfuck
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.c
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.cal
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.capnproto
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.clojure
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.cmake
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.coffeescript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.coq
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.cos
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.cpp
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.crmsh
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.crystal
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.csharp
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.csp
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.css
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.d
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.dart
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.delphi
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.diff
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.django
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.dns
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.dockerfile
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.dos
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.dsconfig
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.dts
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.dust
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.ebnf
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.elixir
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.elm
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.erlang
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.excel
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.fix
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.fortran
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.fsharp
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.gams
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.gauss
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.gcode
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.gherkin
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.glsl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.go
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.golo
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.gradle
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.graphql
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.groovy
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.haml
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.handlebars
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.haskell
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.haxe
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.http
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.hy
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.inform7
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.ini
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.irpf90
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.java
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.javascript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.json
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.julia
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.juliaRepl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.kotlin
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.lasso
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.latex
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.ldif
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.leaf
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.less
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.lisp
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.livecodeserver
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.livescript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.lua
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.makefile
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.markdown
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.mathematica
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.matlab
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.maxima
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.mel
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.mercury
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.mipsasm
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.mizar
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.mojolicious
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.monkey
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.moonscript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.n1ql
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.nginx
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.nim
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.nix
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.nsis
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.objectivec
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.ocaml
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.onec
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.openscad
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.oxygene
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.parser3
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.perl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.pf
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.pgsql
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.php
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.plaintext
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.pony
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.powershell
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.processing
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.profile
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.prolog
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.properties
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.protobuf
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.puppet
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.python
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.pythonRepl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.q
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.qml
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.r
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.reasonml
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.rib
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.roboconf
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.rsl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.ruby
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.ruleslanguage
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.rust
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.sas
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.scala
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.scheme
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.scilab
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.scss
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.shell
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.smali
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.smalltalk
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.sml
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.sql
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.stan
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.stata
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.step21
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.stylus
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.subunit
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.swift
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.tap
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.tcl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.thrift
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.tp
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.twig
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.typescript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.vala
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.vbnet
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.vbscript
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.verilog
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.vhdl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.vim
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.x86asm
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.xl
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.xml
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.xquery
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.yaml
import dev.tonholo.kotlin.wrapper.highlightjs.core.mappings.language.zephir
import kotlinx.browser.document

private const val HLJS_LANGUAGE_MODULE_ID = "hljs-language-module-"

@JsExport
@OptIn(ExperimentalJsExport::class)
data class SupportedLanguage internal constructor(
    val alias: String,
    val import: SupportedLanguageModule,
    val displayName: String,
    val module: LanguageFn? = null,
)

internal fun SupportedLanguage.import(
    onLanguageModuleLoaded: (alias: String) -> Unit,
) {
    val languageModuleId = HLJS_LANGUAGE_MODULE_ID.plus(alias)
    val languageModuleLoadedEventName = "language-module-loaded-$alias"

    document.addEventListener(languageModuleLoadedEventName, callback = {
        println("$alias is ready to use")
        onLanguageModuleLoaded(alias)
    }, false)

    val isLoadModuleRequired = document.querySelector("script[id=\"${languageModuleId}\"]") == null
    if (isLoadModuleRequired) {
        document.createElement(localName = "script").apply {
            setAttribute(qualifiedName = "id", value = languageModuleId)
            setAttribute(qualifiedName = "type", value = "module")
            textContent = """
                |import $alias from '${import.module}'
                |
                |KotlinWrapperHighlightJs.languageModules.push({
                |  alias: '$alias',
                |  import: {
                |   module: '${import.module}',
                |  },
                |  module: $alias,
                |})
                |
                |document.dispatchEvent(new Event('$languageModuleLoadedEventName'))
            """.trimMargin()
        }.also { script ->
            document.body?.appendChild(script)
        }
    }
}

object SupportedLanguages {
    val OneC by lazy {
        SupportedLanguage(alias = "1c", displayName = "1C", import = onec)
    }
    val ABNF by lazy {
        SupportedLanguage(alias = "abnf", displayName = "ABNF", import = abnf)
    }
    val AccessLogs by lazy {
        SupportedLanguage(alias = "accesslog", displayName = "Access logs", import = accesslog)
    }
    val Ada by lazy {
        SupportedLanguage(alias = "ada", displayName = "Ada", import = ada)
    }
    val Arduino by lazy {
        SupportedLanguage(
            alias = "arduino",
            displayName = "Arduino (C++ w/Arduino libs)",
            import = arduino,
        )
    }
    val Ino by lazy {
        SupportedLanguage(
            alias = "ino",
            displayName = "Arduino (C++ w/Arduino libs)",
            import = arduino,
        )
    }
    val ARMAssembler by lazy {
        SupportedLanguage(alias = "armasm", displayName = "ARM assembler", import = armasm)
    }
    val Arm by lazy {
        SupportedLanguage(alias = "arm", displayName = "ARM assembler", import = armasm)
    }

    val AVRAssembler by lazy {
        SupportedLanguage(alias = "avrasm", displayName = "AVR assembler", import = avrasm)
    }

    val ActionScript by lazy {
        SupportedLanguage(alias = "actionscript", displayName = "ActionScript", import = actionscript)
    }
    val As by lazy {
        SupportedLanguage(alias = "as", displayName = "ActionScript", import = actionscript)
    }

    val AngelScript by lazy {
        SupportedLanguage(alias = "angelscript", displayName = "AngelScript", import = angelscript)
    }
    val Asc by lazy {
        SupportedLanguage(alias = "asc", displayName = "AngelScript", import = angelscript)
    }

    val Apache by lazy {
        SupportedLanguage(alias = "apache", displayName = "Apache", import = apache)
    }
    val ApacheConf by lazy {
        SupportedLanguage(alias = "apacheconf", displayName = "Apache", import = apache)
    }

    val AppleScript by lazy {
        SupportedLanguage(alias = "applescript", displayName = "AppleScript", import = applescript)
    }
    val Osascript by lazy {
        SupportedLanguage(alias = "osascript", displayName = "AppleScript", import = applescript)
    }

    val Arcade by lazy {
        SupportedLanguage(alias = "arcade", displayName = "Arcade", import = arcade)
    }

    val AsciiDoc by lazy {
        SupportedLanguage(alias = "asciidoc", displayName = "AsciiDoc", import = asciidoc)
    }
    val ADoc by lazy {
        SupportedLanguage(alias = "adoc", displayName = "AsciiDoc", import = asciidoc)
    }

    val AspectJ by lazy {
        SupportedLanguage(alias = "aspectj", displayName = "AspectJ", import = aspectj)
    }

    val AutoHotkey by lazy {
        SupportedLanguage(alias = "autohotkey", displayName = "AutoHotkey", import = autohotkey)
    }

    val AutoIt by lazy {
        SupportedLanguage(alias = "autoit", displayName = "AutoIt", import = autoit)
    }

    val Awk by lazy {
        SupportedLanguage(alias = "awk", displayName = "Awk", import = awk)
    }
    val Mawk by lazy {
        SupportedLanguage(alias = "mawk", displayName = "Awk", import = awk)
    }
    val Nawk by lazy {
        SupportedLanguage(alias = "nawk", displayName = "Awk", import = awk)
    }
    val Gawk by lazy {
        SupportedLanguage(alias = "gawk", displayName = "Awk", import = awk)
    }

    val Bash by lazy {
        SupportedLanguage(alias = "bash", displayName = "Bash", import = bash)
    }
    val Sh by lazy {
        SupportedLanguage(alias = "sh", displayName = "Bash", import = bash)
    }
    val Zsh by lazy {
        SupportedLanguage(alias = "zsh", displayName = "Bash", import = bash)
    }

    val Basic by lazy {
        SupportedLanguage(alias = "basic", displayName = "Basic", import = basic)
    }

    val BNF by lazy {
        SupportedLanguage(alias = "bnf", displayName = "BNF", import = bnf)
    }

    val Brainfuck by lazy {
        SupportedLanguage(alias = "brainfuck", displayName = "Brainfuck", import = brainfuck)
    }
    val BF by lazy {
        SupportedLanguage(alias = "bf", displayName = "Brainfuck", import = brainfuck)
    }

    val CSharp by lazy {
        SupportedLanguage(alias = "csharp", displayName = "C#", import = csharp)
    }
    val Cs by lazy {
        SupportedLanguage(alias = "cs", displayName = "C#", import = csharp)
    }

    val C by lazy {
        SupportedLanguage(alias = "c", displayName = "C", import = c)
    }
    val H by lazy {
        SupportedLanguage(alias = "h", displayName = "C", import = c)
    }

    val Cpp by lazy {
        SupportedLanguage(alias = "cpp", displayName = "C++", import = cpp)
    }
    val Hpp by lazy {
        SupportedLanguage(alias = "hpp", displayName = "C++", import = cpp)
    }
    val Cc by lazy {
        SupportedLanguage(alias = "cc", displayName = "C++", import = cpp)
    }
    val Hh by lazy {
        SupportedLanguage(alias = "hh", displayName = "C++", import = cpp)
    }
    val CPlusPlus by lazy {
        SupportedLanguage(alias = "c++", displayName = "C++", import = cpp)
    }
    val HPlusPlus by lazy {
        SupportedLanguage(alias = "h++", displayName = "C++", import = cpp)
    }
    val Cxx by lazy {
        SupportedLanguage(alias = "cxx", displayName = "C++", import = cpp)
    }
    val Hxx by lazy {
        SupportedLanguage(alias = "hxx", displayName = "C++", import = cpp)
    }

    val CAL by lazy {
        SupportedLanguage(alias = "cal", displayName = "C/AL", import = cal)
    }

    val CacheObjectScript by lazy {
        SupportedLanguage(alias = "cos", displayName = "Cache Object Script (.cos)", import = cos)
    }
    val Cls by lazy {
        SupportedLanguage(alias = "cls", displayName = "Cache Object Script (.cls)", import = cos)
    }

    val CMake by lazy {
        SupportedLanguage(alias = "cmake", displayName = "CMake", import = cmake)
    }
    val CMakeIn by lazy {
        SupportedLanguage(alias = "cmake.in", displayName = "CMake", import = cmake)
    }

    val Coq by lazy {
        SupportedLanguage(alias = "coq", displayName = "Coq", import = coq)
    }

    val CSP by lazy {
        SupportedLanguage(alias = "csp", displayName = "CSP", import = csp)
    }

    val CSS by lazy {
        SupportedLanguage(alias = "css", displayName = "CSS", import = css)
    }

    val CapNProto by lazy {
        SupportedLanguage(alias = "capnproto", displayName = "Cap’n Proto (.capnproto)", import = capnproto)
    }
    val Capnp by lazy {
        SupportedLanguage(alias = "capnp", displayName = "Cap’n Proto (.capnp)", import = capnproto)
    }

    val Clojure by lazy {
        SupportedLanguage(alias = "clojure", displayName = "Clojure", import = clojure)
    }
    val Clj by lazy {
        SupportedLanguage(alias = "clj", displayName = "Clojure (.clj)", import = clojure)
    }

    val CoffeeScript by lazy {
        SupportedLanguage(alias = "coffeescript", displayName = "CoffeeScript", import = coffeescript)
    }
    val Coffee by lazy {
        SupportedLanguage(alias = "coffee", displayName = "CoffeeScript", import = coffeescript)
    }
    val CSON by lazy {
        SupportedLanguage(alias = "cson", displayName = "CoffeeScript (.cson)", import = coffeescript)
    }
    val Iced by lazy {
        SupportedLanguage(alias = "iced", displayName = "CoffeeScript (.iced)", import = coffeescript)
    }

    val Crmsh by lazy {
        SupportedLanguage(alias = "crmsh", displayName = "Crmsh", import = crmsh)
    }
    val Crm by lazy {
        SupportedLanguage(alias = "crm", displayName = "crm", import = crmsh)
    }
    val Pcmk by lazy {
        SupportedLanguage(alias = "pcmk", displayName = "pcmk", import = crmsh)
    }

    val Crystal by lazy {
        SupportedLanguage(alias = "crystal", displayName = "Crystal", import = crystal)
    }
    val Cr by lazy {
        SupportedLanguage(alias = "cr", displayName = "Crystal (.cr)", import = crystal)
    }

    val D by lazy {
        SupportedLanguage(alias = "d", displayName = "D", import = d)
    }

    val Dart by lazy {
        SupportedLanguage(alias = "dart", displayName = "Dart", import = dart)
    }

    val Delphi by lazy {
        SupportedLanguage(alias = "dpr", displayName = "Delphi", import = delphi)
    }
    val Dfm by lazy {
        SupportedLanguage(alias = "dfm", displayName = "Dfm", import = delphi)
    }
    val Pas by lazy {
        SupportedLanguage(alias = "pas", displayName = "PAS", import = delphi)
    }
    val Pascal by lazy {
        SupportedLanguage(alias = "pascal", displayName = "Pascal", import = delphi)
    }

    val Diff by lazy {
        SupportedLanguage(alias = "diff", displayName = "Diff", import = diff)
    }
    val Patch by lazy {
        SupportedLanguage(alias = "patch", displayName = "Patch", import = diff)
    }

    val Django by lazy {
        SupportedLanguage(alias = "django", displayName = "Django", import = django)
    }
    val Jinja by lazy {
        SupportedLanguage(alias = "jinja", displayName = "Django (jinja)", import = django)
    }

    val DNSZoneFile by lazy {
        SupportedLanguage(alias = "dns", displayName = "DNS (.dns)", import = dns)
    }
    val Zone by lazy {
        SupportedLanguage(alias = "zone", displayName = "DNS (.zone)", import = dns)
    }
    val Bind by lazy {
        SupportedLanguage(alias = "bind", displayName = "DNS (.bind)", import = dns)
    }

    val Dockerfile by lazy {
        SupportedLanguage(alias = "dockerfile", displayName = "Dockerfile", import = dockerfile)
    }
    val Docker by lazy {
        SupportedLanguage(alias = "docker", displayName = "Docker", import = dockerfile)
    }

    val DOS by lazy {
        SupportedLanguage(alias = "dos", displayName = "DOS", import = dos)
    }
    val Bat by lazy {
        SupportedLanguage(alias = "bat", displayName = "BAT", import = dos)
    }
    val Cmd by lazy {
        SupportedLanguage(alias = "cmd", displayName = "CMD", import = dos)
    }

    val DSConfig by lazy {
        SupportedLanguage(alias = "dsconfig", displayName = "dsconfig", import = dsconfig)
    }

    val DTS by lazy {
        SupportedLanguage(alias = "dts", displayName = "DTS (Device Tree)", import = dts)
    }

    val Dust by lazy {
        SupportedLanguage(alias = "dust", displayName = "Dust", import = dust)
    }
    val Dst by lazy {
        SupportedLanguage(alias = "dst", displayName = "Dust", import = dust)
    }

    val EBNF by lazy {
        SupportedLanguage(alias = "ebnf", displayName = "EBNF", import = ebnf)
    }

    val Elixir by lazy {
        SupportedLanguage(alias = "elixir", displayName = "Elixir", import = elixir)
    }

    val Elm by lazy {
        SupportedLanguage(alias = "elm", displayName = "Elm", import = elm)
    }

    val Erlang by lazy {
        SupportedLanguage(alias = "erlang", displayName = "Erlang", import = erlang)
    }
    val Erl by lazy {
        SupportedLanguage(alias = "erl", displayName = "Erlang", import = erlang)
    }

    val Excel by lazy {
        SupportedLanguage(alias = "excel", displayName = "Excel", import = excel)
    }
    val Xls by lazy {
        SupportedLanguage(alias = "xls", displayName = "Excel (.xls)", import = excel)
    }
    val Xlsx by lazy {
        SupportedLanguage(alias = "xlsx", displayName = "Excel (.xlsx)", import = excel)
    }

    val FSharp by lazy {
        SupportedLanguage(alias = "fsharp", displayName = "F#", import = fsharp)
    }
    val Fs by lazy {
        SupportedLanguage(alias = "fs", displayName = "F# (.fs)", import = fsharp)
    }
    val Fsx by lazy {
        SupportedLanguage(alias = "fsx", displayName = "F# (.fsx)", import = fsharp)
    }
    val Fsi by lazy {
        SupportedLanguage(alias = "fsi", displayName = "F# (.fsi)", import = fsharp)
    }
    val FsScript by lazy {
        SupportedLanguage(alias = "fsscript", displayName = "F# Script", import = fsharp)
    }

    val FIX by lazy {
        SupportedLanguage(alias = "fix", displayName = "FIX", import = fix)
    }

    val Fortran by lazy {
        SupportedLanguage(alias = "fortran", displayName = "Fortran", import = fortran)
    }
    val F90 by lazy {
        SupportedLanguage(alias = "f90", displayName = "Fortran", import = fortran)
    }
    val F95 by lazy {
        SupportedLanguage(alias = "f95", displayName = "Fortran", import = fortran)
    }

    val GCode by lazy {
        SupportedLanguage(alias = "gcode", displayName = "G-Code", import = gcode)
    }
    val Nc by lazy {
        SupportedLanguage(alias = "nc", displayName = "G-Code", import = gcode)
    }

    val Gams by lazy {
        SupportedLanguage(alias = "gams", displayName = "Gams", import = gams)
    }
    val Gms by lazy {
        SupportedLanguage(alias = "gms", displayName = "Gams", import = gams)
    }

    val GAUSS by lazy {
        SupportedLanguage(alias = "gauss", displayName = "GAUSS", import = gauss)
    }
    val Gss by lazy {
        SupportedLanguage(alias = "gss", displayName = "GAUSS", import = gauss)
    }

    val Gherkin by lazy {
        SupportedLanguage(alias = "gherkin", displayName = "Gherkin", import = gherkin)
    }

    val Go by lazy {
        SupportedLanguage(alias = "go", displayName = "Go", import = go)
    }
    val Golang by lazy {
        SupportedLanguage(alias = "golang", displayName = "Go", import = go)
    }

    val Golo by lazy {
        SupportedLanguage(alias = "golo", displayName = "Golo", import = golo)
    }
    val Gololang by lazy {
        SupportedLanguage(alias = "gololang", displayName = "Golo", import = golo)
    }

    val Gradle by lazy {
        SupportedLanguage(alias = "gradle", displayName = "Gradle", import = gradle)
    }

    val GraphQL by lazy {
        SupportedLanguage(alias = "graphql", displayName = "GraphQL", import = graphql)
    }
    val Gql by lazy {
        SupportedLanguage(alias = "gql", displayName = "GraphQL", import = graphql)
    }

    val Groovy by lazy {
        SupportedLanguage(alias = "groovy", displayName = "Groovy", import = groovy)
    }

    val HTML by lazy {
        SupportedLanguage(alias = "html", displayName = "HTML", import = xml)
    }
    val XHTML by lazy {
        SupportedLanguage(alias = "xhtml", displayName = "xHTML", import = xml)
    }

    val XML by lazy {
        SupportedLanguage(alias = "xml", displayName = "XML", import = xml)
    }
    val Rss by lazy {
        SupportedLanguage(alias = "rss", displayName = "RSS", import = xml)
    }
    val Atom by lazy {
        SupportedLanguage(alias = "atom", displayName = "XML (Atom)", import = xml)
    }
    val Xjb by lazy {
        SupportedLanguage(alias = "xjb", displayName = "XML (xjb)", import = xml)
    }
    val Xsd by lazy {
        SupportedLanguage(alias = "xsd", displayName = "XML (xsd)", import = xml)
    }
    val Xsl by lazy {
        SupportedLanguage(alias = "xsl", displayName = "XML (xsl)", import = xml)
    }
    val Plist by lazy {
        SupportedLanguage(alias = "plist", displayName = "PList", import = xml)
    }
    val Svg by lazy {
        SupportedLanguage(alias = "svg", displayName = "SVG", import = xml)
    }

    val HTTP by lazy {
        SupportedLanguage(alias = "http", displayName = "HTTP", import = http)
    }
    val Https by lazy {
        SupportedLanguage(alias = "https", displayName = "HTTPS", import = http)
    }

    val Haml by lazy {
        SupportedLanguage(alias = "haml", displayName = "Haml", import = haml)
    }

    val Handlebars by lazy {
        SupportedLanguage(alias = "handlebars", displayName = "Handlebars", import = handlebars)
    }
    val Hbs by lazy {
        SupportedLanguage(alias = "hbs", displayName = "Handlebars", import = handlebars)
    }
    val HtmlHbs by lazy {
        SupportedLanguage(alias = "html.hbs", displayName = "Handlebars", import = handlebars)
    }
    val HtmlHandlebars by lazy {
        SupportedLanguage(alias = "html.handlebars", displayName = "Handlebars", import = handlebars)
    }

    val Haskell by lazy {
        SupportedLanguage(alias = "haskell", displayName = "Haskell", import = haskell)
    }
    val Hs by lazy {
        SupportedLanguage(alias = "hs", displayName = "Haskell", import = haskell)
    }
    val Haxe by lazy {
        SupportedLanguage(alias = "haxe", displayName = "Haxe", import = haxe)
    }
    val Hx by lazy {
        SupportedLanguage(alias = "hx", displayName = "Haxe", import = haxe)
    }
    val Hy by lazy {
        SupportedLanguage(alias = "hy", displayName = "Hy", import = hy)
    }
    val HyLang by lazy {
        SupportedLanguage(alias = "hylang", displayName = "Hy", import = hy)
    }
    val Ini by lazy {
        SupportedLanguage(alias = "ini", displayName = "Ini config", import = ini)
    }
    val Toml by lazy {
        SupportedLanguage(alias = "toml", displayName = "TOML", import = ini)
    }

    val Inform7 by lazy {
        SupportedLanguage(alias = "inform7", displayName = "Inform7", import = inform7)
    }
    val I7 by lazy {
        SupportedLanguage(alias = "i7", displayName = "Inform7", import = inform7)
    }

    val IRPF90 by lazy {
        SupportedLanguage(alias = "irpf90", displayName = "IRPF90", import = irpf90)
    }

    val JSON by lazy {
        SupportedLanguage(alias = "json", displayName = "JSON", import = json)
    }
    val JSONc by lazy {
        SupportedLanguage(alias = "jsonc", displayName = "JSON with Comments", import = json)
    }

    val Java by lazy {
        SupportedLanguage(alias = "java", displayName = "Java", import = java)
    }
    val Jsp by lazy {
        SupportedLanguage(alias = "jsp", displayName = "JSP", import = java)
    }

    val JavaScript by lazy {
        SupportedLanguage(alias = "javascript", displayName = "javascript", import = javascript)
    }
    val Js by lazy {
        SupportedLanguage(alias = "js", displayName = "javascript", import = javascript)
    }
    val Jsx by lazy {
        SupportedLanguage(alias = "jsx", displayName = "javascript", import = javascript)
    }

    val Julia by lazy {
        SupportedLanguage(alias = "julia", displayName = "Julia", import = julia)
    }
    val Jl by lazy {
        SupportedLanguage(alias = "jl", displayName = "Julia", import = julia)
    }

    val JuliaREPL by lazy {
        SupportedLanguage(alias = "julia-repl", displayName = "Julia REPL", import = juliaRepl)
    }

    val Kotlin by lazy {
        SupportedLanguage(alias = "kotlin", displayName = "Kotlin", import = kotlin)
    }
    val Kt by lazy {
        SupportedLanguage(alias = "kt", displayName = "Kotlin", import = kotlin)
    }
    val Kts by lazy {
        SupportedLanguage(alias = "kt", displayName = "Kotlin DSL", import = kotlin)
    }

    val LaTeX by lazy {
        SupportedLanguage(alias = "tex", displayName = "LaTeX", import = latex)
    }

    val Leaf by lazy {
        SupportedLanguage(alias = "leaf", displayName = "Leaf", import = leaf)
    }

    val Lasso by lazy {
        SupportedLanguage(alias = "lasso", displayName = "Lasso", import = lasso)
    }
    val Lasso_LS by lazy {
        SupportedLanguage(alias = "ls", displayName = "Lasso", import = lasso)
    }
    val LassoScript by lazy {
        SupportedLanguage(alias = "lassoscript", displayName = "Lasso", import = lasso)
    }

    val Less by lazy {
        SupportedLanguage(alias = "less", displayName = "less", import = less)
    }

    val LDIF by lazy {
        SupportedLanguage(alias = "ldif", displayName = "LDIF", import = ldif)
    }

    val Lisp by lazy {
        SupportedLanguage(alias = "lisp", displayName = "lisp", import = lisp)
    }

    val LiveCodeServer by lazy {
        SupportedLanguage(
            alias = "livecodeserver",
            displayName = "LiveCode Server",
            import = livecodeserver
        )
    }

    val LiveScript by lazy {
        SupportedLanguage(alias = "livescript", displayName = "LiveScript", import = livescript)
    }
    val Ls by lazy {
        SupportedLanguage(alias = "ls", displayName = "LiveScript", import = livescript)
    }

    val Lua by lazy {
        SupportedLanguage(alias = "lua", displayName = "Lua", import = lua)
    }

    val Makefile by lazy {
        SupportedLanguage(alias = "makefile", displayName = "Makefile", import = makefile)
    }
    val Mk by lazy {
        SupportedLanguage(alias = "mk", displayName = "Makefile", import = makefile)
    }
    val Mak by lazy {
        SupportedLanguage(alias = "mak", displayName = "Makefile", import = makefile)
    }
    val Make by lazy {
        SupportedLanguage(alias = "make", displayName = "Makefile", import = makefile)
    }

    val Markdown by lazy {
        SupportedLanguage(alias = "markdown", displayName = "Markdown", import = markdown)
    }
    val Md by lazy {
        SupportedLanguage(alias = "md", displayName = "Markdown", import = markdown)
    }
    val Mkdown by lazy {
        SupportedLanguage(alias = "mkdown", displayName = "Markdown", import = markdown)
    }
    val Mkd by lazy {
        SupportedLanguage(alias = "mkd", displayName = "Markdown", import = markdown)
    }

    val Mathematica by lazy {
        SupportedLanguage(alias = "mathematica", displayName = "Mathematica", import = mathematica)
    }
    val Mma by lazy {
        SupportedLanguage(alias = "mma", displayName = "Mathematica", import = mathematica)
    }
    val Wl by lazy {
        SupportedLanguage(alias = "wl", displayName = "Mathematica", import = mathematica)
    }

    val Matlab by lazy {
        SupportedLanguage(alias = "matlab", displayName = "Matlab", import = matlab)
    }

    val Maxima by lazy {
        SupportedLanguage(alias = "maxima", displayName = "Maxima", import = maxima)
    }

    val MayaEmbeddedLanguage by lazy {
        SupportedLanguage(alias = "mel", displayName = "Maya Embedded Language", import = mel)
    }

    val Mercury by lazy {
        SupportedLanguage(alias = "mercury", displayName = "Mercury", import = mercury)
    }

    val MIPSAssembler by lazy {
        SupportedLanguage(alias = "mipsasm", displayName = "MIPS Assembler", import = mipsasm)
    }
    val Mips by lazy {
        SupportedLanguage(alias = "mips", displayName = "MIPS Assembler", import = mipsasm)
    }

    val Mizar by lazy {
        SupportedLanguage(alias = "mizar", displayName = "Mizar", import = mizar)
    }

    val Mojolicious by lazy {
        SupportedLanguage(alias = "mojolicious", displayName = "Mojolicious", import = mojolicious)
    }

    val Monkey by lazy {
        SupportedLanguage(alias = "monkey", displayName = "Monkey", import = monkey)
    }

    val Moonscript by lazy {
        SupportedLanguage(alias = "moonscript", displayName = "Moonscript", import = moonscript)
    }
    val Moon by lazy {
        SupportedLanguage(alias = "moon", displayName = "Moonscript", import = moonscript)
    }

    val N1QL by lazy {
        SupportedLanguage(alias = "n1ql", displayName = "N1QL", import = n1ql)
    }

    val NSIS by lazy {
        SupportedLanguage(alias = "nsis", displayName = "NSIS", import = nsis)
    }

    val Nginx by lazy {
        SupportedLanguage(alias = "nginx", displayName = "Nginx", import = nginx)
    }
    val NginxConf by lazy {
        SupportedLanguage(alias = "nginxconf", displayName = "Nginx Config", import = nginx)
    }

    val Nim by lazy {
        SupportedLanguage(alias = "nim", displayName = "Nim", import = nim)
    }
    val Nimrod by lazy {
        SupportedLanguage(alias = "nimrod", displayName = "Nim", import = nim)
    }

    val Nix by lazy {
        SupportedLanguage(alias = "nix", displayName = "Nix", import = nix)
    }

    val OCaml by lazy {
        SupportedLanguage(alias = "ocaml", displayName = "OCaml", import = ocaml)
    }
    val OCaml_Ml by lazy {
        SupportedLanguage(alias = "ml", displayName = "OCaml", import = ocaml)
    }

    val ObjectiveC by lazy {
        SupportedLanguage(alias = "objectivec", displayName = "Objective-C", import = objectivec)
    }
    val Mm by lazy {
        SupportedLanguage(alias = "mm", displayName = "Objective-C", import = objectivec)
    }
    val Objc by lazy {
        SupportedLanguage(alias = "objc", displayName = "Objective-C", import = objectivec)
    }
    val Obj_C by lazy {
        SupportedLanguage(alias = "obj-c", displayName = "Objective-C", import = objectivec)
    }
    val ObjCpp by lazy {
        SupportedLanguage(alias = "obj-c++", displayName = "Objective-C", import = objectivec)
    }
    val ObjectiveCpp by lazy {
        SupportedLanguage(alias = "objective-c++", displayName = "Objective-C", import = objectivec)
    }

    val OpenGLShadingLanguage by lazy {
        SupportedLanguage(alias = "glsl", displayName = "OpenGL Shading Language (GLSL)", import = glsl)
    }

    val OpenSCAD by lazy {
        SupportedLanguage(alias = "openscad", displayName = "OpenSCAD", import = openscad)
    }
    val Scad by lazy {
        SupportedLanguage(alias = "scad", displayName = "OpenSCAD", import = openscad)
    }

    val OracleRulesLanguage by lazy {
        SupportedLanguage(
            alias = "ruleslanguage",
            displayName = "Oracle Rules Language",
            import = ruleslanguage
        )
    }

    val Oxygene by lazy {
        SupportedLanguage(alias = "oxygene", displayName = "Oxygene", import = oxygene)
    }

    val PF by lazy {
        SupportedLanguage(alias = "pf", displayName = "PF", import = pf)
    }
    val PfConf by lazy {
        SupportedLanguage(alias = "pf.conf", displayName = "PF.config", import = pf)
    }

    val PHP by lazy {
        SupportedLanguage(alias = "php", displayName = "PHP", import = php)
    }

    val Parser3 by lazy {
        SupportedLanguage(alias = "parser3", displayName = "Parser3", import = parser3)
    }

    val Perl by lazy {
        SupportedLanguage(alias = "perl", displayName = "Perl", import = perl)
    }
    val Pl by lazy {
        SupportedLanguage(alias = "pl", displayName = "Perl", import = perl)
    }
    val Pm by lazy {
        SupportedLanguage(alias = "pm", displayName = "Perl", import = perl)
    }

    val Plaintext by lazy {
        SupportedLanguage(alias = "plaintext", displayName = "Plain text", import = plaintext)
    }
    val Txt by lazy {
        SupportedLanguage(alias = "txt", displayName = "Plain text", import = plaintext)
    }
    val Text by lazy {
        SupportedLanguage(alias = "text", displayName = "Plain text", import = plaintext)
    }

    val Pony by lazy {
        SupportedLanguage(alias = "pony", displayName = "Pony", import = pony)
    }

    val PostgresSQL by lazy {
        SupportedLanguage(alias = "pgsql", displayName = "PostgreSQL & PL/pgSQL", import = pgsql)
    }
    val Postgres by lazy {
        SupportedLanguage(alias = "postgres", displayName = "PostgreSQL & PL/pgSQL", import = pgsql)
    }
    val Postgresql by lazy {
        SupportedLanguage(alias = "postgresql", displayName = "PostgreSQL & PL/pgSQL", import = pgsql)
    }

    val PowerShell by lazy {
        SupportedLanguage(alias = "powershell", displayName = "PowerShell", import = powershell)
    }
    val Ps by lazy {
        SupportedLanguage(alias = "ps", displayName = "PowerShell", import = powershell)
    }
    val Ps1 by lazy {
        SupportedLanguage(alias = "ps1", displayName = "PowerShell", import = powershell)
    }

    val Processing by lazy {
        SupportedLanguage(alias = "processing", displayName = "Processing", import = processing)
    }

    val Prolog by lazy {
        SupportedLanguage(alias = "prolog", displayName = "Prolog", import = prolog)
    }

    val Properties by lazy {
        SupportedLanguage(alias = "properties", displayName = "Properties", import = properties)
    }

    val ProtocolBuffers by lazy {
        SupportedLanguage(alias = "protobuf", displayName = "Protocol Buffers", import = protobuf)
    }
    val Protobuf by lazy {
        SupportedLanguage(alias = "proto", displayName = "Protocol Buffers", import = protobuf)
    }

    val Puppet by lazy {
        SupportedLanguage(alias = "puppet", displayName = "Puppet", import = puppet)
    }
    val Pp by lazy {
        SupportedLanguage(alias = "pp", displayName = "Puppet", import = puppet)
    }

    val Python by lazy {
        SupportedLanguage(alias = "python", displayName = "Python", import = python)
    }
    val Py by lazy {
        SupportedLanguage(alias = "py", displayName = "Python", import = python)
    }
    val Gyp by lazy {
        SupportedLanguage(alias = "gyp", displayName = "Python", import = python)
    }

    val PythonProfilerResults by lazy {
        SupportedLanguage(alias = "profile", displayName = "Python profiler results", import = profile)
    }

    val PythonREPL by lazy {
        SupportedLanguage(alias = "python-repl", displayName = "Python REPL", import = pythonRepl)
    }
    val Pycon by lazy {
        SupportedLanguage(alias = "pycon", displayName = "", import = pythonRepl)
    }

    val Q by lazy {
        SupportedLanguage(alias = "k", displayName = "Q", import = q)
    }
    val K by lazy {
        SupportedLanguage(alias = "k", displayName = "Q", import = q)
    }
    val Kdb by lazy {
        SupportedLanguage(alias = "kdb", displayName = "Q", import = q)
    }

    val QML by lazy {
        SupportedLanguage(alias = "qml", displayName = "QML", import = qml)
    }

    val R by lazy {
        SupportedLanguage(alias = "r", displayName = "R", import = r)
    }

    val ReasonML by lazy {
        SupportedLanguage(alias = "reasonml", displayName = "ReasonML", import = reasonml)
    }
    val Re by lazy {
        SupportedLanguage(alias = "re", displayName = "ReasonML", import = reasonml)
    }

    val RenderManRIB by lazy {
        SupportedLanguage(alias = "rib", displayName = "RenderMan RIB", import = rib)
    }

    val RenderManRSL by lazy {
        SupportedLanguage(alias = "rsl", displayName = "RenderMan RSL", import = rsl)
    }

    val Roboconf by lazy {
        SupportedLanguage(alias = "graph", displayName = "Roboconf", import = roboconf)
    }
    val Instances by lazy {
        SupportedLanguage(alias = "instances", displayName = "Roboconf", import = roboconf)
    }

    val Ruby by lazy {
        SupportedLanguage(alias = "ruby", displayName = "Ruby", import = ruby)
    }
    val Rb by lazy {
        SupportedLanguage(alias = "rb", displayName = "Ruby", import = ruby)
    }
    val Gemspec by lazy {
        SupportedLanguage(alias = "gemspec", displayName = "Ruby", import = ruby)
    }
    val Podspec by lazy {
        SupportedLanguage(alias = "podspec", displayName = "Ruby", import = ruby)
    }
    val Thor by lazy {
        SupportedLanguage(alias = "thor", displayName = "Ruby", import = ruby)
    }
    val Irb by lazy {
        SupportedLanguage(alias = "irb", displayName = "Ruby", import = ruby)
    }

    val Rust by lazy {
        SupportedLanguage(alias = "rust", displayName = "Rust", import = rust)
    }
    val Rs by lazy {
        SupportedLanguage(alias = "rs", displayName = "Rust", import = rust)
    }

    val SAS by lazy {
        SupportedLanguage(alias = "SAS", displayName = "SAS", import = sas)
    }
    val Sas by lazy {
        SupportedLanguage(alias = "sas", displayName = "SAS", import = sas)
    }

    val SCSS by lazy {
        SupportedLanguage(alias = "scss", displayName = "SCSS", import = scss)
    }

    val SQL by lazy {
        SupportedLanguage(alias = "sql", displayName = "SQL", import = sql)
    }

    val P21 by lazy {
        SupportedLanguage(alias = "p21", displayName = "STEP Part 21", import = step21)
    }
    val Step by lazy {
        SupportedLanguage(alias = "step", displayName = "STEP Part 21", import = step21)
    }
    val Stp by lazy {
        SupportedLanguage(alias = "stp", displayName = "STEP Part 21", import = step21)
    }

    val Scala by lazy {
        SupportedLanguage(alias = "scala", displayName = "Scala", import = scala)
    }

    val Scheme by lazy {
        SupportedLanguage(alias = "scheme", displayName = "Scheme", import = scheme)
    }

    val Scilab by lazy {
        SupportedLanguage(alias = "scilab", displayName = "Scilab", import = scilab)
    }
    val Sci by lazy {
        SupportedLanguage(alias = "sci", displayName = "Scilab", import = scilab)
    }

    val Shell by lazy {
        SupportedLanguage(alias = "shell", displayName = "Shell", import = shell)
    }
    val Console by lazy {
        SupportedLanguage(alias = "console", displayName = "Console", import = shell)
    }

    val Smali by lazy {
        SupportedLanguage(alias = "smali", displayName = "Smali", import = smali)
    }

    val Smalltalk by lazy {
        SupportedLanguage(alias = "smalltalk", displayName = "Smalltalk", import = smalltalk)
    }
    val St by lazy {
        SupportedLanguage(alias = "st", displayName = "Smalltalk", import = smalltalk)
    }

    val SML by lazy {
        SupportedLanguage(alias = "sml", displayName = "SML", import = sml)
    }
    val SML_Ml by lazy {
        SupportedLanguage(alias = "ml", displayName = "SML", import = sml)
    }

    val Stan by lazy {
        SupportedLanguage(alias = "stan", displayName = "Stan", import = stan)
    }
    val Stanfuncs by lazy {
        SupportedLanguage(alias = "stanfuncs", displayName = "Stan", import = stan)
    }

    val Stata by lazy {
        SupportedLanguage(alias = "stata", displayName = "Stata", import = stata)
    }

    val Stylus by lazy {
        SupportedLanguage(alias = "stylus", displayName = "Stylus", import = stylus)
    }
    val Styl by lazy {
        SupportedLanguage(alias = "styl", displayName = "Stylus", import = stylus)
    }

    val SubUnit by lazy {
        SupportedLanguage(alias = "subunit", displayName = "SubUnit", import = subunit)
    }

    val Swift by lazy {
        SupportedLanguage(alias = "swift", displayName = "Swift", import = swift)
    }

    val Tcl by lazy {
        SupportedLanguage(alias = "tcl", displayName = "Tcl", import = tcl)
    }
    val Tk by lazy {
        SupportedLanguage(alias = "tk", displayName = "Tcl", import = tcl)
    }

    val TestAnythingProtocol by lazy {
        SupportedLanguage(alias = "tap", displayName = "Test Anything Protocol", import = tap)
    }

    val Thrift by lazy {
        SupportedLanguage(alias = "thrift", displayName = "Thrift", import = thrift)
    }

    val TP by lazy {
        SupportedLanguage(alias = "tp", displayName = "TP", import = tp)
    }

    val Twig by lazy {
        SupportedLanguage(alias = "twig", displayName = "Twig", import = twig)
    }
    val CraftCMS by lazy {
        SupportedLanguage(alias = "craftcms", displayName = "Twig", import = twig)
    }

    val TypeScript by lazy {
        SupportedLanguage(alias = "typescript", displayName = "typescript", import = typescript)
    }
    val Ts by lazy {
        SupportedLanguage(alias = "ts", displayName = "typescript", import = typescript)
    }
    val Tsx by lazy {
        SupportedLanguage(alias = "tsx", displayName = "typescript", import = typescript)
    }
    val Mts by lazy {
        SupportedLanguage(alias = "mts", displayName = "typescript", import = typescript)
    }
    val Cts by lazy {
        SupportedLanguage(alias = "cts", displayName = "typescript", import = typescript)
    }

    val VBNet by lazy {
        SupportedLanguage(alias = "vbnet", displayName = "VB.Net", import = vbnet)
    }
    val Vb by lazy {
        SupportedLanguage(alias = "vb", displayName = "VB.Net", import = vbnet)
    }

    val VBScript by lazy {
        SupportedLanguage(alias = "vbscript", displayName = "VBScript", import = vbscript)
    }
    val Vbs by lazy {
        SupportedLanguage(alias = "vbs", displayName = "VBScript", import = vbscript)
    }

    val VHDL by lazy {
        SupportedLanguage(alias = "vhdl", displayName = "VHDL", import = vhdl)
    }

    val Vala by lazy {
        SupportedLanguage(alias = "vala", displayName = "Vala", import = vala)
    }

    val Verilog by lazy {
        SupportedLanguage(alias = "verilog", displayName = "Verilog", import = verilog)
    }
    val V by lazy {
        SupportedLanguage(alias = "v", displayName = "Verilog", import = verilog)
    }

    val VimScript by lazy {
        SupportedLanguage(alias = "vim", displayName = "Vim Script", import = vim)
    }

    val Axapta by lazy {
        SupportedLanguage(alias = "axapta", displayName = "X++", import = axapta)
    }
    val Xpp by lazy {
        SupportedLanguage(alias = "x++", displayName = "X++", import = axapta)
    }

    val x86Assembly by lazy {
        SupportedLanguage(alias = "x86asm", displayName = "x86 Assembly", import = x86asm)
    }

    val XL by lazy {
        SupportedLanguage(alias = "xl", displayName = "XL", import = xl)
    }
    val Tao by lazy {
        SupportedLanguage(alias = "tao", displayName = "XL", import = xl)
    }

    val XQuery by lazy {
        SupportedLanguage(alias = "xquery", displayName = "XQuery", import = xquery)
    }
    val XPath by lazy {
        SupportedLanguage(alias = "xpath", displayName = "XQuery", import = xquery)
    }
    val XQ by lazy {
        SupportedLanguage(alias = "xq", displayName = "XQuery", import = xquery)
    }
    val XQm by lazy {
        SupportedLanguage(alias = "xqm", displayName = "XQuery", import = xquery)
    }

    val Yml by lazy {
        SupportedLanguage(alias = "yml", displayName = "YAML", import = yaml)
    }
    val Yaml by lazy {
        SupportedLanguage(alias = "yaml", displayName = "YAML", import = yaml)
    }

    val Zephir by lazy {
        SupportedLanguage(alias = "zephir", displayName = "Zephir", import = zephir)
    }
    val Zep by lazy {
        SupportedLanguage(alias = "zep", displayName = "Zephir", import = zephir)
    }
}
