package methodsComparison;

/**
 * @author Karol Bisewski 16734
 */
public class ComparisonOfIntegrationMethods {

    public static void main(String[] args) {
        PolynomialFunction polynomial = PolynomialFunctionBuilder.create();
        Integral integral = IntegralBuilder.create(polynomial);
        int amountOfSubintervals = getAmountOfSubintervalsFromUser();
        
        double exactValue = integral.computeClassically();
        System.out.println("Classic method result: " + exactValue);
        drawLine(20);
        
        double rectangleMethodResult = integral.computeWithRectangleMethod(amountOfSubintervals);
        System.out.println("Rectangle method result: " + rectangleMethodResult);
        System.out.println("Absolute error: " + computeAbsoluteError(exactValue, rectangleMethodResult));
        System.out.println("Relative error: " + computeRelativeError(exactValue, rectangleMethodResult));
        drawLine(20);
        
        double trapezoidMethodResult = integral.computeWithTrapezoidMethod(amountOfSubintervals);
        System.out.println("Trapezoid method result: " + trapezoidMethodResult);
        System.out.println("Absolute error: " + computeAbsoluteError(exactValue, trapezoidMethodResult));
        System.out.println("Relative error: " + computeRelativeError(exactValue, trapezoidMethodResult));
        drawLine(20);
        
        
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
    
    static double computeAbsoluteError(double exact, double approx) {
        return Math.abs(exact - approx);
    }
    
    static double computeRelativeError(double exact, double approx) {
        return Math.abs((exact - approx) / exact);
    }
    
    static void drawLine(int a) {
        for(int i = 0; i < a; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    
    
}
