package com.mycompany.testplacticeproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label callback;
    
    @FXML
    private TextField txt;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        callback.setText(txt.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


   
}
