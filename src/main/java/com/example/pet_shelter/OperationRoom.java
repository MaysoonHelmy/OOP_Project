package com.example.pet_shelter;
import java.time.LocalDateTime;
import java.util.*;

public class OperationRoom extends Display {
    private String id;
    private Operation_Slots[][] availableSlots = new Operation_Slots[4][2];
    public OperationRoom(String id) {
        this.id = id;
    }

    // Getters and setters for properties

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Operation_Slots[][] getOperationSlots() {
        return availableSlots;
    }

    public void setOperationSlots(Operation_Slots[][] operationSlots) {
        this.availableSlots = operationSlots;
    }
    // Create operation rooms
    OperationRoom room1 = new OperationRoom("Room 1");
    OperationRoom room2 = new OperationRoom("Room 2");
    OperationRoom room3 = new OperationRoom("Room 3");
    OperationRoom room4 = new OperationRoom("Room 4");

    // Create operation slots for room 1
    Operation_Slots slot1 = new Operation_Slots(room1, LocalDateTime.now(), LocalDateTime.now().plusHours(2));
    Operation_Slots slot2 = new Operation_Slots(room1, LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(5));

    // Create operation slots for room 2
    Operation_Slots slot3 = new Operation_Slots(room2, LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(3));
    Operation_Slots slot4 = new Operation_Slots(room2, LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(8));

    // Create operation slots for room 3
    Operation_Slots slot5 = new Operation_Slots(room3, LocalDateTime.now().plusHours(6), LocalDateTime.now().plusHours(10));
    Operation_Slots slot6 = new Operation_Slots(room3, LocalDateTime.now().plusHours(5), LocalDateTime.now().plusHours(12));

    // Create operation slots for room 4
    Operation_Slots slot7 = new Operation_Slots(room4, LocalDateTime.now().plusHours(8), LocalDateTime.now().plusHours(15));
    Operation_Slots slot8 = new Operation_Slots(room4, LocalDateTime.now().plusHours(9), LocalDateTime.now().plusHours(20));

    // Fill in the Operation Rooms Array
    public void Fillarray(){
        availableSlots[0][0]= slot1;
        availableSlots[0][1]= slot2;
        availableSlots[1][0]= slot3;
        availableSlots[1][1]= slot4;
        availableSlots[2][0]= slot5;
        availableSlots[2][1]= slot6;
        availableSlots[3][0]= slot7;
        availableSlots[3][1]= slot8;
    }
    // Display the Available slots in each room
    @Override
    public void displayInfo() {
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println(availableSlots[i][j]);

            }
        }
    }
}

