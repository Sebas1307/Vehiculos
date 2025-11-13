import java.util.Scanner;

public class Validaciones {
   Scanner sc = new Scanner(System.in);

//// VALIDACIONES STRING/////

// Validar placa
   public String Validarplaca (Scanner sc) {
      String placa = sc.nextLine();
      while (!placa.matches("^[A-Za-z]{3}[0-9]{3}$")) {
         System.out.println("Recuerde que una placa de vehiculo tiene 3 letra y 3 numeros en ese respectivo orden.");
         System.out.println("Placa invalida. Ingrese una placa valida, (no se admiten caracteres especiales ni espacios): ");
         placa = sc.nextLine();
      }
      return placa;
   }

   // Validar marca
   public String ValidarMarca (Scanner sc) {
      String marca = sc.nextLine();
      while (!marca.matches("^[A-Za-z\\s]+$")) {
         System.out.println("Marca invalida. Ingrese una marca valida, (no se admiten numeros ni simbolos): ");
         marca = sc.nextLine();
      }
      return marca;
   }

   //Validar estado
   public String ValidarEstado (Scanner sc) {
      if (sc.hasNextLine()){
         sc.nextLine();
      }
      String estado = sc.nextLine();
      while (!estado.matches("^(?i)(disponible|alquilado)$")) {
         System.out.println("No se admiten numeros, caracteres especiales o espacios.");
         System.out.println("Ingrese alguna de las opciones permitidas (Disponible o Alquilado): ");
         estado = sc.nextLine();
      }
      return estado;
   }


   //Validar tipocombustible
   public String ValidarTipoCombustible (Scanner sc) {
      String combustible = sc.nextLine();
      while (!combustible.matches("^(?i)(Gasolina|Diesel|Electrico)$")) {
         System.out.println("No se admiten numeros, caracteres especiales o espacios.");
         System.out.println("Ingrese alguna de las opciones permitidas (Gasolina, Diesel o Electrico): ");
         combustible = sc.nextLine();
      }
      return combustible;
   }

   //validar transmicion
      public String ValidarTransmicion (Scanner sc) {
      String transmicion = sc.nextLine();
      while (!transmicion.matches("^(?i)(Automatico|Manual)$")) {
         System.out.println("No se admiten numeros, caracteres especiales o espacios.");
         System.out.println("Ingrese alguna de las opciones permitidas (Automatico o Manual): ");
         transmicion = sc.nextLine();
      }
      return transmicion;
   }

   //validar traccion
   public String ValidarTraccion (Scanner sc) {
      String traccion = sc.nextLine();
      while (!traccion.matches("^(?i)(4x2|4x4)$")) {
         System.out.println("No se admiten caracteres especiales o espacios.");
         System.out.println("Ingrese alguna de las opciones permitidas (4x2 o 4x4): ");
         traccion = sc.nextLine();
      }
      return traccion;
   }
//// VALIDACIONES STRING/////

//// VALIDACIONES INTEGER/////
   
   //Validar modelo
   public Integer ValidarModelo (Scanner sc) {
      int modelo;
      while(true) {
         if(sc.hasNextInt()) {
            modelo =sc.nextInt();
            if (modelo > 1980 && modelo <= 2027) {
               break;
            }
            else{
               System.out.println("Ingrese un modelo valido 1980 - 2027");
            }
         }
         else{
            System.out.println("Ingrese un dato numerico entero: ");
            sc.next();
         }
      }
      return modelo;
   }


   //validarentero
   public int ValidarEntero (Scanner sc) {
      int entero;
      while (!sc.hasNextInt()) {
         System.out.println("Ingrese un dato numerico entero: ");
         sc.next();
      }
      entero = sc.nextInt();
      return entero;
   }

//// VALIDACIONES INTEGER/////

//// VALIDACIONES FLOAT/////

   //Validar floats
   public Float Validarfloats (Scanner sc) {
      float decimal;
      while (true) {
         if (sc.hasNextFloat()) {
            decimal = sc.nextFloat();

            if (decimal > 0) {
               break;
            }
            else {
               System.out.println("No puedes ingresar un valor igual a 0 o negativo.");
            }
         }
         else {
            System.out.println("Ingrese un dato numerico decimal: ");
            sc.next();
         }
      }
      return decimal;
   }

//// VALIDACIONES FLOAT/////
   }