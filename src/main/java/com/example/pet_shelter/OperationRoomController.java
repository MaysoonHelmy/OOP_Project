package com.example.pet_shelter;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class OperationRoomController {
    @FXML
    private ImageView Background;

    @FXML
    private GridPane Grid;

    @FXML
    private Label Label_1;

    @FXML
    private Label Label_2;

    @FXML
    private Text Title;

    @FXML
    private ScrollPane Scroll;

   @FXML
    private void initialize() {
        List<OperationRoom> operationRooms = getData();
        createGridPane();
        addOperationRoomsToGridPane(operationRooms);
    }

    private List<OperationRoom> getData() {
        ArrayList<OperationRoom> operationRooms = new ArrayList<>();

        // Create operation rooms
        for (int i = 1; i <= 3; i++) {
            OperationRoom room = new OperationRoom(i);
            operationRooms.add(room);
        }

        // Add slots to each room
        for (OperationRoom room : operationRooms) {
            for (int i = 1; i <= 3; i++) {
                room.addSlot("Slot " + i);
            }
        }

        // Accessing the slots in each room
        for (OperationRoom room : operationRooms) {
            System.out.println("Room " + room.getRoomNumber() + " slots: " + room.getSlots());
        }
        return operationRooms;
    }

    private void createGridPane() {
        Grid.setPadding(new Insets(10));
        Grid.setHgap(5);
        Grid.setVgap(5);
    }

    private void addOperationRoomsToGridPane(List<OperationRoom> operationRooms) {
        int row = 1;

        // Add operation rooms and slots to the grid pane
        for (OperationRoom room : operationRooms) {
            Label roomLabel = new Label("Room " + room.getRoomNumber());
            Grid.add(roomLabel, 0, row );
            roomLabel.setFont(Font.font("Times new roman",32));
            GridPane.setHalignment(roomLabel, Pos.CENTER.getHpos());
            GridPane.setValignment(roomLabel, Pos.CENTER.getVpos());

             VBox slotsVBox = new VBox();
               slotsVBox.setSpacing(5);
            ArrayList<String> slots = room.getSlots();

            for (int i = 0; i < slots.size(); i++) {
                Label slotLabel = new Label(slots.get(i));

                Grid.add(slotLabel, 1, row );

                GridPane.setHalignment(slotLabel, Pos.CENTER.getHpos());
                slotLabel.setFont(Font.font("Times new roman",32));
            }
            Grid.add(slotsVBox, 1 , row);
             GridPane.setHalignment(slotsVBox, Pos.CENTER.getHpos());
             GridPane.setValignment(slotsVBox, Pos.CENTER.getVpos());

              row ++;

        }
        }


    }