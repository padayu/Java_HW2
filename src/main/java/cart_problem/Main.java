package cart_problem;

public class Main {
    /**
     * mode = 0 - safety system is off
     * mode = 1 - camera is on, movement sensor is off
     * mode = 2 - camera is off, movement sensor is on
     * mode = 3 - camera is on, movement sensor is on
     */
    private static int mode;
    /**
     * movementSensorMode - the number of moves the movement sensor needs to detect
     * before printing the coordinates
     */
    private static int movementSensorMode;

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        if (args.length != 1 && args.length != 2) {
            System.out.println("Неверный формат аргументов, необходимо ввести число от 0 до 3 для \n" +
                    "выбора противоугонных систем и режим работы датчика движения в виде числа от \n" +
                    "0 до 25 в случае, если он включен.");
            return;
        }
        try {
            mode = Integer.parseInt(args[0]);
        } catch (NumberFormatException exception) {
            System.out.println("Неверный формат аргументов, первым аргументом необходимо \n" +
                    "ввести число от 0 до 3 для выбора противоугонных систем");
            return;
        }
        if (mode < 0 || mode > 3) {
            System.out.println("Неверный формат аргументов, первым аргументом необходимо \n" +
                    "ввести число от 0 до 3 для выбора противоугонных систем");
            return;
        }
        if (mode == 2 || mode == 3) {
            if (args.length != 2) {
                System.out.println("Неверный формат аргументов, вторым аргументом необходимо \n" +
                        "ввести число от 0 до 25 для выбора режима работы датчика движения");
                return;
            } else {
                try {
                    movementSensorMode = Integer.parseInt(args[1]);
                } catch (NumberFormatException exception) {
                    System.out.println("Неверный формат аргументов, вторым аргументом необходимо \n" +
                            "ввести число от 0 до 25 для выбора режима работы датчика движения");
                    return;
                }
                if (movementSensorMode < 1 || movementSensorMode > 25) {
                    System.out.println("Неверный формат аргументов, вторым аргументом необходимо \n" +
                            "ввести число от 0 до 25 для выбора режима работы датчика движения");
                    return;
                }
            }
        }


        Cart cart = new Cart(movementSensorMode);
        cart.start(mode);
    }
}