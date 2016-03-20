package ${package};

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AppTest {
    @Test
    public void testGreeting() {
        App app=new App();
        assertThat(app.getGreeting(), is("Hello, world"));
    }
}