package com.example.pet_shelter;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person{
    public List<vet>Vets=new ArrayList<>();
    public List<Client>Clients=new ArrayList<>();
    public List<MoneyDonation>AllDonatedMoney=new ArrayList<>();
    public List<Display_pets>AllPets=new ArrayList<>();
    public List<OperationRoom>AllRooms=new ArrayList<>();
}
