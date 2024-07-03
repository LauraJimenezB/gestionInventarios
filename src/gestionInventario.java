public class gestionInventario {

    public static void main(String[] args) {
        String[] nombresProductos = {"Producto A", "Producto B", "Producto C", "Producto D"};
        int[] inventario = {100, 50, 20, 5};
        int[] limite_critico = {10, 20, 15, 5};

        // Array para almacenar alertas de reabastecimiento
        boolean[] alertas = new boolean[inventario.length];

        // Datos de ventas realizadas
        int[] ventas = {10, 30, 5, 0};

        mostrarInventario(nombresProductos, inventario, "Inventario inicial:");

        actualizarInventario(inventario, ventas);

        mostrarInventario(nombresProductos, inventario, "\nInventario final:");
    }

    private static void actualizarInventario(int[] inventario, int[] ventas) {
        for (int i = 0; i < inventario.length; i++) {
            inventario[i] -= ventas[i];
        }
    }

    private static void mostrarInventario(String[] nombres, int[] inventario, String nombre) {
        System.out.println(nombre);
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(nombres[i] + ": " + inventario[i] + " unidades"); // Mostrar nombre y cantidad de cada producto
        }
    }
}
