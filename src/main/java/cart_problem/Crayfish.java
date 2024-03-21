package cart_problem;

import static java.lang.Math.random;

/**
 * Class that implements the work of a crayfish
 */
public class Crayfish extends Creature implements Runnable {
    /**
     * Constructor
     * @param cart object of the cart
     */
    public Crayfish(Cart cart) {
        super(180, cart);
    }
}
