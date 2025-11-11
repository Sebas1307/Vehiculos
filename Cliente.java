public class Cliente {
   private String Cedula;
   private String Nombre;
   private String Apellido;
   private String Telefono;
   private String Direccion;
   private String LicenciaConduccion;

   private Metodos metodos = new Metodos();

   public String getCedula() {
      return Cedula;
   }

   public void setCedula(String cedula) {
      if(metodos.isDigit(cedula)) {
         Cedula = cedula;
      } else {
         System.out.println("Hubo un error al digitar la cedula. Asegurate de solo digitar numeros.");
      }
   }

   public String getNombre() {
      return Nombre;
   }

   public void setNombre(String nombre) {
      if(metodos.isLetter(nombre)) {
         Nombre = nombre;
      } else {
         System.out.println("Hubo un error al digitar el nombre. Asegurate de solo digitar letras.");
      }
   }

   public String getApellido() {
      return Apellido;
   }

   public void setApellido(String apellido) {
      if(metodos.isLetter(apellido)) {
         Apellido = apellido;
      } else {
         System.out.println("Hubo un error al digitar el apellido. Asegurate de solo digitar letras.");
      }
   }

   public String getTelefono() {
      return Telefono;
   }

   public void setTelefono(String telefono) {
      if(metodos.isPhoneNumber(telefono)) {
         Telefono = telefono;
      } else {
         System.out.println("Hubo un error al digitar el telefono. Asegurate de solo digitar numeros y tener 10 digitos.");
      }
   }

   public String getDireccion() {
      return Direccion;
   }

   public void setDireccion(String direccion) {
      Direccion = direccion;
   }

   public String getLicenciaConduccion() {
      return LicenciaConduccion;
   }

   public void setLicenciaConduccion(String licenciaConduccion) {
      LicenciaConduccion = licenciaConduccion;
   }
}
