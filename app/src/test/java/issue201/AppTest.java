/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package issue201;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Order
    void appHasAGreeting() {
        ShoppingApp classUnderTest = new ShoppingApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
