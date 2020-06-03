package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setResizable(true);
        primaryStage.setTitle("Square&Perimeter Calculator");
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 640, 480);

        root.setGridLinesVisible(false);
        root.setPadding(new Insets(5, 5, 5, 5));
        for (int i = 0; i < 4; i++) {
            root.getColumnConstraints().add(new ColumnConstraints());
        }

        root.getColumnConstraints().get(0).setPercentWidth(20);
        root.getColumnConstraints().get(1).setPercentWidth(30);
        root.getColumnConstraints().get(2).setPercentWidth(30);
        root.getColumnConstraints().get(3).setPercentWidth(20);

        root.add(new Label("Side 1:"), 0, 0);
        root.add(new Label("Side 2:"), 0, 1);
        root.add(new Label("Side 3:"), 0, 2);

        TextField firstSideTextField = new TextField();
        root.add(firstSideTextField, 1, 0,3,1);

        TextField secondSideTextField = new TextField();
        root.add(secondSideTextField, 1, 1,3,1);

        TextField thirdSideTextField = new TextField();
        root.add(thirdSideTextField, 1, 2,3,1);

        Button squareButton = new Button("Square");
        squareButton.setMaxWidth(Double.MAX_VALUE);
        squareButton.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(squareButton, new Insets(5));
        root.add(squareButton, 0, 3);

        Label squareLabel = new Label("");
        root.add(squareLabel, 1, 3);


        Button perimeterButton = new Button("Perimeter");
        perimeterButton.setMaxWidth(Double.MAX_VALUE);
        perimeterButton.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(perimeterButton, new Insets(5));
        root.add(perimeterButton, 2, 3);

        Label perimeterLabel = new Label("");
        root.add(perimeterLabel, 3, 3);

        SquarePerimeter.squareButtonHandler(squareButton,squareLabel,firstSideTextField,secondSideTextField,thirdSideTextField);
        SquarePerimeter.perimeterButtonHandler(perimeterButton,perimeterLabel,firstSideTextField,secondSideTextField,thirdSideTextField);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}