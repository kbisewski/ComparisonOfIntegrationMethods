package methodsComparison;

/**
 * @author Karol Bisewski 16734
 */
public class IntegralBuilder {
    
    public static Integral create(PolynomialFunction polynomial) {
        double[] interval = getIntervalFromUser();
        return new Integral(polynomial, interval[0], interval[1]);
    }
    
    private static double[] getIntervalFromUser() {
        System.out.println("The function will be integrated on the interval from a to b.");
        double begin;
        double end;
        do{
            begin = getBeginFromUser();
            end = getEndFromUser();
            if(begin > end) {
                System.out.println("\tB must be greater equal a. Try again.");
            }
        }while(begin > end);
        double[] interval = {begin, end};
        return interval;
    }
    
    private static double getBeginFromUser() {
        System.out.print("Insert a: ");
        return Input.getDoubleFromUser();
    }
    
    private static double getEndFromUser() {
        System.out.print("Insert b: ");
        return Input.getDoubleFromUser();
    }
}
