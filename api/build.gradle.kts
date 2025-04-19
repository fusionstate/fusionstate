plugins {
    id("build.kotlin-jvm")
}

dependencies {
    api(project(":api:graphql"))
    api(project(":api:rest"))
}
