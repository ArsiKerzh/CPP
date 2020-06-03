package pack1;

import java.util.Scanner;

public class ComplexExponential extends AbstractComplex<ComplexExponential>{
    private double absValue;
    private double angle;

    public ComplexExponential() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter absolute value:");
        absValue=reader.nextInt();
        System.out.println("Enter angle:");
        angle=reader.nextInt();
    }

    public ComplexExponential(double absValue, double angle) {
        this.absValue=absValue;
        this.angle = angle;
    }

    public double getAbsValue() {
        return absValue;
    }

    public double getAngle() {
        return angle;
    }

    public void setAbsValue(double absValue) {
        this.absValue=absValue;
    }

    public void setAngle(double angle) {
        this.angle=angle;
    }

    public ComplexAlgebraic toComplexAlgebraic(ComplexExponential number) {
        ComplexAlgebraic result = new ComplexAlgebraic(number.absValue*Math.cos(number.angle),
                number.absValue*Math.sin(number.angle));
        return result;
    }

    @Override
    public ComplexExponential addFunc(ComplexExponential exponentialNumber1, ComplexExponential exponentialNumber2) {
        ComplexAlgebraic algebraicNumber1 = toComplexAlgebraic(exponentialNumber1);
        ComplexAlgebraic algebraicNumber2 = toComplexAlgebraic(exponentialNumber2);
        ComplexAlgebraic complexResult = new ComplexAlgebraic(algebraicNumber1.getRealPart()+algebraicNumber2.getRealPart(),
                algebraicNumber1.getImaginaryPart()+algebraicNumber2.getImaginaryPart());
        ComplexExponential exponentialResult = complexResult.toComplexExponential(complexResult);
        return exponentialResult;
    }

    @Override
    public ComplexExponential subFunc(ComplexExponential exponentialNumber1, ComplexExponential exponentialNumber2) {
        ComplexAlgebraic algebraicNumber1 = toComplexAlgebraic(exponentialNumber1);
        ComplexAlgebraic algebraicNumber2 = toComplexAlgebraic(exponentialNumber2);
        ComplexAlgebraic complexResult = new ComplexAlgebraic(algebraicNumber1.getRealPart()-algebraicNumber2.getRealPart(),
                algebraicNumber1.getImaginaryPart()-algebraicNumber2.getImaginaryPart());
        ComplexExponential exponentialResult = complexResult.toComplexExponential(complexResult);
        return exponentialResult;
    }

    @Override
    public ComplexExponential mulFunc(ComplexExponential number1, ComplexExponential number2) {
        ComplexExponential result = new ComplexExponential(number1.absValue*number2.absValue,
                number1.angle+number2.angle);
        return result;
    }

    @Override
    public ComplexExponential divFunc(ComplexExponential number1, ComplexExponential number2) {
        ComplexExponential result = new ComplexExponential(number1.absValue/number2.absValue,
                number1.angle-number2.angle);
        return result;
    }
}
