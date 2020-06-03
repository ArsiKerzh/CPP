package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SquarePerimeter extends Main {
    public static void squareButtonHandler(Button button, Label label, TextField textField1, TextField textField2, TextField textField3) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                Integer firstSide = Integer.parseInt(textField1.getText());
                Integer secondSide = Integer.parseInt(textField2.getText());
                Integer thirdSide = Integer.parseInt(textField3.getText());
                Integer halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
                label.setText(" " + Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                        (halfPerimeter - secondSide) * (halfPerimeter - thirdSide)));
            }
        });
    }

    public static  void perimeterButtonHandler(Button button, Label label, TextField textField1, TextField textField2, TextField textField3) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                Integer firstSide = Integer.parseInt(textField1.getText());
                Integer secondSide = Integer.parseInt(textField2.getText());
                Integer thirdSide = Integer.parseInt(textField3.getText());
                label.setText(" " + (firstSide + secondSide + thirdSide) + ".0");
            }
        });
    }

}