plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.jib.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.kotlinx.kover.gradle.plugin)
    implementation(libs.spotless.gradle.plugin)
}
