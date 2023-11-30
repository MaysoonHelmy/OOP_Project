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
 // Fill the pets array
    Display_pets pets1 = new Display_pets("Mickey",1,"cat",1,"Not Adopted",true,"Treated");
    Display_pets pets2 = new Display_pets("Roy",2,"dog",1,"Not Adopted",true,"Treated");
    Display_pets pets3 = new Display_pets("Simba",3,"cat",1,"Not Adopted",true,"Treated");
    Display_pets pets4 = new Display_pets("Martin",4,"dog",1,"Adopted",false,"Sick");
    Display_pets pets5 = new Display_pets("Moslo",5,"cat",1,"Adopted",false,"Sick");
    Display_pets pets6 = new Display_pets("lala",6,"dog",1,"Adopted",false,"Sick");
    Display_pets pets7 = new Display_pets("Mando",7,"dog",1,"Adopted",false,"Sick");
    Display_pets pets8 = new Display_pets("Tom",8,"dog",1,"Adopted",false,"Sick");
    Display_pets pets9 = new Display_pets("Jerry",9,"dog",1,"Adopted",false,"Sick");
    Display_pets pets10 = new Display_pets("Timon",10,"dog",1,"Not Adopted",true,"Treated");
    Display_pets pets11= new Display_pets("Bomba",11,"dog",1,"Not Adopted",true,"Treated");
    Display_pets pets12= new Display_pets("Scar",12,"dog",1,"Not Adopted",true,"Treated");
    Display_pets pets13= new Display_pets("Poe",13,"dog",1,"Adopted",false,"Sick");
    Display_pets pets14= new Display_pets("bahr",14,"dog",1,"Adopted",false,"Sick");
    Display_pets pets15= new Display_pets("Bambi",15,"dog",1,"Adopted",false,"Sick");
    Display_pets pets16= new Display_pets("Panda",16,"dog",1,"Not Adopted",true,"Treated");
    Display_pets pets17= new Display_pets("Brownie",17,"dog",1,"Not Adopted",true,"Treated");
    Display_pets pets18= new Display_pets("Angel",18,"dog",1,"Not Adopted",true,"Treated");
    Display_pets pets19= new Display_pets("Rex",19,"dog",1,"Adopted",false,"Sick");
    Display_pets pets20= new Display_pets("Dino",20,"dog",1,"Adopted",false,"Sick");

    public void Fillarray(){
        pets[0] = pets1;
        pets[1] = pets2;
        pets[2] = pets3;
        pets[3] = pets4;
        pets[4] = pets5;
        pets[5] = pets6;
        pets[6] = pets7;
        pets[7] = pets8;
        pets[8] = pets9;
        pets[9] = pets10;
        pets[10] = pets11;
        pets[11] = pets12;
        pets[12] = pets13;
        pets[13] = pets14;
        pets[14] = pets15;
        pets[15] = pets16;
        pets[16] = pets17;
        pets[17] = pets18;
        pets[18] = pets19;
        pets[19] = pets20;
    }
    // Display the pets

    @Override
    public void displayInfo() {

        for (int i = 0; i < 20; i++) {

            System.out.println(pets[i]);

        }

    }
}
