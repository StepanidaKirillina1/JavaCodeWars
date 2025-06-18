import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SayHalloTest {

    @Test
    public void testSayHallo() {
        assertTrue(SayHallo.validateHello("hello"));
        assertTrue(SayHallo.validateHello("ciao bella!"));
        assertTrue(SayHallo.validateHello("salut"));
        assertTrue(SayHallo.validateHello("hallo, salut"));
        assertTrue(SayHallo.validateHello("hombre! Hola!"));
        assertTrue(SayHallo.validateHello("Hallo, wie geht\'s dir?"));
        assertTrue(SayHallo.validateHello("AHOJ!"));
        assertTrue(SayHallo.validateHello("czesc"));
        assertTrue(SayHallo.validateHello("Ahoj"));
        assertFalse(SayHallo.validateHello("meh"));
    }
}
