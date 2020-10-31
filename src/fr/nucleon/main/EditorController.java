package fr.nucleon.main;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;

import javafx.scene.control.TextArea;
import java.io.File;
import java.util.Arrays;

public class EditorController {

    @FXML
    private TextArea areaText;

    private EditorModel model;

    private TextFile currentTextFile;

    public EditorController(EditorModel model){
        this.model = model;
    }


    @FXML
    private void onSave(){
        TextFile textFile = new TextFile(currentTextFile.getFile(), Arrays.asList(areaText.getText().split("\n")));
        model.save(textFile);
    }

    @FXML
    private void onSaveas(){
        
    }

    @FXML
    private void onLoad(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("./"));
        File file = fileChooser.showOpenDialog(null);
        if(file != null){
           IOResult<TextFile> io = model.load(file.toPath());

           if(io.isOk() && io.hasData()){
               currentTextFile = io.getData();

               areaText.clear();
               currentTextFile.getContent().forEach(areaText::appendText);
            }else{
               Alert failedLoad = new Alert(Alert.AlertType.ERROR);
               failedLoad.setHeaderText(null);
               failedLoad.setTitle("Error");
               failedLoad.setContentText("NucleonEditor: A problem occurred while opening this file");
               failedLoad.show();
           }
        }
    }

    @FXML
    private void onClose(){
        model.close();
    }

    @FXML
    private void onAbout(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("About");
        alert.setContentText("NucleonEditor is in a Development phase. Please report issues or ideas on GitHub. ");
        alert.show();
    }

}
