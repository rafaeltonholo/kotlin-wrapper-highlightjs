plugins {
    kotlin("multiplatform")
    id("npm-conventions")
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

//    sourceSets {
//        commonMain.dependencies {
//            implementation(libs.kotlin.wrappers)
//        }
//        jsMain.dependencies {
//            api(npm(name = "highlight.js", version = "11.9.0"))
//        }
//    }
}
