package cart_problem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MainTester {

    /**
     * Test the main method of the Main class with no parameters
     */
    @Test
    public void testMainNoParams() {
        assertDoesNotThrow(() -> {
            Main.main(new String[0]);
        });
    }

    /**
     * Test the main method of the Main class with one correct parameter
     */
    @Test
    public void testMainOneCorrectParam() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"0"});
        });
    }

    /**
     * Test the main method of the Main class with one unsupported parameter
     */
    @Test
    public void testMainOneUnsupportedParam() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"-1"});
        });
    }

    /**
     * Test the main method of the Main class with one parameter when two are required
     */
    @Test
    public void testMainOneParamOutOfTwo() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"3"});
        });
    }

    /**
     * Test the main method of the Main class with two correct parameters
     */
    @Test
    public void testMainTwoCorrectParams() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"3", "5"});
        });
    }

    /**
     * Test the main method of the Main class with two incorrect parameters
     */
    @Test
    public void testMainTwoIncorrectParams() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"-8", "26"});
        });
    }

    /**
     * Test the main method of the Main class with the second parameter being incorrect
     */
    @Test
    public void testMainSecondIncorrectParam() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"3", "0"});
        });
    }

    /**
     * Test the main method of the Main class with too many parameters
     */
    @Test
    public void testMainTooManyParams() {
        assertDoesNotThrow(() -> {
            Main.main(new String[]{"3", "5", "7"});
        });
    }
}
