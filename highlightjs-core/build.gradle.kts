import dev.tonholo.kotlin.wrapper.highlightjs.HighlightJsConfig

plugins {
    dev.tonholo.kotlin.wrapper.highlightjs.js.library
}

kotlin {
    sourceSets {
        jsMain.dependencies {
            implementation(libs.kotlin.wrappers)
            implementation(libs.kotlinx.coroutines.core.js)
            api(npm(name = "highlight.js", version = HighlightJsConfig.VERSION))
        }
    }
}

dependencies {

}
