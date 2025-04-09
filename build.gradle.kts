plugins {
    id("build.kotlin-jvm")
}

dependencies {
    kover(project(":shared:utils"))
    kover(project(":server"))
}
