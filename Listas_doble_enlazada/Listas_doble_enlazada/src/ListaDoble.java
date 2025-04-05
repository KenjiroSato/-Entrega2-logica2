public class ListaDoble {
    private Nodo head;
    //este metodo inserta un nodo al inicio de la lista
    public void insertarAlInicio(int data){
        Nodo nuevoNodo = new Nodo(data);
        if(head != null){
            nuevoNodo.next = head;
            head.prev = nuevoNodo;
    }
        head = nuevoNodo;
    }
    //este metodo inserta un nodo al final de la lista
    public void insertarAlFinal(int data){
        Nodo nuevNodo = new Nodo(data);
        if(head == null){
            head = nuevNodo;
            return;
    }
    Nodo temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = nuevNodo;
    nuevNodo.prev = temp;
    }
    //metodo que elimina al inicio de la lista	
    public void eliminaAlInicio(){
        if (head == null){
            System.out.println("la Lista esta vacia nada que mostrar");
            return;
    }   
    head = head.next;
    if(head != null){
        head.prev = null;
    }
    }
    public void eliminaFinal(){
        if(head == null){
            System.out.println("La lista esta vacia");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Nodo temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    } 
    // Mostrar lista en orden 
    public void Mostrarlista(){
        if(head == null){
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo temp = head;
        System.out.println("lista en orden");
        while(temp != null){
            System.out.println(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Mostrar lista en orden inverso
    public void MostrarlistaAlreves(){
        if(head == null){
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("lista en orden inverso");
        while(temp != null){
            System.out.println(temp.data + "<-->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}


