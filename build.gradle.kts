subprojects {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
    }
}

allprojects {
    group = "dev.tonholo.kotlin.wrapper.highlightjs"
    version = "1.0.0-11.9.0"
}
