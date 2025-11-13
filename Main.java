import java.util.Scanner;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = true;
        LinkedList<Vehiculo> Vehiculos = new LinkedList<>();
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();
        while (salir) {
            System.out.println("----- SISTEMA DE RENTING PARA VEHICULOS -----");
            System.out.println("1. GESTIÓN DE CLIENTES");
            System.out.println("2. GESTIÓN DE VEHÍCULOS");
            System.out.println("3. GESTIÓN DE CONTRATOS DE RENTING");
            System.out.println("4. IMPRIMIR INFORME GENERAL");
            System.out.println("5. SALIR DEL SISTEMA");
            System.out.println("Seleccione una opción: ");
            opcion = v.ValidarEntero(sc);

            switch (opcion) {
                case 1:
                    // gestión de clientes
                    break;
                case 2:
                    m.MenuGestionVehiculos(sc, Vehiculos, m, v);
                    break;
                case 3:
                    // gestión de contratos
                    break; 
                case 4:
                // informe general
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    salir = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
        }
        }
    }
}