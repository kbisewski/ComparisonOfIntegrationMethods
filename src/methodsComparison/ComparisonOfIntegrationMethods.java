package methodsComparison;

/**
 * @author Karol Bisewski 16734
 */
public class ComparisonOfIntegrationMethods {

    public static void main(String[] args) {
        PolynomialFunction polynomial = PolynomialFunctionBuilder.create();
        Integral integral = IntegralBuilder.create(polynomial);
        int amountOfSubintervals = getAmountOfSubintervalsFromUser();
        System.out.println("Classic method: " + integral.computeClassically());
        System.out.println("Rectangle method: " + integral.computeWithRectangleMethod(amountOfSubintervals));
        System.out.println("Trapezoid method: " + integral.computeWithTrapezoidMethod(amountOfSubintervals));
    }

    static int getAmountOfSubintervalsFromUser() {
        System.out.println("In rectangle and trapezoid methods the function is to be integrated is divided into N equal subintervals.");
        System.out.print("Insert N: ");
        int amountOfSubintervals;
        do{
            amountOfSubintervals = Input.getIntegerFromUser();
            if(amountOfSubintervals < 1) {
                System.out.println("\tIt must be greater equal 1. Try again: ");
            }
        }while(amountOfSubintervals < 1);
        return amountOfSubintervals;
    }
}
