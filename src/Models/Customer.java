/*
 * Riley Bosetti
 * STN: 1108477
 * */
package Models;

import com.google.gson.annotations.SerializedName;

public class Customer {
    @SerializedName("id")
    private Integer id;
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("phoneNumber")
    private String phoneNumber;
    private Double totalPurchased;
    private String totalPurchasedStr;
    @SerializedName("purchases")
    private Product[] purchased;
    private Double regularPrice, salePrice;

    public Customer(Integer id, String firstName, String lastName, String phoneNumber, Product[] purchased) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setPurchased(purchased);
        setTotalPurchased();
        setRegularPrice();
        setSalePrice();
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

    public Double getTotalPurchasedStr() {
        return totalPurchased;
    }

    public String getTotalPurchased() {
        return totalPurchasedStr;
    }

    public void setTotalPurchased() {
        double total = 0;
        for (Product item: this.purchased) {
            total += item.getSalesPrice();
        }

        int twoDecCheck = (int)total * 100;
        total = twoDecCheck / 100;
        String toStr = "$" + total;

        this.totalPurchased = total;
        this.totalPurchasedStr = toStr;
    }

    public void setRegularPrice(){
        double reg = 0;
        for (Product item: this.purchased) {
            reg += item.getRegularPrice();
        }
        this.regularPrice = reg;
    }

    public void setSalePrice(){
        double sales = 0;

        for (Product item: this.purchased) {
            sales += item.getSalesPrice();
        }
        this.salePrice = sales;
    }

    public boolean saveMoreThanFive(){
        if(this.regularPrice - this.salePrice >= 5) {
            return true;
        }
        return false;
    }
}
