public class Inventario {
    private String[] Productos = {"laptops", "mouse", "teclados", "monitores", "impresoras"};
    private double[][] stockPrecio = {
        {10, 50000},
        {15, 20000},
        {12, 10000},
        {2, 30000},
        {5, 15000}
    };

    public void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (int i = 0; i < Productos.length; i++) {
            System.out.println("Producto: " + Productos[i] + " Stock: " + stockPrecio[i][0] + " Precio: " + stockPrecio[i][1]);
        }
    }

    public int buscarProductos(String nombre) {
        for (int index = 0; index < Productos.length; index++) {
            if (Productos[index].equals(nombre)) {
                return index;
            }
        }
        return -1;
    }

    public boolean verificarStock(int indice, int cantidad) {
        if (indice < 0 || indice >= stockPrecio.length) {
            System.out.println("Índice fuera de rango.");
            return false;
        }
        if (stockPrecio[indice][0] >= cantidad) {
            return true;
        } else {
            System.out.println("Stock insuficiente para el producto: " + Productos[indice]);
            return false;
        }
    }

    public void actualizarInventario(int indice, int cantidad) {
        if (verificarStock(indice, cantidad)) {
            stockPrecio[indice][0] -= cantidad;
            System.out.println("Inventario actualizado. Producto: " + Productos[indice] + " Nuevo stock: " + stockPrecio[indice][0]);
        } else {
            System.out.println("No se pudo actualizar el inventario debido a stock insuficiente.");
        }
    }
}
