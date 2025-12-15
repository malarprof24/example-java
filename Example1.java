import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.ChoiceBox;

public class Example1 extends Application {

    public static void main(String[] args) {
        System.out.println("Launching JavaFX");
        launch(args); // Starts JavaFX application
        System.out.println("Finished");
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello");
ChoiceBox<String> box = new ChoiceBox<String>();
      //Retrieving the observable list
      ObservableList<String> oslist = box.getItems();
      //Adding items to the list
      oslist.addAll("Windows7", "Windows8", "Windows10", "Windows11", "MAC OS");
      //Setting the position of the choice box
      box.setTranslateX(10);
      box.setTranslateY(50);
      //Setting the label
Label setlabel = new Label("Select your Operating System:");
      setlabel.setTranslateX(10);
      setlabel.setTranslateY(10);

//Adding the choice box to the group
      Group newgrp = new Group(box, setlabel);
      //Setting the stage
      Scene scene = new Scene(newgrp, 500, 200);
      stage.setTitle("Choice Box in JavaFX");
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
