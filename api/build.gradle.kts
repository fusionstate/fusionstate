plugins {
    id("build.jvm")
}

dependencies {
    api(project(":api:graphql"))
    api(project(":api:rest"))
}
