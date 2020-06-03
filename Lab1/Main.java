package Lab;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args) {Application.launch(args);}
    @Override  public void start(Stage primaryStage)
    {
        primaryStage.setResizable(false);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 150);

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        for (int i = 0; i < 3; i++)
        {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(100 / 3.0);
            gridpane.getColumnConstraints().add(column);
        }

        Label label = new Label("Сторона 1");
        gridpane.add(label, 0, 0);
        TextField dividendTextField = new TextField();
        gridpane.add(dividendTextField, 1, 0);

        label = new Label("Сторона 2");
        gridpane.add(label, 0, 1);
        TextField dividerTextField = new TextField();
        gridpane.add(dividerTextField, 1, 1);

        label = new Label("Сторона 3");
        gridpane.add(label, 0, 2);
        TextField dividerTextField2 = new TextField();
        gridpane.add(dividerTextField2, 1, 2 );

        Button calculateButton1 = new Button("Площадь");
        gridpane.add(calculateButton1, 0, 4);

        Button calculateButton2=new Button("Периметр");
        gridpane.add(calculateButton2,1,4);

        Label quotientLabel = new Label(" ");
        gridpane.add(quotientLabel, 0, 4);
        Label remainderLabel = new Label(" ");
        gridpane.add(remainderLabel, 1, 4);

        calculateButton1.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                Integer dividend = Integer.parseInt(dividendTextField.getText());
                Integer divider = Integer.parseInt(dividerTextField.getText());
                Integer div1 = Integer.parseInt(dividerTextField2.getText());
                quotientLabel.setText("                      " + (dividend + dividend));
            }
        });
        calculateButton2.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                Integer dividend = Integer.parseInt(dividendTextField.getText());
                Integer divider = Integer.parseInt(dividerTextField.getText());
                Integer div1 = Integer.parseInt(dividerTextField2.getText());
                remainderLabel.setText("                       " + (dividend + divider + div1));
            }
        });
        root.setCenter(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}