package methodsComparison;

import java.util.Scanner;

/**
 * @author Karol Bisewski 16734
 */
public class Input {

    static int getIntegerFromUser() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            input.next();
            System.out.print("\tIt must be an integer. Try again: ");
        }
        return input.nextInt();
    }

    static double getDoubleFromUser() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextDouble()) {
            input.next();
            System.out.print("\tIt must be a real number. Try again: ");
        }
        return input.nextDouble();
    }

}
