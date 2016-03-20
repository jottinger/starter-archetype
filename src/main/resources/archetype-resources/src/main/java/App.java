package ${package};

public class App {
    public static void main(String ... args) {
        System.out.printf("%s%n", new App().getGreeting());
    }

    public String getGreeting() {
        return "Hello, world";
    }
}