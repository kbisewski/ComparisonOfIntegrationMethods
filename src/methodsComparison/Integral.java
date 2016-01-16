package methodsComparison;

/**
 * @author Karol Bisewski 16734
 */
public class Integral {
    
    PolynomialFunction polynomial;
    PolynomialFunction indefiniteIntegral;
    double begin;
    double end;

    Integral(PolynomialFunction polynomial, double begin, double end) {
        this.polynomial = polynomial;
        this.begin = begin;
        this.end = end;
        
    }
    
    private void ComputeIndefiniteIntegral() {
        int degree = polynomial.getDegree();
        int newDegree = degree + 1;
        double[] newCoefficients = new double[newDegree + 1];
        
        for(int i = newCoefficients.length - 1; i > 0; i--) {
            newCoefficients[i] = polynomial.getCoefficientStandingNextToVariableWithExponent(i - 1);
            if(newCoefficients[i] != 0) {
                newCoefficients[i] /= i;
            }
        }
        newCoefficients[0] = 0;
        indefiniteIntegral = new PolynomialFunction(newCoefficients);
    }
}
