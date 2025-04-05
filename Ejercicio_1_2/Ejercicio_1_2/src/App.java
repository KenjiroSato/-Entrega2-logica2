import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        ListaPedidos listasimple = new ListaPedidos();
        ListaDoblePedidos listaDoble = new ListaDoblePedidos();
        ListaCircularPedidos listaCirculars = new ListaCircularPedidos();

        System.out.println("Bienvenido al sistema de inventario de el chuzo");
        System.out.println("Productos disponibles:");
        inventario.mostrarInventario();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Mostrar pedido en lista simple");
            System.out.println("3. Mostrar pedido en lista doble adelante");
            System.out.println("4. Mostrar pedido en lista doble atrás");
            System.out.println("5. Mostrar pedido en lista circular");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar el buffer
                continue;
            }

            if (opcion == 6) {
                System.out.println("Saliendo del sistema...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad;
                    try {
                        cantidad = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Cantidad inválida. Intente nuevamente.");
                        scanner.nextLine(); // Limpiar el buffer
                        continue;
                    }

                    int indice = inventario.buscarProductos(producto);
                    if (indice == -1) {
                        System.out.println("Producto no encontrado.");
                        continue;
                    }
                    if (!inventario.verificarStock(indice, cantidad)) {
                        System.out.println("Stock insuficiente.");
                        continue;
                    }

                    inventario.actualizarInventario(indice, cantidad);
                    System.out.println("Seleccione dónde desea agregar el pedido:");
                    System.out.println("1. Lista simple");
                    System.out.println("2. Lista doble");
                    System.out.println("3. Lista circular");
                    System.out.print("Ingrese una opción: ");
                    
                    int opcionLista;
                    try {
                        opcionLista = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Entrada inválida. Intente nuevamente.");
                        scanner.nextLine(); // Limpiar el buffer
                        continue;
                    }

                    switch (opcionLista) {
                        case 1:
                            listasimple.agregarPedido(producto, cantidad);
                            System.out.println("Pedido agregado a la lista simple.");
                            break;
                        case 2:
                            listaDoble.agregarPedido(producto, cantidad);
                            System.out.println("Pedido agregado a la lista doble.");
                            break;
                        case 3:
                            listaCirculars.agregarPedido(producto, cantidad);
                            System.out.println("Pedido agregado a la lista circular.");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                case 2:
                    System.out.println("Pedidos en lista simple:");
                    listasimple.mostrarPedido();
                    break;

                case 3:
                    System.out.println("Pedidos en lista doble (adelante):");
                    listaDoble.mostrarPedidoAdelante();
                    break;

                case 4:
                    System.out.println("Pedidos en lista doble (atrás):");
                    listaDoble.mostrarPedidoAtras();
                    break;

                case 5:
                    System.out.println("Pedidos en lista circular:");
                    listaCirculars.mostrarPedidoCircular();
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
