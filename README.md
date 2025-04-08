[![FusionState](./assets/header.png)](https://fusionstate.io)
Congratulations! You found the solution to your problems. FusionState removes 
your pain and lets you enjoy life again. Wanna know how? Read our docs to 
learn more.

## Build
This project uses [Gradle](https://gradle.org/).
To build and run the application, use the *Gradle* tool window by clicking the
Gradle icon in the right-hand toolbar,
or run it directly from the terminal:

* Run `./gradlew run` to build and run the application.
* Run `./gradlew build` to only build the application.
* Run `./gradlew check` to run all checks, including tests.
* Run `./gradlew clean` to clean all build outputs.

Note the usage of the Gradle Wrapper (`./gradlew`).
This is the suggested way to use Gradle in production projects.

[Learn more about the Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html).

[Learn more about Gradle tasks](https://docs.gradle.org/current/userguide/command_line_interface.html#common_tasks).

This project follows the suggested multi-module setup and consists of the `app`
and `utils` subprojects.
The shared build logic was extracted to a convention plugin located in
`buildSrc`.

This project uses a version catalog (see `gradle/libs.versions.toml`) to declare
and version dependencies
and both a build cache and a configuration cache (see `gradle.properties`).

## License
We use the `FSL-1.1-ALv2` **Fair Source** license. Here is a short summary:
- you can use the software for free (also for commercial projects)
- the only restriction is that you are not allowed to use it for competing products (e.g. offer FusionState as a hosted cloud service)
- after 2 years the license changes to Apache License V2
