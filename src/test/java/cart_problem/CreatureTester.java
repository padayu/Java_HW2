package cart_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Class that tests the creatures
 */
public class CreatureTester {

    /**
     * Test the constructor of the Swan class
     */
    @Test
    public void testSwanConstructor() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Swan swan = new Swan(cart);
        });
    }

    /**
     * Test the constructor of the Pike class
     */
    @Test
    public void testPikeConstructor() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Pike pike = new Pike(cart);
        });
    }

    /**
     * Test the constructor of the Crayfish class
     */
    @Test
    public void testCrayfishConstructor() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Crayfish crayfish = new Crayfish(cart);
        });
    }

    /**
     * Test the run method of the Swan class
     */
    @Test
    public void testSwanRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Swan swan = new Swan(cart);
            swan.run();
        });
    }

    /**
     * Test the run method of the Pike class
     */
    @Test
    public void testPikeRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Pike pike = new Pike(cart);
            pike.run();
        });
    }

    /**
     * Test the run method of the Crayfish class
     */
    @Test
    public void testCrayfishRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Crayfish crayfish = new Crayfish(cart);
            crayfish.run();
        });
    }
}
