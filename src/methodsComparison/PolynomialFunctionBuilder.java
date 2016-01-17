package methodsComparison;

/**
 * @author Karol Bisewski 16734
 */
public class PolynomialFunctionBuilder {
    
    public static PolynomialFunction create() {
        int degree = getDegreeFromUser();
        double[] coefficients = getCoefficientsFromUser(degree);
        return new PolynomialFunction(coefficients);
    }
    
    private static int getDegreeFromUser() {
        System.out.print("Please insert degree of polynomial function: ");
        int degree;
        do{
            degree = Input.getIntegerFromUser();
            if (degree < 0) {
                System.out.print("\tDegree must be greater equal zero. Try again: ");
            }
        }while(degree < 0);
        return degree;
    }
    
    private static double[] getCoefficientsFromUser(int degree) {
        double[] coefficients = new double[degree+1];
        for(int exponent = degree; exponent >= 0; exponent--) {
            System.out.print("Insert coefficient standing next to x^" + exponent + ": ");
            coefficients[exponent] = Input.getDoubleFromUser();
        }
        return coefficients;
    }
    
}
