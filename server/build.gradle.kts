plugins {
    id("build.kotlin-jvm")
    application
}

dependencies {
    implementation(project(":api"))
    implementation(project(":shared:utils"))
    testImplementation(project(":shared:test-base"))
}

application {
    mainClass = "io.fusionstate.server.ServerKt"
}
