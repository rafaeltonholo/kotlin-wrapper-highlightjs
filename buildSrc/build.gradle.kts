plugins {
    `kotlin-dsl`
}

kotlin {
    explicitApi()
}

dependencies {
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.buildkonfig.compiler)
    implementation(libs.buildkonfig.gradle.plugin)
}

