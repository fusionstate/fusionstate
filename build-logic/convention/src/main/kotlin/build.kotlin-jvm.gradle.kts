import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    kotlin("jvm")
    id("com.diffplug.spotless")
    id("org.jetbrains.kotlinx.kover")
}

kotlin {
    jvmToolchain(21)
}

kover {
    reports {
        total {
            xml { onCheck = true }
            html { onCheck = false }
        }
    }
}

spotless {
    kotlin {
        ktlint()
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()

    testLogging {
        events(
            TestLogEvent.FAILED,
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED
        )
    }
}
