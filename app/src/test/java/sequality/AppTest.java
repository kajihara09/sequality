/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testAppReternHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello World", classUnderTest.getGreeting());
    }
}
