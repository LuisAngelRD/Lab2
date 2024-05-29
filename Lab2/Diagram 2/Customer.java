public class Customer {
    private String name;

    public Customer() { }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void pay(Order order) {
        System.out.println("Date of purchase " + order.getDate() + " Total: $" + order.getPrice());
    }
}
