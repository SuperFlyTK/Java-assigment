class Order {
    private int id;
    private Customer customer;
    private Item item;
    private int quantity;

    // Constructor
    public Order(int id, Customer customer, Item item, int quantity) {
        this.id = id;
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", item=" + item +
                ", quantity=" + quantity +
                ", totalPrice=" + calculateTotalPrice() +
                '}';
    }
}
