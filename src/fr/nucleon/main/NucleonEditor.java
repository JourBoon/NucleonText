package fr.nucleon.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class NucleonEditor extends Application {
    @Override
    public void start(Stage editor) throws Exception {
        
        editor.setTitle("NucleonText Editor");
        editor.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
