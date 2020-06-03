package pack1;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setResizable(true);
        primaryStage.setTitle("Complex Number Calculator");
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 520, 140);
        HBox hBox = new HBox();

        root.setGridLinesVisible(false);
        root.setPadding(new Insets(5, 5, 5, 5));

        root.getColumnConstraints().add(new ColumnConstraints(100,100,100, Priority.NEVER, HPos.LEFT,true));
        root.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root.getColumnConstraints().add(new ColumnConstraints(20,30,50, Priority.NEVER, HPos.LEFT,true));
        root.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root.getColumnConstraints().add(new ColumnConstraints(20,20,20, Priority.NEVER, HPos.LEFT,true));

        root.add(new Label("Number 1: z = "), 0, 0);
        root.add(new Label("Number 2: z = "), 0, 1);
        root.add(new Label("Result:   z = "), 0, 3);
        root.add(new Label("  +"), 2, 0);
        root.add(new Label("  +"), 2, 1);
        root.add(new Label("  +"), 2, 3);
        root.add(new Label("  i"), 4, 0);
        root.add(new Label("  i"), 4, 1);
        root.add(new Label("  i"), 4, 3);

        Label realPartLabel = new Label("");
        root.add(realPartLabel, 1, 3);
        Label imaginaryPartLabel = new Label("");
        root.add(imaginaryPartLabel, 3, 3);

        TextField firstRealPart_t = new TextField();
        root.add(firstRealPart_t, 1, 0,1,1);

        TextField secondRealPart_t = new TextField();
        root.add(secondRealPart_t, 1, 1,1,1);

        TextField firstImaginaryPart_t = new TextField();
        root.add(firstImaginaryPart_t, 3, 0,1,1);

        TextField secondImaginaryPart_t = new TextField();
        root.add(secondImaginaryPart_t, 3, 1,1,1);

        Button additionButton = new Button("+");
        additionButton.setMaxWidth(Double.MAX_VALUE);
        additionButton.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(additionButton, new Insets(5));

        Button subtractionButton = new Button("-");
        subtractionButton.setMaxWidth(Double.MAX_VALUE);
        subtractionButton.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(subtractionButton, new Insets(5));

        HBox.setHgrow(additionButton,Priority.ALWAYS);
        HBox.setHgrow(subtractionButton,Priority.ALWAYS);

        hBox.getChildren().addAll(additionButton,subtractionButton);
        root.add(hBox,0, 2,5,1);

        ButtonHandler.additionButtonHandler(additionButton, realPartLabel,imaginaryPartLabel,
                firstRealPart_t,firstImaginaryPart_t, secondRealPart_t,secondImaginaryPart_t);
        ButtonHandler.subtractionButtonHandler(subtractionButton, realPartLabel, imaginaryPartLabel,
                firstRealPart_t,firstImaginaryPart_t,secondRealPart_t,secondImaginaryPart_t);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
