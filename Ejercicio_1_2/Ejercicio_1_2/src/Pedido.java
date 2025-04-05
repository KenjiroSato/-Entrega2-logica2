public class Pedido {

    String productos;
    int cantidad;
    Pedido siguiente;
    Pedido anterior;
    public Pedido(String productos, int cantidad, Pedido siguiente, Pedido anterior) {//constructor
        this.productos = productos;
        this.cantidad = cantidad;
        this.siguiente = siguiente;
        this.anterior = anterior;
        
    }
}
