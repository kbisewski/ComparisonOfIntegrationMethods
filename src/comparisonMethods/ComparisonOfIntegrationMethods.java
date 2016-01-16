package comparisonMethods;

/**
 * @author Karol Bisewski 16734
 */
public class ComparisonOfIntegrationMethods {

    public static void main(String[] args) {
        PolynomialFunction polynomial = PolynomialFunctionBuilder.create();
        double y = polynomial.getResultFor(5);
        System.out.println("" + y);
    }

}
