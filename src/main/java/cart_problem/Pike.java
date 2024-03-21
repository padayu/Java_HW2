package cart_problem;

import static java.lang.Math.random;

/**
 * Class that implements the work of a pike
 */
public class Pike extends Creature implements Runnable {
    /**
     * Constructor
     * @param cart object of the cart
     */
    public Pike(Cart cart) {
        super(300, cart);
    }
}
