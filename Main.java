package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
// NOTE PD  This code deliberately stacks the Buttons on top of each other to show
// how stack pane works ... it stacks components on top of each other! When its run
// it only shows "Button 4"  - all the other three buttons are stacked up and hidden under "Button 4"

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button but1 = new Button("Click Me 1");
        but1.setOnAction(event -> System.out.println("Button 1 was clicked"));

        Button but2 = new Button("Click Me 2");
        but2.setOnAction(event -> System.out.println("Button 2 was clicked"));

        Button but3 = new Button("Click Me 3");
        but1.setOnAction(event -> System.out.println("Button 3 was clicked"));

        Button but4 = new Button("Click Me 4");
        but4.setOnAction(event -> System.out.println("Button 4 was clicked"));

        StackPane root = new StackPane();
        root.getChildren().add(but1);
        root.getChildren().add(but2);
        root.getChildren().add(but3);
        root.getChildren().add(but4);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
