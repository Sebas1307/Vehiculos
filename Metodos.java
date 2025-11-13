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
      System.out.println("Ingrese la transmision del carro sedan (Manual o Automatica): ");
      sedan.setTransmision(v.ValidarTransmision(sc));
      return sedan;
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
      System.out.println("Ingrese la capacidad del maletero de la camioneta SUV en litros: ");
      suv.setCapacidadMaletero(v.Validarfloats(sc));
      return suv;
   }

   public void MostrarVehiculo(LinkedList<Vehiculo> Vehiculos) {
      if (Vehiculos.isEmpty()) {
         System.out.println("No hay Vehiculos registrados.");
         return;
      } else {
         for (Vehiculo vehiculo : Vehiculos) {
            System.out.println("---------------------------");
            System.out.println("Placa: " + vehiculo.getPlaca());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Precio Diario: " + vehiculo.getPrecioDiario());
            System.out.println("Estado: " + vehiculo.getEstado());
            if (vehiculo instanceof CarroSedan) {
               CarroSedan sedan = (CarroSedan) vehiculo;
               System.out.println("Tipo de Combustible: " + (sedan.getTipoCombustible()));
               System.out.println("Transmision: " + (sedan.getTransmision()));
            } else if (vehiculo instanceof CamionetaSUV) {
               CamionetaSUV suv = (CamionetaSUV) vehiculo;
               System.out.println("Traccion: " + (suv.getTraccion()));
               System.out.println("Capacidad del Maletero: " + (suv.getCapacidadMaletero()));
            }
            System.out.println("---------------------------");
         }
      }
   }

   public void EliminarVehiculo(Scanner sc, LinkedList<Vehiculo> Vehiculos) {
      if (sc.hasNextLine()) {
         sc.nextLine();
      }
      if (Vehiculos.isEmpty()) {
         System.out.println("No hay Vehiculos registrados.");
         return;
      } else {
         System.out.println("Ingrese la placa del vehiculo que desea eliminar: ");
         String placa1 = sc.nextLine();
         for (Vehiculo vehiculo : Vehiculos) {
            if (vehiculo.getPlaca().equals(placa1)) {
               Vehiculos.remove(vehiculo);
               System.out.println("Vehiculo con placa " + placa1 + " eliminado.");
               break;
            } else {
               System.out.println("La placa no se encuentra en la lista.");
            }
         }
      }
   }

   public void BuscarVehiculo(Scanner sc, LinkedList<Vehiculo> Vehiculos) {
      if (sc.hasNextLine()) {
         sc.nextLine();
      }
      if (Vehiculos.isEmpty()) {
         System.out.println("No hay Vehiculos registrados.");
         return;
      } else {
         System.out.println("Ingrese la placa del vehiculo que desea buscar: ");
         String placa2 = sc.nextLine();
         for (Vehiculo vehiculo : Vehiculos) {
            if (vehiculo.getPlaca().equals(placa2)) {
               System.out.println("----- Vehículo Encontrado -----");
               System.out.println("Placa: " + vehiculo.getPlaca());
               System.out.println("Marca: " + vehiculo.getMarca());
               System.out.println("Modelo: " + vehiculo.getModelo());
               System.out.println("Precio Diario: " + vehiculo.getPrecioDiario());
               System.out.println("Estado: " + vehiculo.getEstado());
               if (vehiculo instanceof CarroSedan) {
                  CarroSedan sedan = (CarroSedan) vehiculo;
                  System.out.println("Tipo de Combustible: " + (sedan.getTipoCombustible()));
                  System.out.println("Transmision: " + (sedan.getTransmision()));
               } else if (vehiculo instanceof CamionetaSUV) {
                  CamionetaSUV suv = (CamionetaSUV) vehiculo;
                  System.out.println("Traccion: " + (suv.getTraccion()));
                  System.out.println("Capacidad del Maletero: " + (suv.getCapacidadMaletero()));
               }
               System.out.println("---------------------------");
               break;
            } else {
               System.out.println("La placa no se encuentra en la lista.");
            }
         }
      }
   }

   public void ModificarVehiculo(Scanner sc, LinkedList<Vehiculo> Vehiculos) {
      if (sc.hasNextLine()) {
         sc.nextLine();
      }
      if (Vehiculos.isEmpty()) {
         System.out.println("No hay Vehiculos registrados.");
         return;
      } else {
         System.out.println("Ingrese la placa del vehiculo que desea modificar: ");
         String placa3 = sc.nextLine();
         for (Vehiculo vehiculo : Vehiculos) {
            if (vehiculo.getPlaca().equals(placa3)) {
               System.out.println("Vehículo encontrado. Ingrese los nuevos datos:");
               System.out.println("Ingrese la nueva marca del vehículo: ");
               vehiculo.setMarca(v.ValidarMarca(sc));
               System.out.println("Ingrese el nuevo modelo del vehículo: ");
               vehiculo.setModelo(v.ValidarModelo(sc));
               System.out.println("Ingrese el nuevo precio diario del vehículo: ");
               vehiculo.setPrecioDiario(v.Validarfloats(sc));
               System.out.println("Ingrese el nuevo estado del vehículo (Disponible o Alquilado): ");
               vehiculo.setEstado(v.ValidarEstado(sc));
               if (vehiculo instanceof CarroSedan) {
                  CarroSedan sedan = (CarroSedan) vehiculo;
                  System.out.println(
                        "Ingrese el nuevo tipo de combustible del carro sedan (Gasolina, Diesel o Electrico): ");
                  sedan.setTipoCombustible(v.ValidarTipoCombustible(sc));
                  System.out.println("Ingrese la nueva transmision del carro sedan (Manual o Automatica): ");
                  sedan.setTransmision(v.ValidarTransmision(sc));
               } else if (vehiculo instanceof CamionetaSUV) {
                  CamionetaSUV suv = (CamionetaSUV) vehiculo;
                  System.out.println("Ingrese la nueva traccion de la camioneta SUV: ");
                  suv.setTraccion(v.ValidarTraccion(sc));
                  System.out.println("Ingrese la nueva capacidad del maletero de la camioneta SUV en litros: ");
                  suv.setCapacidadMaletero(v.Validarfloats(sc));
               }
               System.out.println("Vehículo modificado exitosamente.");
               return;
            } else {
               System.out.println("La placa no se encuentra en la lista.");
            }
         }
      }
   }

   public void MenuGestionVehiculos(Scanner sc, LinkedList<Vehiculo> Vehiculos, Metodos m, Validaciones v) {
      boolean salir = true;
      int opcion = 0;
      while (salir) {
         System.out.println("----- GESTÍON DE VEHÍCULOS -----");
         System.out.println("2.1 Registrar Vehículo");
         System.out.println("2.2 Modificar Vehículo");
         System.out.println("2.3 Eliminar Vehículo");
         System.out.println("2.4 Buscar Vehículo");
         System.out.println("2.5 volver al menú principal");
         System.out.println("Seleccione una opción: ");
         opcion = v.ValidarEntero(sc);

         switch (opcion) {
            case 1:
               boolean salirregistro = true;
               while (salirregistro) {
                  System.out.println("Seleccione el tipo de vehículo a registrar:");
                  System.out.println("1. Carro Sedan");
                  System.out.println("2. Camioneta SUV");
                  System.out.println("3. Volver al menú anterior");
                  int tipoVehiculo = v.ValidarEntero(sc);
                  switch (tipoVehiculo) {
                     case 1:
                        CarroSedan sedan = new CarroSedan("", "", 0, 0, "", "", "");
                        sedan = m.RegistrarSedan(sedan);
                        Vehiculos.add(sedan);
                        break;
                     case 2:
                        CamionetaSUV suv = new CamionetaSUV("", "", 0, 0, "", "", 0);
                        suv = m.RegistrarSUV(suv);
                        Vehiculos.add(suv);
                        break;
                     case 3:
                        System.out.println("Volviendo al menú anterior...");
                        salirregistro = false;
                        break;
                     default:
                        System.out.println("Opción inválida.");
                  }
               }
               break;
            case 2:
               m.ModificarVehiculo(sc, Vehiculos);
               break;
            case 3:
               m.EliminarVehiculo(sc, Vehiculos);
               break;
            case 4:
               m.BuscarVehiculo(sc, Vehiculos);
               break;
            case 5:
               System.out.println("Volviendo al menú principal...");
               salir = false;
               break;
            default:
               System.out.println("Opción inválida. Por favor, intente de nuevo.");
         }
      }
   }

}