plugins {
    dev.tonholo.kotlin.wrapper.highlightjs.js.library
    alias(libs.plugins.jetbrains.compose)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
        }
        jsMain.dependencies {
            implementation(compose.html.core)
            implementation(libs.kotlinx.coroutines.core.js)
            implementation(projects.highlightjsCore)
        }
    }
}

dependencies {

}
