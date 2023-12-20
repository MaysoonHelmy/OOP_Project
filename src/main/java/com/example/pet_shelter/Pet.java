package com.example.pet_shelter;
import java.util.ArrayList;

public class Pet {
    public static ArrayList<Pet> Pets = new ArrayList<>();
    // public static final int PETSNUMBER = 20;
//    public static Pet[] pets = new Pet[PETSNUMBER];

    private String name;
    private boolean assignedToRoom;
    private int id;
    static private String prescription;

    static private String describe;
    private boolean readyForAdopt = false;


    private String gender;
    private String imgSrc;
    private String color;


    public int slot = -1;

    public Pet() {

    }



    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    private int roomNumber;

    public enum Pet_type {
        Cat, Dog
    }

    public enum PetStatus {
        Pendnding, no, on_progress, totally_treated
    }
//    public enum Room {
//        room1, room2, room3, room4
//    }

    public PetStatus status;
    public Pet_type type;
    //Room whichRoom;
    public Pet(String name, int id, PetStatus status, Pet_type type){
        this.name = name;
        this.type = type;
        this.status = status;
        this.id = id;
    } public Pet(String name, int id, PetStatus status, Pet_type type, String prescription, boolean readyForAdopt){
        this.prescription = prescription;
        this.name = name;
        this.type = type;
        this.status = status;
        this.id = id;
        this.readyForAdopt= readyForAdopt;
    }

    public void setReadyForAdopt(boolean readyForAdopt) {
        this.readyForAdopt = readyForAdopt;
    }

    public boolean getReadyForAdopt(){
        return readyForAdopt;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrescription() {
        return prescription;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        Pet.describe = describe;
    }

    Pet(String name, Pet_type type) {
        this.id = Pets.size() + 1;
        this.name = name;
        this.type = type;
        this.status = PetStatus.Pendnding;
    }

    //returning null if there's no such pet
    public static Pet getPet(int id) {
        for (Pet pet : Pets) {
            if (pet.getId() == id)
                return pet;
        }
        return null;
    }
    // status
    public void updateStatus(PetStatus status) {
        this.status = status;

    }
    public void setStatus(PetStatus status) {
        this.status = status;
    }
    public PetStatus getStatus() {
        return status;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    static Pet pet;

    public Pet_type getType() {
        return type;
    }

    public void setType(Pet_type type) {
        this.type = type;
    }

    public static void setData() {


        pet = new Pet("Molly", 2022170901, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Molly.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Avenger", 2022170902, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Molly.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Lucy", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Lucy.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Dingo", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Dingo.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Sparky", 111456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Sparky.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Tilly", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Tilly.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Shadow", 222456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Shadow.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Romeo", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Romeo.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Rocco", 333456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Rocco.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Pip", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Pip.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Oscar", 444456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Oscar.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Mocha", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Mocha.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Mia", 555456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Mia.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Lexi", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Female");
        pet.setImgSrc("Lexi.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Jess", 666456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Jess.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Hank", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male ");
        pet.setImgSrc("Hank.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Bo", 777456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Bo.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Benji", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Benji.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("AJ", 888456789, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("AJ.png");
        pet.setDescribe("A Cute Calm Dog,likes to play \n and likes to eat Meet");
        Pets.add(pet);

        pet = new Pet("Abbe", 123456788, PetStatus.Pendnding, Pet_type.Dog);
        pet.setGender("Male");
        pet.setImgSrc("Abbe.png");
        pet.setDescribe("A Naughty Dog,likes to play \\n and likes to eat Dry Food");
        Pets.add(pet);

        pet = new Pet("Grace", 123456789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Grace.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Oliver", 123777789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Oliver.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Frito", 123456345, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Frito.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Ella", 123898789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Ella.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Kiara", 123456000, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Kiara.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Sissy", 123000789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Sissy.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Leo", 123456878, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Leo.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Rambo", 123456666, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Rambo.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Simon", 123654789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Simon.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Yoko", 123456678, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Yoko.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Kitty", 123101789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Kitty.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Lola", 123456833, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Lola.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Bono", 123444789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Bono.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Felix", 123456101, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Felix.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Frodo", 123222789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Frodo.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Sweetie", 123456099, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Sweetie.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Sam", 123323789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Sam.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Petunia", 123456555, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Petunia.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);

        pet = new Pet("Sophie", 123555789, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Female");
        pet.setImgSrc("Sophie.png");
        pet.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
        Pets.add(pet);

        pet = new Pet("Dexter", 123456444, PetStatus.Pendnding, Pet_type.Cat);
        pet.setGender("Male");
        pet.setImgSrc("Dexter.png");
        pet.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
        Pets.add(pet);







//        pets[10] = new Pet("soso", 2022170995, PetStatus.Pendnding, Pet_type.Dog);
//        pets[11] = new Pet("soso", 2022170995, PetStatus.Pendnding, Pet_type.Dog);
//        pets[12] = new Pet("soso", 2022170995, PetStatus.Pendnding, Pet_type.Dog);
//        pets[13] = new Pet("soso", 2022170995, PetStatus.Pendnding, Pet_type.Dog);
//        pets[14] = new Pet("soso", 2022170995, PetStatus.Pendnding, Pet_type.Dog);
//        pets[15] = new Pet("momo", 2022170989, PetStatus.Pendnding, Pet_type.Cat);
//        pets[16] = new Pet("momo", 2022170979, PetStatus.Pendnding, Pet_type.Cat);
//        pets[17] = new Pet("momo", 2022170969, PetStatus.Pendnding, Pet_type.Cat);
//        pets[18] = new Pet("momo", 2022170969, PetStatus.Pendnding, Pet_type.Cat);
//        pets[19] = new Pet("momo", 2022170959, PetStatus.Pendnding, Pet_type.Cat);

        // pets[19] = new Pet( "", 2022170980, "", "");
    }
}