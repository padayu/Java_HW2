package cart_problem;

/**
 * Class that implements the work of a movement sensor
 */
public class MovementSensor implements Runnable {

    /**
     * Field storing the number of movements that the sensor needs to detect to output the coordinates
     */
    private int moveLimit;
    /**
     * Field storing the number of detected movements
     */
    private Integer moves;
    /**
     * Field storing the cart object
     */
    private Cart cart;

    /**
     * Constructor
     * @param moveLimit the number of moves the movement sensor needs to detect before printing the coordinates
     * @param cart object of the cart
     */
    public MovementSensor(int moveLimit, Cart cart) {
        this.moveLimit = moveLimit;
        moves = 0;
        this.cart = cart;
    }

    /**
     * Method for incrementing the number of detected movements
     */
    synchronized public void incrementMoves() {
        moves++;
    }

    /**
     * Method that simulates the work of a movement sensor
     */
    @Override
    public void run() {
        while (System.currentTimeMillis() - cart.getStartTime() < 25000) {
            // wait until the cart moves moveLimit times then print the coordinates and reset the counter
            try {
                synchronized (this) {
                    while (moves < moveLimit && System.currentTimeMillis() - cart.getStartTime() < 25000) {
                        wait(500);
                    }
                    if (System.currentTimeMillis() - cart.getStartTime() >= 25000) {
                        return;
                    }
                }
                cart.printCoordinates("Movement sensor");
                moves = 0;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
