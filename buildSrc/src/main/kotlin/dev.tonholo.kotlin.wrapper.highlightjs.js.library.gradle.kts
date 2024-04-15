import com.codingfeline.buildkonfig.compiler.FieldSpec
import dev.tonholo.kotlin.wrapper.highlightjs.HighlightJsConfig
import dev.tonholo.kotlin.wrapper.highlightjs.KotlinWrapperHighlightJsConfig

plugins {
    kotlin("multiplatform")
    id("npm-conventions")
    id("com.codingfeline.buildkonfig")
}

kotlin {
    js {
        browser {
            commonWebpackConfig {
                outputFileName = group.toString().replace('.', '-') + ".js"
            }
        }
        binaries.executable()
    }
}

buildkonfig {
    packageName = KotlinWrapperHighlightJsConfig.GROUP.plus(".core")

    defaultConfigs {
        buildConfigField(FieldSpec.Type.STRING, "HIGHLIGHTJS_VERSION", HighlightJsConfig.VERSION)
    }
}
