package com.example.pet_shelter;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class PetsController implements Initializable {

    @FXML
    private ScrollPane Scroll;

    @FXML
    private GridPane gridpane;

    @FXML
    private Text pets;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Display_pets[] pets = {
                new Display_pets("Fluffy", "1", "Dog", 3,"Available", "Ready", "Totally Treated"),
                new Display_pets("Whiskers", "2", "Cat", 2, "Adopted", "Not Ready", "On Progress"),
                new Display_pets("Mickey","3","Dog",1,"Available","Ready","Treated"),
                new Display_pets("Roy","4","Cat",1,"Adopted","Not Ready","Treated"),
                new Display_pets("Simba","5","Dog",1,"Available","Ready","Treated"),
                new Display_pets("Martin","6","Cat",1,"Adopted","Not Ready","Sick"),
                new Display_pets("Moslo","7","Dog",1,"Available","Ready","Sick"),
                new Display_pets("lala","8","Cat",1,"Adopted","Not Ready","Sick"),
                new Display_pets("Mando","9","Dog",1,"Available","Ready","Sick"),
                new Display_pets("Tom","10","Cat",1,"Adopted","Not Ready","Sick"),
                new Display_pets("Jerry","11","Dog",1,"Available","Ready","Sick"),
                new Display_pets("Timon","12","Cat",1,"Adopted","Not Ready","Treated"),
                new Display_pets("Bomba","13","Dog",1,"Available","Ready","Treated"),
                new Display_pets("Scar","14","Cat",1,"Adopted","Not Ready","Treated"),
                new Display_pets("Poe","15","Dog",1,"Available","Ready","Sick"),
                new Display_pets("bahr","16","Cat",1,"Adopted","Not Ready","Sick"),
                new Display_pets("Bambi","17","Dog",1,"Available","Ready","Sick"),
                new Display_pets("Panda","18","Cat",1,"Adopted","Not Ready","Treated")
        };
       // Design
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(15);
        gridpane.setHgap(10);
        // Add column headers
        gridpane.add(new Label("Name"), 0, 0);
        gridpane.add(new Label("Pet ID"), 1, 0);
        gridpane.add(new Label("Pet Type"), 2, 0);
        gridpane.add(new Label("Age"), 3, 0);
        gridpane.add(new Label("Adoption Status"), 4, 0);
        gridpane.add(new Label("Ready for Adoption"), 5, 0);
        gridpane.add(new Label("Treatment Status"), 6, 0);

        // Add pet data to the grid
        for (int i = 0; i < pets.length; i++) {
           Display_pets pet = pets[i];

            Label nameLabel = new Label(pet.getName());
            Label idLabel = new Label(pet.getPetId());
            Label typeLabel = new Label(pet.getPetType());
            Label ageLabel = new Label(String.valueOf(pet.getAge()));
            Label adoptionStatusLabel = new Label(pet.getAdoptionStatus());
            Label readyForAdoptionLabel = new Label(pet.getReadyForAdoptionStatus());
            Label treatmentStatusLabel = new Label(pet.getTreatmentStatus());

            gridpane.add(nameLabel, 0, i + 1);
            gridpane.add(idLabel, 1, i + 1);
            gridpane.add(typeLabel, 2, i + 1);
            gridpane.add(ageLabel, 3, i + 1);
            gridpane.add(adoptionStatusLabel, 4, i + 1);
            gridpane.add(readyForAdoptionLabel, 5, i + 1);
            gridpane.add(treatmentStatusLabel, 6, i + 1);
        }
    }
}
