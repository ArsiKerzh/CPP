package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Vector Calculator");

        BorderPane root = new BorderPane();
        GridPane root1 = new GridPane();

        Button exitButton = new Button("EXIT");
        root.setPadding(new Insets(5, 5, 5, 5));
        root.setTop(root1);
        root.setAlignment(exitButton, Pos.CENTER);
        root.setBottom(exitButton);

        root1.setGridLinesVisible(false);
        root1.setPadding(new Insets(5, 5, 5, 5));

        Scene scene = new Scene(root, 480,180);

        root1.getColumnConstraints().add(new ColumnConstraints(100,100,100, Priority.NEVER, HPos.CENTER,true));
        root1.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root1.getColumnConstraints().add(new ColumnConstraints(15,15,15, Priority.NEVER, HPos.CENTER,true));
        root1.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root1.getColumnConstraints().add(new ColumnConstraints(20,20,20, Priority.NEVER, HPos.RIGHT,true));
        root1.getColumnConstraints().add(new ColumnConstraints(50,100,150, Priority.NEVER, HPos.CENTER,true));
        root1.getColumnConstraints().add(new ColumnConstraints(150,150,Double.MAX_VALUE, Priority.SOMETIMES, HPos.CENTER,true));

        root1.add(new Label("Vector a: ("),0,0);
        root1.add(new Label(","),2,0);
        root1.add(new Label(")"),4,0);
        root1.add(new Label("+"),2,1);
        root1.add(new Label("Vector b: ("),0,2);
        root1.add(new Label(","),2,2);
        root1.add(new Label(")"),4,2);

        Label resultLabel = new Label("Vector c: (    ,    )");
        root1.add(resultLabel,6,1);

        TextField firstNumberA = new TextField();
        root1.add(firstNumberA,1,0);

        TextField secondNumberA = new TextField();
        root1.add(secondNumberA,3,0);

        TextField firstNumberB = new TextField();
        root1.add(firstNumberB,1,2);

        TextField secondNumberB = new TextField();
        root1.add(secondNumberB,3,2);

        Button calculateButton = new Button("Calculate");
        calculateButton.setMaxWidth(Double.MAX_VALUE);
        calculateButton.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(calculateButton, new Insets(5));
        root1.add(calculateButton,5,1);

        ButtonHandler.exitButtonHandle(primaryStage, exitButton);
        ButtonHandler.calculateButtonHandle(calculateButton,firstNumberA,secondNumberA,firstNumberB,secondNumberB,resultLabel);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
