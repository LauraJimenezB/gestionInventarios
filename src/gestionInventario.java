public class gestionInventario {

    // Función principal del programa
    public static void main(String[] args) {
        String[] nombresProductos = {"Producto A", "Producto B", "Producto C", "Producto D"};
        int[] inventario = {100, 50, 20, 5};
        int[] limite_critico = {10, 20, 15, 5};

        // Array para almacenar alertas de reabastecimiento
        boolean[] alertas = new boolean[inventario.length];

        // Datos de ventas realizadas
        int[] ventas = {10, 30, 5, 0};
    }
}
