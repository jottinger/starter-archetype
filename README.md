# starter-archetype
This is a basic maven archetype for Java 8 projects.

It is based on a sandbox project I create whenever I try to show off a feature, and includes basic settings and dependencies that I find myself adding consistently.

It includes guava 19.0 as a runtime dependency, lombok as a provided dependency (used only during compilation), and TestNG, Hamcrest, and H2 as testing dependencies.

Using it is simple: after installing the archetype locally (with `mvn install`), you can use it by invoking the following command:

    mvn archetype:generate \
        -DarchetypeGroupId=com.autumncode \
        -DarchetypeArtifactId=starter-archetype \
        -DarchetypeVersion=1.0-SNAPSHOT
