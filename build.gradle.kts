import dev.tonholo.kotlin.wrapper.highlightjs.KotlinWrapperHighlightJsConfig

subprojects {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
    }
}

allprojects {
    group = KotlinWrapperHighlightJsConfig.GROUP
    version = KotlinWrapperHighlightJsConfig.VERSION
}
