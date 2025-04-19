# FusionState

[![Build Status](https://img.shields.io/github/check-runs/fusionstate/fusionstate/main)](https://github.com/fusionstate/fusionstate/actions/workflows/build.yml)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=fusionstate_fusionstate&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=fusionstate_fusionstate)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=fusionstate_fusionstate&metric=coverage)](https://sonarcloud.io/summary/new_code?id=fusionstate_fusionstate)

FusionState is a data access layer for event-driven distributed systems. Most commonly used in microservice architectures, it provides a scalable solution for sharing data between services and applications in real-time. Check out our [website](https://fusionstate.io) to learn more.

### Build
This project uses [Gradle](https://gradle.org/). To test and build the project, use the following commands:

* Run `./gradlew check` to run all checks, including tests.
* Run `./gradlew build` to build the modules.
* Run `./gradlew jibDockerBuild` to build the application containers.
* Run `./gradlew clean` to clean all build outputs.

### License
FusionState is Open Source software released under the [Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.html).
