package org.example;

public class Address {
    private  String city;
    private int houseNo;
    private String street;

    public Address(String city, int houseNo, String street) {
        this.city = city;
        this.houseNo = houseNo;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", houseNo=" + houseNo +
                ", street='" + street + '\'' +
                '}';
    }
}
