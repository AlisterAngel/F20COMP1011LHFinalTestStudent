/*
 * Riley Bosetti
 * STN: 1108477
 * */
package Models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    private Integer id;
    private String firstName, lastName, phoneNumber;
    private Product[] purchased;
    private Double totalPurchased;

    public Customer(Integer id, String firstName, String lastName, String phoneNumber, Product[] purchased) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setPurchased(purchased);
        setTotalPurchased();
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

    public Product[] getPurchased() {
        return purchased;
    }

    public void setPurchased(Product[] purchased) {
        this.purchased = purchased;
    }

    public Double getTotalPurchased() {
        return totalPurchased;
    }

    public void setTotalPurchased() {
        double total = 0;
        for (Product item: this.purchased) {
            total += item.getSalesPrice();
        }

        int twoDecCheck = (int)total * 100;
        total = twoDecCheck / 100;

        this.totalPurchased = total;
    }
}
