package cart_problem;

import static java.lang.Math.random;

/**
 * Class that implements the work of a creature
 */
public class Creature implements Runnable {
    /**
     * Angle of the creature's movement
     */
    protected double alpha;
    /**
     * Speed of the creature's movement
     */
    protected double s;
    /**
     * Object of the cart
     */
    protected Cart cart;

    /**
     * Constructor
     * @param alpha angle of the creature's movement
     * @param cart object of the cart
     */
    public Creature(int alpha, Cart cart) {
        this.alpha = Math.toRadians(alpha);
        this.s = random() * 9 + 1;
        this.cart = cart;
    }

    /**
     * Method that implements the work of a creature
     */
    @Override
    public void run() {
        // repeat until 25 seconds pass since the cart was created
        while (System.currentTimeMillis() - cart.getStartTime() < 25000) {
            try {
                cart.moveCart(s, alpha);
                Thread.sleep((int) (random() * 4000) + 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        cart.printFinalCoordinates();
    }
}
