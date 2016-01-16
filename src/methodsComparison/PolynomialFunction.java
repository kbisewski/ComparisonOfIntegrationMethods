package methodsComparison;

/**
  @author Karol Bisewski 16734
 */
public class PolynomialFunction extends Function{
 
    private double[] coefficients;

    public PolynomialFunction(double[] numbers) {
        this.coefficients = numbers;
    }
    
    public double getResultFor(double x) {
        double result = 0;
        for(int exponent = 0; exponent < coefficients.length; exponent++) {
            result += coefficients[exponent] * Math.pow(x, exponent);
        }
        return result;
    }
    
    int getDegree() {
        int degree = coefficients.length - 1;
        return degree;
    }
    
    double getCoefficientStandingNextToVariableWithExponent(int exponent) {
        double coefficient = coefficients[exponent];
        return coefficient;
    }
}
