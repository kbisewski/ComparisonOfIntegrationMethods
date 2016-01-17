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
        computeIndefiniteIntegral();
    }
    
    private void computeIndefiniteIntegral() {
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
    
    public double computeClassically() {
        double valueForBegin = indefiniteIntegral.getResultFor(begin);
        double valueForEnd = indefiniteIntegral.getResultFor(end);
        return valueForEnd - valueForBegin;
    }
    
    public double computeWithRectangleMethod(int amount) {
        double step = calculateStep(amount);
        double pointer = begin + step / 2;
        double result = 0;
        for(int i = 0 ; i < amount  ; i++) {
            double height = Math.abs(polynomial.getResultFor(pointer));
            result += height * step;
            pointer += step;
        }
        return result;
    }
    
    public double computeWithTrapezoidMethod(int amount) {
        double step = calculateStep(amount);
        double pointer = begin;
        double result = 0;
        for(int i = 0; i < amount; i++) {
            double firstHeight = Math.abs(polynomial.getResultFor(pointer));
            pointer += step;
            double secondHeight = Math.abs(polynomial.getResultFor(pointer));
            result += ((firstHeight + secondHeight) * step) / 2;
        }
        return result;
    }
    
    private double calculateStep(double amount) {
        double interval = end - begin;
        return interval / amount;
    }
}
