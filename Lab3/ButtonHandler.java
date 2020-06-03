package pack1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ButtonHandler {
    public static void additionButtonHandle(Button button, Label label1, Label label2, Label label3, Label label4,
                                             TextField firstValue1_t, TextField firstValue2_t,
                                             TextField secondValue1_t, TextField secondValue2_t, char resultType){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try{
                    double firstValue1 = Double.parseDouble(firstValue1_t.getText());
                    double secondValue1 = Double.parseDouble(secondValue1_t.getText());
                    double firstValue2 = Double.parseDouble(firstValue2_t.getText());
                    double secondValue2 = Double.parseDouble(secondValue2_t.getText());
                    switch (resultType){
                        case 'A':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'+', 'A');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                        case 'E':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'+', 'E');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                        case 'M':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'+', 'M');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                    }
                }catch (NumberFormatException e1){
                    System.err.println("java.lang.NumberFormatException: Entered wrong values");
                }

            }
        });
    }

    public static void subtractionButtonHandle(Button button, Label label1, Label label2, Label label3, Label label4,
                                            TextField firstValue1_t, TextField firstValue2_t,
                                            TextField secondValue1_t, TextField secondValue2_t, char resultType){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try{
                    double firstValue1 = Double.parseDouble(firstValue1_t.getText());
                    double secondValue1 = Double.parseDouble(secondValue1_t.getText());
                    double firstValue2 = Double.parseDouble(firstValue2_t.getText());
                    double secondValue2 = Double.parseDouble(secondValue2_t.getText());
                    switch (resultType) {
                        case 'A': {
                            Expression expression = new Expression(firstValue1, firstValue2, secondValue1, secondValue2, '-', 'A');
                            expression.calculate(label1, label2, label3, label4);
                            break;
                        }
                        case 'E': {
                            Expression expression = new Expression(firstValue1, firstValue2, secondValue1, secondValue2, '-', 'E');
                            expression.calculate(label1, label2, label3, label4);
                            break;
                        }
                        case 'M': {
                            Expression expression = new Expression(firstValue1, firstValue2, secondValue1, secondValue2, '-', 'M');
                            expression.calculate(label1, label2, label3, label4);
                            break;
                        }
                    }
                }catch (NumberFormatException e1){
                    System.err.println("java.lang.NumberFormatException: Entered wrong values");
                }

            }
        });
    }

    public static void multiplicationButtonHandle(Button button, Label label1, Label label2, Label label3, Label label4,
                                            TextField firstValue1_t, TextField firstValue2_t,
                                            TextField secondValue1_t, TextField secondValue2_t, char resultType){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try{
                    double firstValue1 = Double.parseDouble(firstValue1_t.getText());
                    double secondValue1 = Double.parseDouble(secondValue1_t.getText());
                    double firstValue2 = Double.parseDouble(firstValue2_t.getText());
                    double secondValue2 = Double.parseDouble(secondValue2_t.getText());
                    switch (resultType){
                        case 'A':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'*', 'A');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                        case 'E':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'*', 'E');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                        case 'M':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'*', 'M');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                    }
                }catch (NumberFormatException e1){
                    System.err.println("java.lang.NumberFormatException: Entered wrong values");
                }
            }
        });
    }

    public static void divisionButtonHandle(Button button, Label label1, Label label2, Label label3, Label label4,
                                            TextField firstValue1_t, TextField firstValue2_t,
                                            TextField secondValue1_t, TextField secondValue2_t, char resultType){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try{
                    double firstValue1 = Double.parseDouble(firstValue1_t.getText());
                    double secondValue1 = Double.parseDouble(secondValue1_t.getText());
                    double firstValue2 = Double.parseDouble(firstValue2_t.getText());
                    double secondValue2 = Double.parseDouble(secondValue2_t.getText());
                    switch (resultType){
                        case 'A':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'/', 'A');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                        case 'E':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'/', 'E');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                        case 'M':{
                            Expression expression = new Expression(firstValue1,firstValue2,secondValue1,secondValue2,'/', 'M');
                            expression.calculate(label1,label2, label3, label4);
                            break;
                        }
                    }
                }catch (NumberFormatException e1){
                    System.err.println("java.lang.NumberFormatException: Entered wrong values");
                }
            }
        });
    }
    public static void backButtonHandle(Button button, ScreenController screenController){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                screenController.activate("Main");

            }
        });
    }
    public static void complexAlgebraicButtonHandle(Button button, ScreenController screenController){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                screenController.activate("ComplexAlgebraic");

            }
        });
    }
    public static void complexExponentialButtonHandle(Button button, ScreenController screenController){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                screenController.activate("ComplexExponential");

            }
        });
    }
    public static void differentComplexButtonHandle(Button button, ScreenController screenController){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                screenController.activate("Mix");

            }
        });
    }
    public static void exitButtonHandle(Stage primaryStage, Button button){
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
               primaryStage.close();
            }
        });
    }

}
