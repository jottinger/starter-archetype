# starter-archetype
This is a basic maven archetype for Java 8 projects.

It is based on a sandbox project I create whenever I try to show off a feature, and includes basic settings and dependencies that I find myself adding consistently.

It includes [guava](https://github.com/google/guava) as a runtime dependency, [lombok](https://projectlombok.org/) as a provided dependency (used only during compilation), and [TestNG](http://testng.org/doc/index.html), [Hamcrest](http://hamcrest.org/), and [H2](http://www.h2database.com/html/main.html) as testing dependencies.

It also sets the project JDK to Java 8, and includes Maven's shade plugin to generate an executable jar.

Using it is simple: after installing the archetype locally (with `mvn install`), you can use it by invoking the following command:

    mvn archetype:generate \
        -DarchetypeGroupId=com.autumncode \
        -DarchetypeArtifactId=starter-archetype \
        -DarchetypeVersion=1.0-SNAPSHOT
