package com.example.pet_shelter;
import java.util.ArrayList;
import java.util.List;

public class vets extends Person {
    private int YearsOfExperience;

    public List<Display_pets> pets = new ArrayList<>();


    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int YearsOfExperience) {
        this.YearsOfExperience = YearsOfExperience;
    }
}
