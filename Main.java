import java.util.Scanner;
import java.util.LinkedList;


public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    LinkedList<CarroSedan> listaSedan = new LinkedList<>();
    LinkedList<CamionetaSUV> listaSUV = new LinkedList<>();
    Metodos m = new Metodos();
	Validaciones v = new Validaciones();
    boolean salir = true;
    while (salir) {
        System.out.println("----- Menu de Vehiculos -----");
        System.out.println("1. Registrar Carro Sedan");
        System.out.println("2. Mostrar Carros Sedan");
        System.out.println("3. Registrar Camioneta SUV");
        System.out.println("4. Mostrar Camionetas SUV");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = v.ValidarEntero(sc);

        switch (opcion) {
            case 1:
                CarroSedan sedan = new CarroSedan("","",0,0,"","","");
                listaSedan.add(m.RegistrarSedan(sedan));
                break;
            case 2:
                m.MostrarSedan(listaSedan);
                break;
            case 3:
                CamionetaSUV suv = new CamionetaSUV("","",0,0,"","",0);
                listaSUV.add(m.RegistrarSUV(suv));
                break;
            case 4:
                m.MostrarSUV(listaSUV);
                break;
            case 5:
                salir = false;
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion invalida. Por favor, intente de nuevo.");
        }
    }
	}
}
