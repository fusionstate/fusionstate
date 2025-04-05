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
    }
}

include(":server")
include(":api")
include(":api:graphql")
include(":api:rest")
include(":shared:utils")
include(":shared:test-base")

rootProject.name = "fusionstate"
