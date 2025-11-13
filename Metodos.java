import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
   Scanner sc = new Scanner(System.in);
   Validaciones v = new Validaciones();

   public CarroSedan RegistrarSedan(CarroSedan sedan) {
      System.out.println("Ingrese la placa del carro sedan: ");
      sedan.setPlaca(v.Validarplaca(sc));
      System.out.println("Ingrese la marca del carro sedan: ");
      sedan.setMarca(v.ValidarMarca(sc));
      System.out.println("Ingrese el modelo del carro sedan: ");
      sedan.setModelo(v.ValidarModelo(sc));
      System.out.println("Ingrese el precio diario del carro sedan: ");
      sedan.setPrecioDiario(v.Validarfloats(sc));
      System.out.println("Ingrese el estado del carro sedan (Disponible o Alquilado): ");
      sedan.setEstado(v.ValidarEstado(sc));
      System.out.println("Ingrese el tipo de combustible del carro sedan (Gasolina, Diesel o Electrico): ");
      sedan.setTipoCombustible(v.ValidarTipoCombustible(sc));
      return sedan;
   }

   public void MostrarSedan(LinkedList<CarroSedan> listaSedan) {
      for (CarroSedan sedan : listaSedan) {
         System.out.println("Placa: " + sedan.getPlaca());
         System.out.println("Marca: " + sedan.getMarca());
         System.out.println("Modelo: " + sedan.getModelo());
         System.out.println("Precio Diario: " + sedan.getPrecioDiario());
         System.out.println("Estado: " + sedan.getEstado());
         System.out.println("Tipo de Combustible: " + sedan.getTipoCombustible());
         System.out.println("---------------------------");
      }
   }

   public CamionetaSUV RegistrarSUV(CamionetaSUV suv) {
      System.out.println("Ingrese la placa de la camioneta SUV: ");
      suv.setPlaca(v.Validarplaca(sc));
      System.out.println("Ingrese la marca de la camioneta SUV: ");
      suv.setMarca(v.ValidarMarca(sc));
      System.out.println("Ingrese el modelo de la camioneta SUV: ");
      suv.setModelo(v.ValidarModelo(sc));
      System.out.println("Ingrese el precio diario de la camioneta SUV: ");
      suv.setPrecioDiario(v.Validarfloats(sc));
      System.out.println("Ingrese el estado de la camioneta SUV (Disponible o Alquilado): ");
      suv.setEstado(v.ValidarEstado(sc));
      System.out.println("Ingrese la traccion de la camioneta SUV: ");
      suv.setTraccion(v.ValidarTraccion(sc));
      return suv;
   }

   public void MostrarSUV(LinkedList<CamionetaSUV> listaSUV) {
      for (CamionetaSUV suv : listaSUV) {
         System.out.println("Placa: " + suv.getPlaca());
         System.out.println("Marca: " + suv.getMarca());
         System.out.println("Modelo: " + suv.getModelo());
         System.out.println("Precio Diario: " + suv.getPrecioDiario());
         System.out.println("Estado: " + suv.getEstado());
         System.out.println("Traccion: " + suv.getTraccion());
         System.out.println("---------------------------");
      }
   }

}
