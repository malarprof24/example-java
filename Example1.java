import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Example1 extends Application {

    public static void main(String[] args) {
        System.out.println("Launching JavaFX");
        launch(args); // Starts JavaFX application
        System.out.println("Finished");
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello");

        // Creating CheckBoxes
        CheckBox cb1 = new CheckBox("First");
        CheckBox cb2 = new CheckBox("Second");

        // Setting the first checkbox selected by default
        cb1.setSelected(false);

        // Creating a vertical box layout
        HBox vbox = new HBox(cb1, cb2); // 10 = spacing between checkboxes

        // Creating a scene and setting it on the stage
        Scene sc = new Scene(vbox, 500, 500);
        stage.setScene(sc);
        stage.show();
    }
}
