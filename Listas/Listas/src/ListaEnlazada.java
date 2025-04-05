public class ListaEnlazada {
    private Nodo cabeza;//primer nodo 

    public ListaEnlazada(){
        this.cabeza=null;

    }
//  Este metodo inserta un nuevo nodo al final 
    public void insertar(int dato){
        Nodo nuevo = new Nodo(dato);
        if(cabeza==null){
            cabeza= nuevo;
        }else{
            Nodo temp =cabeza;
            while(temp.siguiente != null){
                temp = temp.siguiente;

            }
        }
    }
    // Eliminar un Nodo

    public void Eliminar(int dato){
        if(cabeza==null) return;
        if (cabeza.dato== dato) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo temp=cabeza;
        while (temp.siguiente !=null && temp.siguiente.dato != dato) {
            temp = temp.siguiente;
        }
        if (temp.siguiente !=null){
            temp.siguiente = temp.siguiente.siguiente;
        }
    }
    // MOstra y recorrer la lista
    public void mostrar(){
        Nodo temp = cabeza;
        while(temp != null){
            System.out.println(temp.dato + "-->");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

}
