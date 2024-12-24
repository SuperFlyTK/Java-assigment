public class Main {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item(1, "Laptop", 800.00);
        Item item2 = new Item(2, "Mouse", 20.00);

        // Create customers
        Customer customer1 = new Customer(1, "Alice", "alice@example.com");
        Customer customer2 = new Customer(2, "Bob", "bob@example.com");

        // Create orders
        Order order1 = new Order(1, customer1, item1, 2);
        Order order2 = new Order(2, customer2, item2, 5);

        // Output to console
        System.out.println(order1);
        System.out.println(order2);

        // Compare orders
        System.out.println("Are the orders for the same customer? " + order1.getCustomer().equals(order2.getCustomer()));
        System.out.println("Is the total price of order1 greater than order2? " + (order1.calculateTotalPrice() > order2.calculateTotalPrice()));
    }
}