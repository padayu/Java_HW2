package cart_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Class that tests the safety systems
 */
public class SafetySystemTester {
    /**
     * Test the constructor of the Camera class
     */
    @Test
    public void testCameraConstructor() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Camera camera = new Camera(cart);
        });
    }

    /**
     * Test the run method of the Camera class
     */
    @Test
    public void testCameraRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            Camera camera = new Camera(cart);
            camera.run();
        });
    }

    /**
     * Test the run method of the Camera class with multiple cameras
     */
    @Test
    public void testMultipleCamerasRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            for (int i = 0; i < 100; i++) {
                new Camera(cart).run();
            }
        });
    }

    /**
     * Test the constructor of the MovementSensor class
     */
    @Test
    public void testMovementSensorConstructor() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            MovementSensor motionSensor = new MovementSensor(10, cart);
        });
    }

    /**
     * Test the run method of the MovementSensor class
     */
    @Test
    public void testMovementSensorRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            MovementSensor motionSensor = new MovementSensor(10, cart);
            motionSensor.run();
        });
    }

    /**
     * Test the run method of the MovementSensor class with multiple movement sensors
     */
    @Test
    public void testMultipleMovementSensorsRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            for (int i = 0; i < 100; i++) {
                new MovementSensor(10, cart).run();
            }
        });
    }

    /**
     * Test the run method of the Camera and MovementSensor classes with a lot of
     * them running together with a cart
     */
    @Test
    public void testALotOfStuffRun() {
        assertDoesNotThrow(() -> {
            Cart cart = new Cart(5);
            cart.start(3);
            for (int i = 0; i < 100; i++) {
                new Camera(cart).run();
                new MovementSensor(10, cart).run();
            }
        });
    }
}
