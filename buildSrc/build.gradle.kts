plugins {
    `kotlin-dsl`
}

kotlin {
    explicitApi()
}

dependencies {
    implementation(libs.kotlin.gradlePlugin)
}

