Order Management System
A simple Java application for managing customer orders with products, quantities, and total calculations.

📋 Features
Customer registration with name, email, and birth date

Order creation with status tracking (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED)

Product management with name and price

Order items with quantity and subtotal calculation

Automatic order total calculation

Formatted order summary output

🛠️ How It Works
Customer Registration:

Enter customer name, email, and birth date

Data is stored in a Client object

Order Creation:

Select order status from available options

Order timestamp is automatically recorded

Adding Products:

Specify product name and price

Add multiple items with quantities

Each item calculates its subtotal (price × quantity)

Order Summary:

Displays all order details including:

Customer information

Order date and status

List of all items with prices and quantities

Calculated total price

EXEMPLE USAGE 

Enter cliente data:
Name: John Doe
Email: john@example.com
Birth Date (DD/MM/YYYY): 15/05/1985
Enter order data: 
Status: PROCESSING
How many items to this order?: 2
Enter #1 item data
Name: Laptop
Price: 1200.00
Quantity: 1
Enter #2 item data
Name: Mouse
Price: 25.50
Quantity: 2

Order Summary:
Order moment: 22/05/2024 14:30:45
Order status: PROCESSING
Client: John Doe (Email: john@example.com | Birth: 15/05/1985)
Order items:
Laptop
  Price: $1200.00
  Quantity: 1
  Subtotal: $1200.00
Mouse
  Price: $25.50
  Quantity: 2
  Subtotal: $51.00
Total Price: $1251.00
