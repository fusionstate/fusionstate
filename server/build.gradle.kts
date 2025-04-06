plugins {
    id("build.kotlin-jvm")
    application
}

dependencies {
    implementation(project(":api"))
    implementation(project(":shared:utils"))
}

application {
    mainClass = "io.fusionstate.server.ServerKt"
}
