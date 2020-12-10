package Models;

public class Product {
  private String name, sku;
  private Double salesPrice, regularPrice;

  public Product(String sku, String name, Double salesPrice, Double regularPrice) {
    setSku(sku);
    setName(name);
    setSalesPrice(salesPrice);
    setRegularPrice(regularPrice);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalesPrice() {
    return salesPrice;
  }

  public void setSalesPrice(Double salesPrice) {
    this.salesPrice = salesPrice;
  }

  public Double getRegularPrice() {
    return regularPrice;
  }

  public void setRegularPrice(Double regularPrice) {
    this.regularPrice = regularPrice;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }
}
