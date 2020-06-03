package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ButtonHandler {
    public static void exitButtonHandle(Stage primaryStage, Button button){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                primaryStage.close();
            }
        });
    }

    public static void calculateButtonHandle(Button button, TextField firstNumberA_t, TextField secondNumberA_t,
                                             TextField firstNumberB_t, TextField secondNumberB_t, Label label){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    double firstNumberA = Double.parseDouble(firstNumberA_t.getText());
                    double secondNumberA = Double.parseDouble(secondNumberA_t.getText());
                    double firstNumberB = Double.parseDouble(firstNumberB_t.getText());
                    double secondNumberB = Double.parseDouble(secondNumberB_t.getText());
                    Adder adder = new Adder(firstNumberA,secondNumberA,firstNumberB,secondNumberB);
                    double[] vector = adder.calculate();
                    label.setText("Vector c: ( " + String.valueOf(vector[0]) + " , " + String.valueOf(vector[1]) + " )");
                }catch (NumberFormatException e1){
                    System.err.println("java.lang.NumberFormatException: Entered wrong values");
                }

            }
        });
    }
}
