import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final ArrayList<Product> products = new ArrayList<>();

    public void addDefaultProducts() {
        products.addAll(List.of(
                new Product("Chair", 90, 10),
                new Product("Book", 90, 20),
                new Product("Clock", 45.50, 15),
                new Product("Lamp", 35.99, 8),
                new Product("Pillow", 25.00, 25),
                new Product("Curtains", 60.00, 12),
                new Product("Vase", 30.75, 20),
                new Product("Rug", 120.00, 5),
                new Product("Frame", 15.25, 30),
                new Product("Tiger Blanket", 25, 100),
                new Product("Candle", 12.00, 40)
        ));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                product.showInfo();
            }
        }
    }

    public Product searchByName(String name) {
        for (Product product : products) {
            if (product.containsName(name)) {
                return product;
            }
        }
        return null;
    }

    public boolean deleteById(int id) {
        return products.removeIf(product -> product.getId() == id);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
