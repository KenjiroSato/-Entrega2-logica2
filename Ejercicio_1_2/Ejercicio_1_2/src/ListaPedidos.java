public class ListaPedidos {
    private Pedido cabeza;

    public void agregarPedido(String producto, int cantidad) {
        Pedido nuevo = new Pedido(producto, cantidad);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Pedido temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public void mostrarPedido() {
        Pedido temp = cabeza;
        while (temp != null) {
            System.out.println("Pedido: " + temp.productos + " Cantidad: " + temp.cantidad);
            temp = temp.siguiente;
        }
    }
}

class Pedido {
    String productos;
    int cantidad;
    Pedido siguiente;

    public Pedido(String productos, int cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.siguiente = null;
    }
}

