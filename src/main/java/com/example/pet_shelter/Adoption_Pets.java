package com.example.pet_shelter;

public class Adoption_Pets extends Display_pets {

    // Super Constructor
    public Adoption_Pets(String name, int petId, String petType, int age, String adoptionStatus, boolean readyForAdoptionStatus, String treatmentStatus) {
        super(name, petId, petType, age, adoptionStatus, readyForAdoptionStatus, treatmentStatus);
    }
    // Displaying Function
    @Override
    public void displayInfo() {
        while (!getAdoptionStatus().equals("Adopted")) {
            int i = 0;
            System.out.println(pets[i]);
            i++;
        }
    }
   // Function for Adoption

    public void adopt() {
        if (!getAdoptionStatus().equals("Adopted")) {
            setAdoptionStatus("Adopted");
        }
    }
}
