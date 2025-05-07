package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import entities.enums.OrderStatus;
import java.util.List;


public class Order {
    private Date moment;
    private OrderStatus Status;
    private List<OrderItem> orderItem = new ArrayList<>();
    private Client client;
    public Order(){
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        Status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return Status;
    }
 
    public void setStatus(OrderStatus status) {
        Status = status;
    }

    public void addItem(OrderItem item){
        orderItem.add(item);
    }
    public void removeItem(OrderItem item){
        orderItem.remove(item);
    }


    public double total(){
        double sum = 0;
        for (OrderItem item : orderItem) {
             sum += item.subtotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("Order Summary:\n");
            sb.append("Order moment: ");
            sb.append(sdf.format(moment)+ "\n");
            sb.append("Order status: "); 
            sb.append(Status + "\n"); 
            sb.append("Client: ");
            sb.append(client + "\n");
            sb.append("Order items:\n"); 
            for (OrderItem obj : orderItem) {
                sb.append(obj+ "\n");
            }
            sb.append("Total Price: $");
            sb.append(String.format("%.2f", total()));
            return sb.toString();
    }

         
    }
