package pack1;

import javafx.scene.control.Label;
import java.util.*;

public class Expression {
    private ArrayList<Number> list = new ArrayList<>();
    private char operationType;

    public Expression(double firstRealPart, double firstImaginaryPart,
                      double secondRealPart, double secondImaginaryPart, char operationType) {
        this.operationType=operationType;
        list.add(new ComplexAlgebraic(firstRealPart,firstImaginaryPart));
        list.add(new ComplexAlgebraic(secondRealPart,secondImaginaryPart));
    }

    public void calculate(Label label1, Label label2){
        ComplexAlgebraic firstComplex = (ComplexAlgebraic)list.get(0);
        ComplexAlgebraic secondComplex = (ComplexAlgebraic)list.get(1);
        ComplexAlgebraic result = new ComplexAlgebraic(0,0);
        if(operationType == '+'){
            result = result.addFunc(firstComplex,secondComplex);
        }else if(operationType == '-'){
            result = result.subFunc(firstComplex,secondComplex);
        }

        label1.setText("   " + String.valueOf(result.getRealPart()));
        label2.setText("   " + String.valueOf(result.getImaginaryPart()));
    }
}
