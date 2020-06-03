package pack1;
import java.util.*;

public class ComplexAlgebraic extends AbstractComplex<ComplexAlgebraic>{
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

    public ComplexExponential toComplexExponential(ComplexAlgebraic number) {
        ComplexExponential result = new ComplexExponential(Math.sqrt(Math.pow(number.realPart,2)+Math.pow(number.imaginaryPart,2)),
                Math.atan(number.imaginaryPart/number.realPart));
        return result;
    }

    @Override
    public ComplexAlgebraic addFunc(ComplexAlgebraic number1, ComplexAlgebraic number2) {
        ComplexAlgebraic result = new ComplexAlgebraic(number1.realPart+number2.realPart,
                number1.imaginaryPart+number2.imaginaryPart);
        return result;
    }

    @Override
    public ComplexAlgebraic subFunc(ComplexAlgebraic number1, ComplexAlgebraic number2) {
        ComplexAlgebraic result = new ComplexAlgebraic(number1.realPart-number2.realPart,
                number1.imaginaryPart-number2.imaginaryPart);
        return result;
    }

    @Override
    public ComplexAlgebraic mulFunc(ComplexAlgebraic number1, ComplexAlgebraic number2) {
        ComplexAlgebraic result = new ComplexAlgebraic(number1.realPart*number2.realPart-number1.imaginaryPart*number2.imaginaryPart,
                number1.realPart*number2.imaginaryPart+number1.imaginaryPart*number2.realPart);
        return result;
    }

    @Override
    public ComplexAlgebraic divFunc(ComplexAlgebraic number1, ComplexAlgebraic number2) {
        ComplexAlgebraic result = new ComplexAlgebraic((number1.realPart*number2.realPart+number1.imaginaryPart*number2.imaginaryPart)/
                (Math.pow(number2.realPart,2)+Math.pow(number2.imaginaryPart,2)),
                (number2.realPart*number1.imaginaryPart-number2.imaginaryPart*number1.realPart)/
                        (Math.pow(number2.realPart,2)+Math.pow(number2.imaginaryPart,2)));
        return result;
    }
}