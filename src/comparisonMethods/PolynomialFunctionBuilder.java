package comparisonMethods;

import java.util.Scanner;

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
            degree = getIntegerFromUser();
            if (degree < 0) {
                System.out.print("\tDegree must be greater equal zero. Try again: ");
            }
        }while(degree < 0);
        return degree;
    }
    
    private static int getIntegerFromUser() {
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()) {
                input.next();
                System.out.print("\tDegree must be integer. Try again: ");
            }
            return input.nextInt();
    }
    
    private static double[] getCoefficientsFromUser(int degree) {
        double[] coefficients = new double[degree+1];
        for(int exponent = degree; exponent >= 0; exponent--) {
            System.out.print("Insert coefficient for x^" + exponent + ": ");
            coefficients[exponent] = getSingleCoefficientFromUser();
        }
        return coefficients;
    }
    
    private static double getSingleCoefficientFromUser() {
        Scanner input = new Scanner(System.in);
        while(!input.hasNextDouble()) {
            input.next();
            System.out.print("\tTry again: ");
        }
        double coefficient = input.nextDouble();
        return coefficient;
    }
}
