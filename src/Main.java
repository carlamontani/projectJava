import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.addDefaultProducts();
        Scanner input = new Scanner(System.in);
        int userOption;

        do {
            System.out.println("""
                    Options Menu:
                    1. Add Product
                    2. List Products
                    3. Search / Update Product
                    4. Delete Product
                    5. Create an Order
                    6. List Orders
                    7. Exit

                    Choose an option:
                    """);

            userOption = input.nextInt();
            input.nextLine();

            switch (userOption) {
                case 1 -> {
                    System.out.println("Enter product name:");
                    String name = input.nextLine();
                    System.out.printf("Enter price for %s: ", name);
                    double price = input.nextDouble();
                    System.out.printf("Enter stock for %s: ", name);
                    int stock = input.nextInt();
                    input.nextLine();
                    manager.addProduct(new Product(name, price, stock));
                    System.out.println("Product added.");
                }
                case 2 -> manager.listProducts();
                case 3 -> {
                    System.out.println("Enter product name to search:");
                    String name = input.nextLine();
                    Product found = manager.searchByName(name);
                    if (found != null) {
                        found.showInfo();
                    } else {
                        System.out.println("Product not found.");
                    }
                }
                case 4 -> {
                    System.out.println("Enter product ID to delete:");
                    int id = input.nextInt();
                    boolean deleted = manager.deleteById(id);
                    System.out.println(deleted ? "Product deleted." : "Product not found.");
                }
                case 5 -> System.out.println("Create a New Order");
                case 6 -> System.out.println("List Orders");
                case 7 -> System.out.println("Goodbye");
            }

        } while (userOption != 7);
    }
}
