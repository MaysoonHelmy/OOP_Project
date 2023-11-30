package com.example.pet_shelter;

public class Display_pets extends Display {
    private String name;
    private int petId;
    private String petType;
    private int age;
    private String adoptionStatus;
    private boolean readyForAdoptionStatus;
    private String treatmentStatus;
    public Display_pets [] pets = new Display_pets[20];

    public Display_pets(String name, int petId, String petType, int age, String adoptionStatus,
               boolean readyForAdoptionStatus, String treatmentStatus) {
        this.name = name;
        this.petId = petId;
        this.petType = petType;
        this.age = age;
        this.adoptionStatus = adoptionStatus;
        this.readyForAdoptionStatus = readyForAdoptionStatus;
        this.treatmentStatus = treatmentStatus;
    }

    // Getters and setters for properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(String adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public boolean isReadyForAdoptionStatus() {
        return readyForAdoptionStatus;
    }

    public void setReadyForAdoptionStatus(boolean readyForAdoptionStatus) {
        this.readyForAdoptionStatus = readyForAdoptionStatus;
    }

    public String getTreatmentStatus() {
        return treatmentStatus;
    }

    public void setTreatmentStatus(String treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }

    // Display the pets

    @Override
    public void displayInfo() {

        for (int i = 0; i < 20; i++) {

            System.out.println(pets[i]);

        }

    }
}
