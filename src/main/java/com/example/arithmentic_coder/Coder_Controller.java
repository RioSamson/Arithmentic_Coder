package com.example.arithmentic_coder;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;

import java.io.File;

public class Coder_Controller {

    File textFile;

    @FXML
    protected void onOpenFileClicked() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select your wav file");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", ".txt"));
        textFile = fileChooser.showOpenDialog(null);

        if(textFile != null){

        }
    }
}