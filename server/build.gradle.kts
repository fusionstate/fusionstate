plugins {
    id("build.kotlin-application")
}

dependencies {
    implementation(project(":api"))
    implementation(project(":capture"))
    implementation(project(":shared:utils"))
    testImplementation(project(":shared:test-base"))
}

application {
    mainClass = "io.fusionstate.server.ServerKt"
}
