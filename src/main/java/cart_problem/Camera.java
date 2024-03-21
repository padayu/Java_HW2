package cart_problem;

/**
 * Class that implements the work of a camera
 */
public class Camera implements Runnable {
    private Cart cart;

    /**
     * Constructor
     * @param cart object of the cart
     */
    Camera(Cart cart) {
        this.cart = cart;
    }

    /**
     * Method that simulates the work of a camera
     */
    @Override
    public void run() {
        while (System.currentTimeMillis() - cart.getStartTime() < 25000) {
            try {
                cart.printCoordinates("Camera");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
