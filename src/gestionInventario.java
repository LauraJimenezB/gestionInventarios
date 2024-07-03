public class gestionInventario {

    public static void main(String[] args) {
        String[] nombresProductos = {"Producto A", "Producto B", "Producto C", "Producto D"};

        // Stock inicial
        int[] inventario = {100, 50, 20, 5};

        // Límite crítico para generar alerta de reabastecimiento
        int[] limite_critico = {10, 20, 15, 5};

        // Array para almacenar alertas de reabastecimiento (empiezan en false)
        boolean[] alertas = new boolean[inventario.length];

        // Datos de ventas realizadas
        int[] ventas = {10, 30, 5, 0};

        mostrarInventario(nombresProductos, inventario, "Inventario inicial:");

        actualizarInventario(inventario, ventas);

        generarAlertas(inventario, limite_critico, alertas);

        mostrarInventario(nombresProductos, inventario, "\nInventario final:");

        mostrarAlertas(nombresProductos, alertas);
    }

    private static void actualizarInventario(int[] inventario, int[] ventas) {
        for (int i = 0; i < inventario.length; i++) {
            inventario[i] -= ventas[i];
        }
    }

    private static void mostrarInventario(String[] nombres, int[] inventario, String nombre) {
        System.out.println(nombre);
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(nombres[i] + ": " + inventario[i] + " unidades");
        }
    }

    private static void generarAlertas(int[] inventario, int[] limite_critico, boolean[] alertas) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] <= limite_critico[i]) {
                alertas[i] = true;
            }
        }
    }

    private static void mostrarAlertas(String[] nombres, boolean[] alertas) {
        System.out.println("\nAlertas de Reabastecimiento:");
        for (int i = 0; i < alertas.length; i++) {
            if (alertas[i]) {
                System.out.println("Reabastecer " + nombres[i]);
            }
        }
    }
}

