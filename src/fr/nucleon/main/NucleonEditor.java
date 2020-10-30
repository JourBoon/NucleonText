package fr.nucleon.main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class NucleonEditor extends Application {
    @Override
    public void start(Stage editor) throws Exception {

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);
        editor.setTitle("NucleonText Editor V0.1.0");
        editor.setScene(scene);
        root.setStyle("-fx-background-color: #3A3A3A;");



        root.getChildren().addAll();
        editor.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
