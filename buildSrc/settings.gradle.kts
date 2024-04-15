rootProject.name = "kotlin-wrapper-highlightjs-buildSrc"
dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    // Provide access to version catalog in buildSrc
    // https://github.com/gradle/gradle/issues/15383
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
