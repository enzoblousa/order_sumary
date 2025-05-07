package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {
    public static void main(String[] args)throws Exception{
        Product product = new Product();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        String dateBirth = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dateBirth);

        Client client = new Client(name, email, date);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order =  new Order(new Date(), status, client);

        System.out.print("How many items to this order?: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            sc.nextLine();
            System.out.println("Enter #"+ i + " item data");
            System.out.print("Name: ");
            String nameP = sc.nextLine();
            
            System.out.print("Price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            product = new Product(nameP,productPrice);
            OrderItem item = new OrderItem(product, productPrice, quantity);
            order.addItem(item);
        }
        
            System.out.println(order);

        sc.close();
    }
    
}
