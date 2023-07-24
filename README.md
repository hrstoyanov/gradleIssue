
# Issue #201
I marked some section in **app/build.gradle** and **gradle.properties** with 'Comment me!!!'. 
Try commenting them out, change the test.tpl, sun the app,  and see the effect.

You need to have Java 17+ installed, check you JAVA_HOME.

Open this as a Gradle project in IntelliJ and use the 'Run anything' to run gradle with these commands (or just use terminal):

To run the app (Mac/Linux)
> ./gradlew run

To run the app (Windows)
> gradle run

Show dependencies tree, see [this](https://docs.gradle.org/current/userguide/viewing_debugging_dependencies.html):
> ./gradlew dependencies compileClasspath


Here is a brief description of the most common Gradle configurations:

compileClasspath: This configuration contains the dependencies that are needed to compile the project.

implementation: This configuration contains the dependencies that are needed to run the project.

runtimeClasspath: This configuration contains the dependencies that are needed to run the project, including the compile-time dependencies.

testCompileClasspath: This configuration contains the dependencies that are needed to compile the tests for the project.

testImplementation: This configuration contains the dependencies that are needed to run the tests for the project.

testRuntimeClasspath: This configuration contains the dependencies that are needed to run the tests for the project, including the compile-time dependencies.
