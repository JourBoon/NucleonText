package fr.nucleon.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class NucleonEditor extends Application {
    @Override
    public void start(Stage editor) throws Exception {
        FXMLLoader root = new FXMLLoader(getClass().getResource("ui.fxml"));
        root.setControllerFactory(t -> new EditorController(new EditorModel()));
        editor.setScene(new Scene(root.load()));
        editor.setTitle("NucleonText Editor V0.1.0");
        editor.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
