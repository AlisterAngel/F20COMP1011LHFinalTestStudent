package Models;

import java.util.ArrayList;

public class Customer {
    private Integer id;
    private String firstName, lastName, phoneNumber;
    private ArrayList<Product> purchased;

    public Customer(Integer id, String firstName, String lastName, String phoneNumber, ArrayList<Product> purchased) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setPurchased(purchased);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Product> getPurchased() {
        return purchased;
    }

    public void setPurchased(ArrayList<Product> purchased) {
        this.purchased = purchased;
    }
}
