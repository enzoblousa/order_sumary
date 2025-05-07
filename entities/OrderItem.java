package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(){
    }

    public OrderItem(Product product, Double price,Integer quantity) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }
    public double subtotal(){
        return price * quantity;
        
    }
    @Override
public String toString() {
    return product.getName() + "\n" 
            + "  Price: $" + String.format("%.2f", price) + "\n"
            + "  Quantity: " + quantity + "\n"
            + "  Subtotal: $" + String.format("%.2f", subtotal());
}

}
