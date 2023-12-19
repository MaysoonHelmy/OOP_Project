package com.example.pet_shelter;

public class MoneyDonation extends Donation {
    private int Value;
    private int CardNumber;
    private int CVV;
    private int exp;

    private String Type;

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public void setType() {
        this.Type="Money";
    }

}
