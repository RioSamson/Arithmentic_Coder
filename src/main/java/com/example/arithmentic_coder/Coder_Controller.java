package com.example.arithmentic_coder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.*;

public class Coder_Controller {

    File textFile;

    @FXML
    private Label inputText;

    @FXML
    protected void onOpenFileClicked() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select your wav file");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

        fileChooser.setInitialDirectory(new File("C:\\Users\\User\\Downloads\\project-3-samples\\MM\\Q1\\"));

        textFile = fileChooser.showOpenDialog(null);

        if(textFile != null){

            BufferedReader reader = new BufferedReader(new FileReader(textFile));
            int n = Integer.parseInt(reader.readLine());
            System.out.println(n);

            String outputStr = "";

            String line = reader.readLine();
            while(line!= null){
                double low = 0;
                double mid = 0.5;
                double high = 1;

                for(int i=0; i<line.length(); i++){
                    if(line.charAt(i) == 'A') {
                        high = mid;
                        mid = low + ((high-low)*0.5);
                    } else{
                        low = mid;
                        mid = low + ((high-low)*0.5);
                    }
                }
                outputStr = outputStr + "Input: " + line + "   ||   Low: "+ low + "   ||   High: " + high + "\n";
                line = reader.readLine();
            }
            inputText.setText(outputStr);
        }
    }
}