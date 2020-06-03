package pack1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ButtonHandler {
    public static void additionButtonHandler(Button button, Label label1, Label label2,
                                             TextField firstRealPart_t, TextField firstImaginaryPart_t,
                                             TextField secondRealPart_t, TextField secondImaginaryPart_t){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                double firstRealPart = Double.parseDouble(firstRealPart_t.getText());
                double secondRealPart = Double.parseDouble(secondRealPart_t.getText());
                double firstImaginaryPart = Double.parseDouble(firstImaginaryPart_t.getText());
                double secondImaginaryPart = Double.parseDouble(secondImaginaryPart_t.getText());
                Expression expression = new Expression(firstRealPart,firstImaginaryPart,secondRealPart,secondImaginaryPart,'+');
                expression.calculate(label1,label2);
            }
        });
    }

    public static void subtractionButtonHandler(Button button, Label label1, Label label2,
                                                TextField firstRealPart_t, TextField firstImaginaryPart_t,
                                                TextField secondRealPart_t, TextField secondImaginaryPart_t){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                double firstRealPart = Double.parseDouble(firstRealPart_t.getText());
                double secondRealPart = Double.parseDouble(secondRealPart_t.getText());
                double firstImaginaryPart = Double.parseDouble(firstImaginaryPart_t.getText());
                double secondImaginaryPart = Double.parseDouble(secondImaginaryPart_t.getText());
                Expression expression = new Expression(firstRealPart,firstImaginaryPart,secondRealPart,secondImaginaryPart,'-');
                expression.calculate(label1,label2);
            }
        });
    }
}
