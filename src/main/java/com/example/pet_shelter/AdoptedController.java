package com.example.pet_shelter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.List;
import java.util.stream.Collectors;

public class AdoptedController {

    @FXML
    private ScrollPane Scroll;

    @FXML
    private GridPane gridpane;

    @FXML
    private Text petsText;

    @FXML
    private void initialize() {
        // Assign the petsList from Display_pets class
        List<Display_pets> petsList = Display_pets.getPetsList();

        // Filter available pets
        List<Display_pets> availablePets = petsList.stream()
                .filter(pet -> "Available".equals(pet.getAdoptionStatus()))
                .collect(Collectors.toList());

        // Display available pets in the GridPane
        displayAvailablePets(availablePets);
    }

    private void createGridPane() {
        // Customize grid pane properties if needed
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(10);
        gridpane.setVgap(20);

        gridpane.getColumnConstraints().clear();

    }

    private void displayAvailablePets(List<Display_pets> availablePets) {
        // Customize grid pane properties if needed
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setHalignment(HPos.CENTER);
        gridpane.getColumnConstraints().add(columnConstraints);

        // Add header for pets
        int headerRow = 0;

        Font headerFont = Font.font("Times New Roman", FontWeight.BOLD, 18);

        String[] headerTexts = {"Name", "Pet ID", "Pet Type", "Adoption Status", "Adoption", "Treatment Status", "Adopt"};

        for (int i = 0; i < headerTexts.length; i++) {
            Label label = new Label(headerTexts[i]);
            label.setFont(headerFont);
            gridpane.add(label, i, headerRow);
            GridPane.setHalignment(label, HPos.CENTER);
        }

        // Add available pets and Adopt buttons to the grid pane
        for (int row = 0; row < availablePets.size(); row++) {
            Display_pets pet = availablePets.get(row);

            gridpane.add(new Text(pet.getName()), 0, row + 1);
            gridpane.add(new Text(pet.getPetType()), 1, row + 1);
            gridpane.add(new Text(pet.getPetId()), 2, row + 1);
            gridpane.add(new Text(pet.getReadyForAdoptionStatus()), 3, row + 1);
            gridpane.add(new Text(pet.getTreatmentStatus()), 4, row + 1);
            gridpane.add(new Text(pet.getAdoptionStatus()), 5, row + 1);

            // Add Adopt button
            Button adoptButton = new Button("Adopt");
            adoptButton.setOnAction((ActionEvent event) -> handleAdoptButton(pet));
            gridpane.add(adoptButton, 6, row + 1);

        }
    }

    private void handleAdoptButton(Display_pets pet) {
        System.out.println("Adopting " + pet.getName());

    }
}
