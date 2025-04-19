dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

include(":api")
include(":api:graphql")
include(":api:rest")
include(":capture")
include(":ingestion")
include(":server")
include(":shared:utils")
include(":shared:test-base")

rootProject.name = "fusionstate"
