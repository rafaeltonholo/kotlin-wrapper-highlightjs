plugins {
    dev.tonholo.kotlin.wrapper.highlightjs.js.library
}

kotlin {
    sourceSets {
        jsMain.dependencies {
            implementation(libs.kotlin.wrappers)
            implementation(libs.kotlinx.coroutines.core.js)
            api(npm(name = "highlight.js", version = "11.9.0"))
        }
    }
}

dependencies {

}
