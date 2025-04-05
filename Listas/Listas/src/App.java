public class App {
    public static void main(String[] args) throws Exception {
        ListaEnlazada lista=new ListaEnlazada();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(8);
        lista.insertar(305);
        lista.mostrar();
        lista.Eliminar(10);
        lista.mostrar();
    }
}
