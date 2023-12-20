package com.example.pet_shelter;

public class Adoption {
    private String Appointment;

    public Pet adoptedPet=new Pet();

    public String getAppointment() {
        return Appointment;
    }

    public void setAppointment(String appointment) {
        Appointment = appointment;
    }
}
