package methodsComparison;

/**
 * @author Karol Bisewski 16734
 */
public class ComparisonOfIntegrationMethods {

    public static void main(String[] args) {
        PolynomialFunction polynomial = PolynomialFunctionBuilder.create();
        Integral integral = IntegralBuilder.create(polynomial);
        
    }

}
