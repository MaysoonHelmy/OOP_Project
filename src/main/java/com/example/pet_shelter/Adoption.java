package com.example.pet_shelter;

public class Adoption {
    private String Appointment;

    public Display_pets adoptedPet=new Display_pets();

    public String getAppointment() {
        return Appointment;
    }

    public void setAppointment(String appointment) {
        Appointment = appointment;
    }
}
