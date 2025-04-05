plugins {
    id("build.jvm")
    application
}

dependencies {
    implementation(project(":shared:utils"))
    implementation(project(":api"))
}

application {
    mainClass = "io.fusionstate.app.AppKt"
}
