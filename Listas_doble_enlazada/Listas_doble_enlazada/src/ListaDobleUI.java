import java.util.*;
public class ListaDobleUI {
    private ListaDoble lista;
    private Scanner scanner;
    
    public ListaDobleUI(){
        lista = new ListaDoble();
        scanner = new Scanner(System.in);
    }
    public void menu(){
        int opcion, valor;
        do{
            System.out.println("1.- Insertar al inicio");
            System.out.println("2.- Insertar al final");
            System.out.println("3.- Eliminar al inicio");
            System.out.println("4.- Eliminar al final");
            System.out.println("5.- Mostrar lista");
            System.out.println("6.- Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el valor al inicio");
                    valor = scanner.nextInt();
                    lista.insertarAlInicio(valor);
                    break;
                case 2:
                    System.out.println("Ingresa el valor al final");
                    valor = scanner.nextInt();
                    lista.insertarAlFinal(valor);
                    break;
                case 3:
                    lista.eliminaAlInicio();
                    System.out.println("Se elimino el primer nodo");
                    break;
                case 4:
                    lista.eliminaFinal();
                    System.out.println("Se elimino el ultimo nodo");
                    break;
                case 5:
                    lista.Mostrarlista();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while(opcion != 6);
    }

}
