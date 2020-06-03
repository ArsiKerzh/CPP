package pack1;
import java.util.*;
import javafx.scene.control.Label;

public class Expression {
    private ArrayList<Number> list = new ArrayList<>();
    private char operationType;
   private char resultType;

    public Expression(double firstValue1, double firstValue2,
                      double secondValue1, double secondValue2,
                      char operationType, char resultType) {
        this.operationType=operationType;
        this.resultType=resultType;
        switch (resultType) {
            case 'A': {
                list.add(new ComplexAlgebraic(firstValue1,firstValue2));
                list.add(new ComplexAlgebraic(secondValue1,secondValue2));
                break;
            }
            case 'E':{
                list.add(new ComplexExponential(firstValue1,firstValue2));
                list.add(new ComplexExponential(secondValue1,secondValue2));
                break;
            }
            case 'M':{
                list.add(new ComplexAlgebraic(firstValue1,firstValue2));
                list.add(new ComplexExponential(secondValue1,secondValue2));
                break;
            }
        }

    }

    public Expression() {
    }

    public void calculate(Label label1, Label label2, Label label3, Label label4){
        switch (resultType){
            case 'A':{
                ComplexAlgebraic firstComplex = (ComplexAlgebraic)list.get(0);
                ComplexAlgebraic secondComplex = (ComplexAlgebraic)list.get(1);
                ComplexAlgebraic result = new ComplexAlgebraic(0,0);
                switch (operationType){
                    case '+':{
                        result = result.addFunc(firstComplex,secondComplex);
                        break;
                    }
                    case '-':{
                        result = result.subFunc(firstComplex,secondComplex);
                        break;
                    }
                    case '*':{
                        result = result.mulFunc(firstComplex,secondComplex);
                        break;
                    }
                    case '/':{
                        result = result.divFunc(firstComplex,secondComplex);
                        break;
                    }
                }
                label1.setText("   " + String.valueOf(result.getRealPart()));
                label2.setText("   " + String.valueOf(result.getImaginaryPart()));
                break;
            }
            case 'E':{
                ComplexExponential firstComplex = (ComplexExponential)list.get(0);
                ComplexExponential secondComplex = (ComplexExponential)list.get(1);
                ComplexExponential result = new ComplexExponential(0,0);
                switch (operationType){
                    case '+':{
                        result = result.addFunc(firstComplex,secondComplex);
                        break;
                    }
                    case '-':{
                        result = result.subFunc(firstComplex,secondComplex);
                        break;
                    }
                    case '*':{
                        result = result.mulFunc(firstComplex,secondComplex);
                        break;
                    }
                    case '/':{
                        result = result.divFunc(firstComplex,secondComplex);
                        break;
                    }
                }
                label1.setText("   " + String.valueOf(result.getAbsValue()));
                label2.setText("   " + String.valueOf(result.getAngle()));
                break;
            }
            case 'M':{
                ComplexAlgebraic firstComplex = (ComplexAlgebraic)list.get(0);
                ComplexExponential secondComplex = (ComplexExponential)list.get(1);
                ComplexAlgebraic result1 = new ComplexAlgebraic(0,0);
                ComplexExponential result2 = new ComplexExponential(0,0);
                switch (operationType){
                    case '+':{
                        result1 = result1.addFunc(firstComplex,secondComplex.toComplexAlgebraic(secondComplex));
                        result2 = result1.toComplexExponential(result1);
                        break;
                    }
                    case '-':{
                        result1 = result1.subFunc(firstComplex,secondComplex.toComplexAlgebraic(secondComplex));
                        result2 = result1.toComplexExponential(result1);
                        break;
                    }
                    case '*':{
                        result1 = result1.mulFunc(firstComplex,secondComplex.toComplexAlgebraic(secondComplex));
                        result2 = result1.toComplexExponential(result1);
                        break;
                    }
                    case '/':{
                        result1 = result1.divFunc(firstComplex,secondComplex.toComplexAlgebraic(secondComplex));
                        result2 = result1.toComplexExponential(result1);
                        break;
                    }
                }
                label1.setText("   " + String.valueOf(result1.getRealPart()));
                label2.setText("   " + String.valueOf(result1.getImaginaryPart()));
                label3.setText("   " + String.valueOf(result2.getAbsValue()));
                label4.setText("   " + String.valueOf(result2.getAngle()));
                break;
            }
        }
    }
}