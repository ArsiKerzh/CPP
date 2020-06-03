package pack1;
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


public class Main extends Application{
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setResizable(true);
        primaryStage.setTitle("Complex Number Calculator");

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 520, 180);
        ScreenController screenController = new ScreenController(scene);

        //Main Scene
        BorderPane mainRoot = new BorderPane();


        FlowPane flowPane = new FlowPane();
        flowPane.setAlignment(Pos.CENTER);


        Button complexAlgebraicButton = new Button("2 ComplexAlgebraic");
        Button complexExponentialButton = new Button("2 ComplexExponential");
        Button differentComplexButton = new Button("DifferentComplex");
        Button exitButton = new Button("EXIT");

        flowPane.getChildren().add(complexAlgebraicButton);
        flowPane.getChildren().add(complexExponentialButton);
        flowPane.getChildren().add(differentComplexButton);

        mainRoot.setAlignment(exitButton, Pos.CENTER);
        mainRoot.setBottom(exitButton);

        mainRoot.setAlignment(flowPane, Pos.CENTER);
        mainRoot.setCenter(flowPane);

        screenController.addScreen("Main", mainRoot);
        screenController.activate("Main");


        //Scene 1
        GridPane root1 = new GridPane();
        HBox hBox1 = new HBox();

        root1.setGridLinesVisible(false);
        root1.setPadding(new Insets(5, 5, 5, 5));

        Button backButton1 = new Button("Back");
        backButton1.setMaxWidth(100);

        Button additionButton1 = new Button("+");
        additionButton1.setMaxWidth(Double.MAX_VALUE);
        additionButton1.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(additionButton1, new Insets(5));

        Button subtractionButton1 = new Button("-");
        subtractionButton1.setMaxWidth(Double.MAX_VALUE);
        subtractionButton1.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(subtractionButton1, new Insets(5));

        Button multiplicationButton1 = new Button("*");
        multiplicationButton1.setMaxWidth(Double.MAX_VALUE);
        multiplicationButton1.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(multiplicationButton1, new Insets(5));

        Button divisionButton1 = new Button("/");
        divisionButton1.setMaxWidth(Double.MAX_VALUE);
        divisionButton1.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(divisionButton1, new Insets(5));

        root1.getColumnConstraints().add(new ColumnConstraints(100,100,100, Priority.NEVER, HPos.LEFT,true));
        root1.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root1.getColumnConstraints().add(new ColumnConstraints(20,30,50, Priority.NEVER, HPos.LEFT,true));
        root1.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root1.getColumnConstraints().add(new ColumnConstraints(20,20,20, Priority.NEVER, HPos.LEFT,true));

        root1.add(new Label("Number 1: z = "), 0, 0);
        root1.add(new Label("Number 2: z = "), 0, 1);
        root1.add(new Label("Result:   z = "), 0, 3);
        root1.add(new Label("  +"), 2, 0);
        root1.add(new Label("  +"), 2, 1);
        root1.add(new Label("  +"), 2, 3);
        root1.add(new Label("  i"), 4, 0);
        root1.add(new Label("  i"), 4, 1);
        root1.add(new Label("  i"), 4, 3);

        Label realPartLabel = new Label("");
        root1.add(realPartLabel, 1, 3);
        Label imaginaryPartLabel = new Label("");
        root1.add(imaginaryPartLabel, 3, 3);

        TextField firstRealPart_t = new TextField();
        root1.add(firstRealPart_t, 1, 0,1,1);

        TextField secondRealPart_t = new TextField();
        root1.add(secondRealPart_t, 1, 1,1,1);

        TextField firstImaginaryPart_t = new TextField();
        root1.add(firstImaginaryPart_t, 3, 0,1,1);

        TextField secondImaginaryPart_t = new TextField();
        root1.add(secondImaginaryPart_t, 3, 1,1,1);

        HBox.setHgrow(additionButton1,Priority.ALWAYS);
        HBox.setHgrow(subtractionButton1,Priority.ALWAYS);
        HBox.setHgrow(multiplicationButton1,Priority.ALWAYS);
        HBox.setHgrow(divisionButton1,Priority.ALWAYS);
        hBox1.getChildren().addAll(additionButton1,subtractionButton1,multiplicationButton1,divisionButton1);
        root1.add(backButton1,0,4);
        root1.add(hBox1,0, 2,5,1);

        screenController.addScreen("ComplexAlgebraic", root1);

        //Scene 2
        GridPane root2 = new GridPane();
        HBox hBox2 = new HBox();

        root2.setGridLinesVisible(false);
        root2.setPadding(new Insets(5, 5, 5, 5));

        Button backButton2 = new Button("Back");
        backButton2.setMaxWidth(100);

        Button additionButton2 = new Button("+");
        additionButton2.setMaxWidth(Double.MAX_VALUE);
        additionButton2.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(additionButton2, new Insets(5));

        Button subtractionButton2 = new Button("-");
        subtractionButton2.setMaxWidth(Double.MAX_VALUE);
        subtractionButton2.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(subtractionButton2, new Insets(5));

        Button multiplicationButton2 = new Button("*");
        multiplicationButton2.setMaxWidth(Double.MAX_VALUE);
        multiplicationButton2.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(multiplicationButton2, new Insets(5));

        Button divisionButton2 = new Button("/");
        divisionButton2.setMaxWidth(Double.MAX_VALUE);
        divisionButton2.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(divisionButton2, new Insets(5));

        root2.getColumnConstraints().add(new ColumnConstraints(100,100,100, Priority.NEVER, HPos.LEFT,true));
        root2.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root2.getColumnConstraints().add(new ColumnConstraints(20,30,50, Priority.NEVER, HPos.LEFT,true));
        root2.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root2.getColumnConstraints().add(new ColumnConstraints(20,20,20, Priority.NEVER, HPos.LEFT,true));

        root2.add(new Label("Number 1: z = "), 0, 0);
        root2.add(new Label("Number 2: z = "), 0, 1);
        root2.add(new Label("Result:   z = "), 0, 3);
        root2.add(new Label("  e^"), 2, 0);
        root2.add(new Label("  e^"), 2, 1);
        root2.add(new Label("  e^"), 2, 3);
        root2.add(new Label("  i"), 4, 0);
        root2.add(new Label("  i"), 4, 1);
        root2.add(new Label("  i"), 4, 3);

        Label absValueLabel = new Label("");
        root2.add(absValueLabel, 1, 3);
        Label angleLabel = new Label("");
        root2.add(angleLabel, 3, 3);

        TextField firstAbsValue_t = new TextField();
        root2.add(firstAbsValue_t, 1, 0,1,1);

        TextField secondAbsValue_t = new TextField();
        root2.add(secondAbsValue_t, 1, 1,1,1);

        TextField firstAngle_t = new TextField();
        root2.add(firstAngle_t, 3, 0,1,1);

        TextField secondAngle_t = new TextField();
        root2.add(secondAngle_t, 3, 1,1,1);

        HBox.setHgrow(additionButton2,Priority.ALWAYS);
        HBox.setHgrow(subtractionButton2,Priority.ALWAYS);
        HBox.setHgrow(multiplicationButton2,Priority.ALWAYS);
        HBox.setHgrow(divisionButton2,Priority.ALWAYS);
        hBox2.getChildren().addAll(additionButton2,subtractionButton2,multiplicationButton2,divisionButton2);
        root2.add(backButton2,0,4);
        root2.add(hBox2,0, 2,5,1);

        screenController.addScreen("ComplexExponential", root2);


        //Scene 3
        GridPane root3 = new GridPane();
        HBox hBox3 = new HBox();

        root3.setGridLinesVisible(false);
        root3.setPadding(new Insets(5, 5, 5, 5));

        Button backButton3 = new Button("Back");
        backButton3.setMaxWidth(100);

        Button additionButton3 = new Button("+");
        additionButton3.setMaxWidth(Double.MAX_VALUE);
        additionButton3.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(additionButton3, new Insets(5));

        Button subtractionButton3 = new Button("-");
        subtractionButton3.setMaxWidth(Double.MAX_VALUE);
        subtractionButton3.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(subtractionButton3, new Insets(5));

        Button multiplicationButton3 = new Button("*");
        multiplicationButton3.setMaxWidth(Double.MAX_VALUE);
        multiplicationButton3.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(multiplicationButton3, new Insets(5));

        Button divisionButton3 = new Button("/");
        divisionButton3.setMaxWidth(Double.MAX_VALUE);
        divisionButton3.setMaxHeight(Double.MAX_VALUE);
        GridPane.setMargin(divisionButton3, new Insets(5));

        root3.getColumnConstraints().add(new ColumnConstraints(100,100,100, Priority.NEVER, HPos.LEFT,true));
        root3.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root3.getColumnConstraints().add(new ColumnConstraints(20,30,50, Priority.NEVER, HPos.LEFT,true));
        root3.getColumnConstraints().add(new ColumnConstraints(10,15,Double.MAX_VALUE, Priority.ALWAYS, HPos.CENTER,true));
        root3.getColumnConstraints().add(new ColumnConstraints(20,20,20, Priority.NEVER, HPos.LEFT,true));

        root3.add(new Label("Number 1: z = "), 0, 0);
        root3.add(new Label("Number 2: z = "), 0, 1);
        root3.add(new Label("Result A: z = "), 0, 3);
        root3.add(new Label("Result E: z = "), 0, 4);
        root3.add(new Label("   +"), 2, 0);
        root3.add(new Label("  e^"), 2, 1);
        root3.add(new Label("   +"), 2, 3);
        root3.add(new Label("  e^"), 2, 4);
        root3.add(new Label("  i"), 4, 0);
        root3.add(new Label("  i"), 4, 1);
        root3.add(new Label("  i"), 4, 3);
        root3.add(new Label("  i"), 4, 4);

        Label absValueLabel2 = new Label("");
        root3.add(absValueLabel2, 1, 4);
        Label angleLabel2 = new Label("");
        root3.add(angleLabel2, 3, 4);
        Label realPartLabel2= new Label("");
        root3.add(realPartLabel2, 1, 3);
        Label imaginaryPartLabel2 = new Label("");
        root3.add(imaginaryPartLabel2, 3, 3);


        TextField realPart_t = new TextField();
        root3.add(realPart_t, 1, 0,1,1);

        TextField imaginaryPart_t = new TextField();
        root3.add(imaginaryPart_t, 3, 0,1,1);

        TextField absValue_t = new TextField();
        root3.add(absValue_t, 1, 1,1,1);

        TextField angle_t = new TextField();
        root3.add(angle_t, 3, 1,1,1);

        HBox.setHgrow(additionButton3,Priority.ALWAYS);
        HBox.setHgrow(subtractionButton3,Priority.ALWAYS);
        HBox.setHgrow(multiplicationButton3,Priority.ALWAYS);
        HBox.setHgrow(divisionButton3,Priority.ALWAYS);
        hBox3.getChildren().addAll(additionButton3,subtractionButton3,multiplicationButton3,divisionButton3);
        root3.add(backButton3,0,5);
        root3.add(hBox3,0, 2,5,1);

        screenController.addScreen("Mix", root3);


        ButtonHandler.backButtonHandle(backButton1,screenController);
        ButtonHandler.backButtonHandle(backButton2,screenController);
        ButtonHandler.backButtonHandle(backButton3,screenController);
        ButtonHandler.complexAlgebraicButtonHandle(complexAlgebraicButton, screenController);
        ButtonHandler.complexExponentialButtonHandle(complexExponentialButton, screenController);
        ButtonHandler.differentComplexButtonHandle(differentComplexButton,screenController);

        ButtonHandler.additionButtonHandle(additionButton1,realPartLabel, imaginaryPartLabel,realPartLabel,imaginaryPartLabel,
                firstRealPart_t,firstImaginaryPart_t,secondRealPart_t,secondImaginaryPart_t,'A');
        ButtonHandler.additionButtonHandle(additionButton2,absValueLabel, angleLabel,absValueLabel,angleLabel,
                firstAbsValue_t,firstAngle_t,secondAbsValue_t,secondAngle_t,'E');
        ButtonHandler.additionButtonHandle(additionButton3,realPartLabel2, imaginaryPartLabel2,absValueLabel2,angleLabel2,
                realPart_t,imaginaryPart_t,absValue_t,angle_t,'M');

        ButtonHandler.subtractionButtonHandle(subtractionButton1,realPartLabel, imaginaryPartLabel,realPartLabel,imaginaryPartLabel,
                firstRealPart_t,firstImaginaryPart_t,secondRealPart_t,secondImaginaryPart_t,'A');
        ButtonHandler.subtractionButtonHandle(subtractionButton2,absValueLabel, angleLabel,absValueLabel,angleLabel,
                firstAbsValue_t,firstAngle_t,secondAbsValue_t,secondAngle_t,'E');
        ButtonHandler.subtractionButtonHandle(subtractionButton3,realPartLabel2, imaginaryPartLabel2,absValueLabel2,angleLabel2,
                realPart_t,imaginaryPart_t,absValue_t,angle_t,'M');

        ButtonHandler.multiplicationButtonHandle(multiplicationButton1,realPartLabel, imaginaryPartLabel,realPartLabel,imaginaryPartLabel,
                firstRealPart_t,firstImaginaryPart_t,secondRealPart_t,secondImaginaryPart_t,'A');
        ButtonHandler.multiplicationButtonHandle(multiplicationButton2,absValueLabel, angleLabel,absValueLabel,angleLabel,
                firstAbsValue_t,firstAngle_t,secondAbsValue_t,secondAngle_t,'E');
        ButtonHandler.multiplicationButtonHandle(multiplicationButton3,realPartLabel2, imaginaryPartLabel2,absValueLabel2,angleLabel2,
                realPart_t,imaginaryPart_t,absValue_t,angle_t,'M');

        ButtonHandler.divisionButtonHandle(divisionButton1,realPartLabel, imaginaryPartLabel,realPartLabel,imaginaryPartLabel,
                firstRealPart_t,firstImaginaryPart_t,secondRealPart_t,secondImaginaryPart_t,'A');
        ButtonHandler.divisionButtonHandle(divisionButton2,absValueLabel, angleLabel,absValueLabel,angleLabel,
                firstAbsValue_t,firstAngle_t,secondAbsValue_t,secondAngle_t,'E');
        ButtonHandler.divisionButtonHandle(divisionButton3,realPartLabel2, imaginaryPartLabel2,absValueLabel2,angleLabel2,
                realPart_t,imaginaryPart_t,absValue_t,angle_t,'M');

        ButtonHandler.exitButtonHandle(primaryStage, exitButton);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}