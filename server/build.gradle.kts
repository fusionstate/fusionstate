plugins {
    id("build.kotlin-jvm")
    application
}

dependencies {
    implementation(project(":shared:utils"))
    implementation(project(":api"))
}

application {
    mainClass = "io.fusionstate.server.ServerKt"
}
