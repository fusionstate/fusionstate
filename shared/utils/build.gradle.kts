plugins {
    id("build.jvm")
    alias(libs.plugins.kotlin.plugin.serialization)
}

dependencies {
    implementation(libs.bundles.kotlinx.ecosystem)
    testImplementation(project(":shared:test-base"))
}
