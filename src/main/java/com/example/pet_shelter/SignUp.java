package com.example.pet_shelter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUp implements Initializable {
    @FXML
    private HBox vet_info;
    @FXML
    private ChoiceBox<String> role;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        role.getItems().addAll("vet" , "donor");
        role.setOnAction(this::selectRole);
    }
    public void selectRole(ActionEvent event)
    {
        String Role=role.getValue();
        if(Role.equals("vet"))
        {
            vet_info.setVisible(true);
        }
        else {
            vet_info.setVisible(false);
        }
    }

}
