import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        agregarProductos(productos);
        Scanner entrada = new Scanner(System.in);
        int opcionUsuario;

        //MENU
        do {
            System.out.println("""
                        Menu Opciones:
                        1. Agregar Producto
                        2. Listar Productos
                        3. Buscar / Actualizar Producto
                        4. Eliminar Producto
                        5. Crear un Pedido
                        6. Listar Pedidos
                        7. Salir
                        
                        Elija una opción:
                        """);

            opcionUsuario = entrada.nextInt();

            switch(opcionUsuario){
                case 1 -> agregarProducto(productos);
                case 2 -> listarProductos(productos);
                case 3 -> modificarProducto(productos);
                case 4 -> eliminarProducto(productos);
                case 5 -> crearPedido();
                case 6 -> listarPedidos();
                case 7 -> Salir();
            }

        } while (opcionUsuario != 7);

    }

    private static void agregarProductos(ArrayList<Producto> productos) {
        Producto p1 = new Producto("p1", 90,10);
        Producto p2 = new Producto("p1", 90,10);
        productos.add(p1);
        productos.add(p2);
    }

    private static void agregarProducto(ArrayList<Producto> productos) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("nombre producto");
        String nombre = entrada.nextLine();
        System.out.printf("ingrese precio %s", nombre);
        double precio = entrada.nextDouble();

        System.out.printf("ingrese stock %s", nombre);
        int stock = entrada.nextInt();

        Producto producto = new Producto(nombre, precio, stock);

        productos.add(producto);

        System.out.println("producto cargado");
    }

    private static void listarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("no hay productos cargados");
        } else {
            for (Producto producto : productos) {
                producto.mostrarInfo();
            }
        }
    }


    private static void modificarProducto(ArrayList<Producto> productos) {
        System.out.println("Buscar / Actualizar Producto");
    }


    private static void eliminarProducto(ArrayList<Producto> productos) {
        System.out.println("Eliminar Producto");
    }

    private static void crearPedido() {
        System.out.println("Crear un Pedido");
    }

    private static void listarPedidos() {
        System.out.println("Listar Pedidos");
    }

    private static void Salir() {
        System.out.println("Salir");
    }
}