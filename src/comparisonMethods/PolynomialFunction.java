package comparisonMethods;

/**
  @author Karol Bisewski 16734
 */
public class PolynomialFunction{
 
    double[] coefficients;

    PolynomialFunction(double[] numbers) {
        this.coefficients = numbers;
    }
    
    public double getResultFor(double x) {
        double result = 0;
        for(int exponent = 0; exponent < coefficients.length; exponent++) {
            result += coefficients[exponent] * Math.pow(x, exponent);
        }
        return result;
    }
    
}
