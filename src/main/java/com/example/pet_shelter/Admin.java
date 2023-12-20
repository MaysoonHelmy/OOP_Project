package com.example.pet_shelter;

import java.util.ArrayList;
import java.util.List;


public class Admin extends person{
    public static List<vet>Vets=new ArrayList<>();
    public static List<Client> clientList=new ArrayList<>();
    // Set data for 5 Client objects
    public void setAdmin() {
        for (int i = 0; i < 20; i++) {
            Client client = new Client();
            client.setName("Client" + (i + 1));
            client.setId("ClientID" + (i + 1));
            client.setEmail("client" + (i + 1) + "@gmail.com");

            // Set password and phone number differently for each client
            client.setPassword("123456789");
            client.setPhone(generateRandomPhoneNumber());

            // Add the client object to the ArrayList
            clientList.add(client);
        }
    }

    private static String generateRandomPassword() {
        return "RandomPassword" + (int) (Math.random() * 1000);
    }

    private static String generateRandomPhoneNumber() {
        return "RandomPhoneNumber" + (int) (Math.random() * 1000000000);
    }
    public static List<MoneyDonation>AllDonatedMoney=new ArrayList<>();
    public static List<Pet>AllPets=new ArrayList<>();
    public static List<OperationRoom>AllRooms=new ArrayList<>();

    public static void check(){
        for(int i=0;i<clientList.size();i++)
        {
            Client client=new Client();
            client=clientList.get(i);
            System.out.println(client.getName()+" A");

            for(int j=0;j<client.OtherDonated.size();j++)
            {
                OtherDonation otherDonation=new OtherDonation();
                otherDonation=client.OtherDonated.get(j);
                System.out.println(otherDonation.getClientName()+" A");
                System.out.println(otherDonation.getType()+" A");
            }
        }
    }

    public static void check1() {
        for (int i = 0; i < clientList.size(); i++) {
            Client client = new Client();
            client = clientList.get(i);
            System.out.println(client.getName() + " B");

            for (int j = 0; j < client.DonatedMoney.size(); j++) {
                MoneyDonation moneyDonation = new MoneyDonation();
                moneyDonation = client.DonatedMoney.get(j);
                System.out.println(moneyDonation.getClientName() + " B");
                System.out.println(moneyDonation.getType() + " B");
                System.out.println(moneyDonation.getExp() + " B");
                System.out.println(moneyDonation.getCardNumber() + " B");
            }
        }

    }
    public static void check3(){
        for(int i=0;i<clientList.size();i++)
        {
            Client client=new Client();
            client=clientList.get(i);
            System.out.println(client.getName()+" C");

            for(int j=0;j<client.AdoptedPets.size();j++)
            {
                Adoption adoption=new Adoption();
                adoption=client.AdoptedPets.get(j);
                System.out.println(adoption.adoptedPet.getName()+" C");
                System.out.println(adoption.adoptedPet.getId()+" C");
                System.out.println(adoption.adoptedPet.getType()+" C");
                //System.out.println(moneyDonation.getCardNumber()+" C");
            }
        }
    }
    public static int checkClient(String password,String id)
    {
        for(int i=0;i<clientList.size();i++)
        {
            Client client=new Client();
            client=clientList.get(i);
            if((password.equals(client.getPassword()))&&(id.equals(client.getId()))) {
                return i;
            }
        }
        return 0;
    }
}