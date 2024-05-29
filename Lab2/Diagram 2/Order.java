public class Order {
    private int price;
    private String date;

    public Order(int price, String date) {
        this.price = price;
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    
    public int getPrice() {
        return price;
    }

    
}
