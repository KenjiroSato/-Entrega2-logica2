public class ListaCirculares {
    private Nodo cabeza = null;
    private Nodo cola = null;

    public void insertar(int x, int y){
        Nodo Nuevo = new Nodo(x, y);
        if (cabeza==null) {
            cabeza = Nuevo;
            cola = Nuevo;
            cabeza.siguiente = cabeza;
        }else{
            cola.siguiente = Nuevo;
            Nuevo.siguiente = cabeza;
            cola = Nuevo;
        }
    }
    public Nodo getcabeza(){
        return cabeza;
    }

}
