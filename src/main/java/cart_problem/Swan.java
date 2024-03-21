package cart_problem;

import static java.lang.Math.random;

/**
 * Class that implements the work of a swan
 */
public class Swan extends Creature implements Runnable {
    /**
     * Constructor
     * @param cart object of the cart
     */
    public Swan(Cart cart) {
        super(60, cart);
    }
}
