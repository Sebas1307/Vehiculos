import java.util.Scanner;

public class Metodos {
   Scanner sc = new Scanner(System.in);
   Vehiculo vehiculo = new Vehiculo("", "", 0, 0.0f, "");
   // Validar placa
   public void Validarplaca () {
      System.out.println("Ingrese la placa del vehiculo: ");
      String placa = sc.nextLine();
      while (!placa.matches("^[A-Za-z0-9]{6}$")) {
         System.out.println("Recuerde que una placa de vehiculo tiene 3 letra y 3 numeros");
         System.out.println("Placa invalida. Ingrese una placa valida, (no se admiten caracteres especiales ni espacios): ");
         placa = sc.nextLine();
      }
      vehiculo.setPlaca(placa);
      System.out.println("Placa guardada: " + vehiculo.getPlaca());
   }

   // Validar marca
   public void ValidarMarca () {
      System.out.println("Ingrese la marca del vehiculo: ");
      String marca = sc.nextLine();
      while (!marca.matches("^[A-Za-z\\s]+$")) {
         System.out.println("Marca invalida. Ingrese una marca valida, (no se admiten numeros ni simbolos): ");
         marca = sc.nextLine();
      }
      vehiculo.setMarca(marca);
      System.out.println("Marca guardada: " + vehiculo.getMarca());
   }

   //Validar modelo
   public void ValidarModelo () {
      int modelo;
      System.out.println("Ingrese el modelo del vehiculo: ");
      while (!sc.hasNextInt()) {
         System.out.println("Ingrese un año para el modelo, (no se aceptan letras ni caracteres especiales):");
         sc.next();
      }
      modelo = sc.nextInt();
      vehiculo.setModelo(modelo);
      System.out.println("Modelo guardado: " + vehiculo.getModelo());
   }

   //Validar precio diario
   public void ValidarPrecioDiario () {
      float precioDiario;
      System.out.println("Ingrese el precio diaro del vehiculo: ");
      while (true) {
         if (sc.hasNextFloat()) {
            precioDiario = sc.nextFloat();

            if (precioDiario > 0) {
               vehiculo.setPrecioDiario(precioDiario);
               break;
            }
            else {
               System.out.println("No puedes ingresar un precio igual a 0 o negativo.");
            }
         }
         else {
            System.out.println("Ingrese un precio para el vehiculo, (no se aceptan letras ni caracteres): ");
            sc.next();
         }
         System.out.println("Ingrese el precio diario del vehiculo: ");
         }
         System.out.println("Precio diario guardado: " + vehiculo.getPrecioDiario());
      }

      //Validar estado
      public void ValidarEstado () {
         System.out.println("Ingrese el estado del vehiculo (Dispoble o Alquilado): ");
         String estado = sc.nextLine();
         while (!estado.matches("^(?i)(disponible|alquilado)$")) {
            System.out.println("No se admiten numeros, caracteres especiales o espacios.");
            System.out.println("Ingrese alguna de las opciones permitidas (Dispoble o Alquilado): ");
            estado = sc.nextLine();
         }
         vehiculo.setEstado(estado);
         System.out.println("El estado del vehiculo ha sido guardado: " + vehiculo.getEstado());
      }

      CarroSedan sedan = new CarroSedan(null, null, 0, 0, null, null, null);
      //Validar tipocombustible
      public void ValidarTipoCombustible () {
         System.out.println("Ingrese el tipo de combustible del vehiculo (Gasolina, Diesel o Electrico): ");
         String combustible = sc.nextLine();
         while (!combustible.matches("^(?i)(Gasolina|Diesel|Electrico)$")) {
            System.out.println("No se admiten numeros, caracteres especiales o espacios.");
            System.out.println("Ingrese alguna de las opciones permitidas (Gasolina, Diesel o Electrico): ");
            combustible = sc.nextLine();
         }
         sedan.setTipoCombustible(combustible);
         System.out.println("El tipo de combustible del vehiculo ha sido guardado: " + sedan.getTipoCombustible());
      }

         //validar transmicion
         public void ValidarTransmicion () {
         System.out.println("Ingrese el tipo de transmicion del vehiculo (Automatico o Manual): ");
         String transmicion = sc.nextLine();
         while (!transmicion.matches("^(?i)(Automatico|Manual)$")) {
            System.out.println("No se admiten numeros, caracteres especiales o espacios.");
            System.out.println("Ingrese alguna de las opciones permitidas (Automatico o Manual): ");
            transmicion = sc.nextLine();
         }
         sedan.setTransmision(transmicion);
         System.out.println("El tipo de transmicion del vehiculo ha sido guardado: " + sedan.getTransmision());
      }

      CamionetaSUV camioneta = new CamionetaSUV(null, null, 0, 0, null, null, 0);
      //validar traccion
      public void ValidarTraccion () {
         System.out.println("Ingrese el tipo de traccion del vehiculo (4x2 o 4x4): ");
         String traccion = sc.nextLine();
         while (!traccion.matches("^(?i)(4x2|4x4)$")) {
            System.out.println("No se admiten caracteres especiales o espacios.");
            System.out.println("Ingrese alguna de las opciones permitidas (4x2 o 4x4): ");
            traccion = sc.nextLine();
         }
         camioneta.setTraccion(traccion);
         System.out.println("El tipo de traccion del vehiculo ha sido guardado: " + camioneta.getTraccion());
      }

      //validar capacidad maletero
      public void ValidarCapacidadMaletero () {
      float capacidad;
      System.out.println("Ingrese la capacidad del maletero del vehiculo: ");
      while (true) {
         if (sc.hasNextFloat()) {
            capacidad = sc.nextFloat();

            if (capacidad > 0) {
               camioneta.setCapacidadMaletero(capacidad);;
               break;
            }
            else {
               System.out.println("No puedes ingresar una capacidad igual a 0 o negativo.");
            }
         }
         else {
            System.out.println("Ingrese un precio para el vehiculo, (no se aceptan letras ni caracteres): ");
            sc.next();
         }
         System.out.println("Ingrese la capacidad del maletero del vehiculo: ");
         }
         System.out.println("Capacidad del maletero guardada: " + camioneta.getCapacidadMaletero());
      }
   }