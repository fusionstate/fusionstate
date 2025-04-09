[![FusionState](./assets/header.png)](https://fusionstate.io)
[![Build status](https://github.com/fusionstate/fusionstate/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/fusionstate/fusionstate/actions/workflows/build.yml)
[![Apache License 2](https://img.shields.io/github/license/fusionstate/fusionstate)](https://www.apache.org/licenses/LICENSE-2.0.txt)

## FusionState
Congratulations! You've found the solution to your problems. FusionState takes 
away your pain and lets you enjoy life again. Want to know how? Check out the 
following links to learn more.

**[Website](https://fusionstate.io) &bull;**
**[Examples](https://fusionstate.io) &bull;**
**[Demo](https://fusionstate.io)**

## Build
This project uses [Gradle](https://gradle.org/).
To build and run the application, run the following commands from the terminal:

* Run `./gradlew run` to build and run the application.
* Run `./gradlew build` to only build the application.
* Run `./gradlew check` to run all checks, including tests.
* Run `./gradlew clean` to clean all build outputs.

Note the usage of the Gradle Wrapper (`./gradlew`).
This is the suggested way to use Gradle in production projects.

This project uses a version catalog (see `gradle/libs.versions.toml`) to declare
and version dependencies and both a build cache and a configuration cache 
(see `gradle.properties`).

## License
FusionState is Open Source software released under the [Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.html).
