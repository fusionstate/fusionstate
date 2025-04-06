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

include(":api")
include(":api:graphql")
include(":api:rest")
include(":server")
include(":shared:utils")
include(":shared:test-base")

rootProject.name = "fusionstate"
