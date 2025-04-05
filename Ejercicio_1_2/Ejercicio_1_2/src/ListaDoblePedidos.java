public class ListaDoblePedidos {
    private Pedido cabeza;
    private Pedido cola;

    public void agregarPedido(String producto, int cantidad) {
        Pedido nuevo = new Pedido(producto, cantidad); // Se crea un nuevo pedido
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrarPedidoAdelante() {
        if (cabeza == null) {
            System.out.println("No hay pedidos en la lista doble");
            return;
        }

        Pedido temp = cabeza;
        while (temp != null) {
            System.out.println("Pedido Doble: " + temp.productos + " Cantidad: " + temp.cantidad);
            temp = temp.siguiente;
        }
    }

    public void mostrarPedidoAtras() {
        if (cola == null) {
            System.out.println("No hay pedidos en la lista doble");
            return;
        }

        Pedido temp = cola;
        while (temp != null) {
            System.out.println("Pedido Doble: " + temp.productos + " Cantidad: " + temp.cantidad);
            temp = temp.anterior;
        }
    }
}

class Pedido {
    String productos;
    int cantidad;
    Pedido siguiente;
    Pedido anterior;

    public Pedido(String productos, int cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.siguiente = null;
        this.anterior = null;
    }
}
