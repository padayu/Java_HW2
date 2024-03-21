package cart_problem;

import org.junit.jupiter.api.Test;
import org.junit.runners.Suite;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Class that tests the Cart class
 */
public class CartTester {

    /**
     * Test the constructor of the Cart class
     */
    @Test
    public void testCartConstructor() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
        });
    }

    /**
     * Test the printCoordinates method of the Cart class
     */
    @Test
    public void testPrintCoordinates() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.printCoordinates("Test");
        });
    }

    /**
     * Test the start method of the Cart class in mode 0
     */
    @Test
    public void testStartMode0() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.start(0);
        });
    }

    /**
     * Test the start method of the Cart class in mode 1
     */
    @Test
    public void testStartMode1() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.start(1);
        });
    }

    /**
     * Test the start method of the Cart class in mode 2
     */
    @Test
    public void testStartMode2() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.start(2);
        });
    }

    /**
     * Test the start method of the Cart class in mode 3
     */
    @Test
    public void testStartMode3() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.start(3);
        });
    }

    /**
     * Test the printFinalCoordinates method of the Cart class
     */
    @Test
    public void testPrintFinalCoordinatesOnce() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.printFinalCoordinates();
        });
    }

    /**
     * Test the printFinalCoordinates method of the Cart class by calling it twice
     */
    @Test
    public void testPrintFinalCoordinatesTwice() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.printFinalCoordinates();
            cart.printFinalCoordinates();
        });
    }

    /**
     * Test the moveCart method of the Cart class
     */
    @Test
    public void testMoveCart() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.moveCart(1, 1);
        });
    }
}
