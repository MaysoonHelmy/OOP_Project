package com.example.pet_shelter;
import java.time.LocalDateTime;
import java.util.*;


public class OperationRoom extends Display {
    private int roomNumber;
    private ArrayList<String> slots;

    public OperationRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        this.slots = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<String> getSlots() {
        return slots;
    }

    public void addSlot(String slot) {
        slots.add(slot);
    }
    @Override
    public void displayInfo() {

    }
}

