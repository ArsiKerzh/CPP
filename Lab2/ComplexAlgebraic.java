package pack1;
import  java.util.*;

public class ComplexAlgebraic extends Complex{
    private double realPart;
    private double imaginaryPart;

    public ComplexAlgebraic() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter real part:");
        realPart=reader.nextInt();
        System.out.println("Enter imaginary part:");
        imaginaryPart=reader.nextInt();
    }

    public ComplexAlgebraic(double realPart, double imaginaryPart) {
        this.realPart=realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart=realPart;
    }

    public  void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart=imaginaryPart;
    }

    public ComplexAlgebraic addFunc(ComplexAlgebraic number1, ComplexAlgebraic number2) {
        ComplexAlgebraic result = new ComplexAlgebraic(number1.realPart+number2.realPart,
                number1.imaginaryPart+number2.imaginaryPart);
        return result;
    }

    public ComplexAlgebraic subFunc(ComplexAlgebraic number1, ComplexAlgebraic number2) {
        ComplexAlgebraic result = new ComplexAlgebraic(number1.realPart-number2.realPart,
                number1.imaginaryPart-number2.imaginaryPart);
        return result;
    }
}