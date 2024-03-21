package cart_problem;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 * A class representing a cart that moves in a 2D plane.
 */
public class Cart {
    /**
     * The x and y coordinates of the cart.
     */
    private double x, y;
    /**
     * The camera, movement sensor, swan, crayfish, and pike objects associated with the cart.
     */
    private final Camera camera;
    private final MovementSensor movementSensor;
    private final Swan swan;
    private final Crayfish crayfish;
    private final Pike pike;
    /**
     * The time when the cart was started.
     */
    private long startTime;
    /**
     * A flag indicating whether the cart has stopped.
     */
    private boolean stopped;
    /**
     * Movement sensor procs every moveLimit moves.
     */
    private final int moveLimit;

    /**
     * Constructs a new cart with the given move limit.
     *
     * @param moveLimit the move limit
     */
    public Cart(int moveLimit) {
        x = 0;
        y = 0;

        this.moveLimit = moveLimit;

        camera = new Camera(this);
        movementSensor = new MovementSensor(this.moveLimit, this);

        swan = new Swan(this);
        crayfish = new Crayfish(this);
        pike = new Pike(this);

        stopped = false;
    }

    /**
     * Prints the coordinates of the cart.
     *
     * @param source
     */
    synchronized public void printCoordinates(String source) {
        System.out.println(source);
        System.out.println("X = " + String.format("%.2f", x));
        System.out.println("Y = " + String.format("%.2f", y));
    }

    /**
     * Starts the cart in the given mode.
     *
     * @param mode
     */
    public void start(int mode) {
        startTime = System.currentTimeMillis();
        if (mode == 1 || mode == 3) {
            new Thread(camera).start();
        }
        if (mode == 2 || mode == 3) {
            new Thread(movementSensor).start();
        }
        new Thread(swan).start();
        new Thread(crayfish).start();
        new Thread(pike).start();
    }

    /**
     * Prints the final coordinates of the cart.
     */
    synchronized public void printFinalCoordinates() {
        if (stopped) {
            return;
        }
        printCoordinates("Final coordinates");
        stopped = true;
    }

    /**
     * Moves the cart by the given distance and angle.
     *
     * @param s
     * @param alpha
     */
    synchronized public void moveCart(double s, double alpha) {
        x = x + s * cos(alpha);
        y = y + s * sin(alpha);
        movementSensor.incrementMoves();
        // notify the movement sensor that the cart has moved
        synchronized (movementSensor) {
            movementSensor.notify();
        }
    }

    /**
     * Returns the start time of the cart.
     *
     * @return the start time
     */
    public long getStartTime() {
        return startTime;
    }
}
