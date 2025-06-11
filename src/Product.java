public class Product {
    private static int NEXT_ID = 1;
    private final int id;
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.id = NEXT_ID++;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void showInfo() {
        System.out.printf("""
                ----------------------------
                - ID     : %d
                - Name   : %s
                - Price  : $%,.2f
                - Stock  : %d
                ----------------------------
                %n""", id, name, price, stock);
    }

    public boolean containsName(String search) {
        return name.toLowerCase().contains(search.toLowerCase());
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
