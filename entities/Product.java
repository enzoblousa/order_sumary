package entities;

public class Product {
    private String name;
    private Double productPrice;

    public Product(){
    }

    public Product(String name, Double price) {
        this.name = name;
        this.productPrice = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return productPrice;
    }

    public void setPrice(Double price) {
        this.productPrice = price;
    }

    
}
