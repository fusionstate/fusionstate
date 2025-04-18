plugins {
    application
    id("build.kotlin-jvm")
    id("com.google.cloud.tools.jib")
}

jib {
    from {
        image = "eclipse-temurin:21-jre-alpine"
    }
    container {
        creationTime.set("USE_CURRENT_TIMESTAMP")
        ports = listOf("8080")
    }
}
