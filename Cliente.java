public class Cliente {
   String Cedula;
   String Nombre;
   String Apellido;
   String Telefono;
   String Direccion;
   String LicenciaConduccion;

   public Cliente() {

   }

   public void getCedula() {
      System.out.println(Cedula);
   }

   public void getNombre() {
      System.out.println(Nombre);
   }

   public void getApellido() {
      System.out.println(Apellido);
   }

   public void getTelefono() {
      System.out.println(Telefono);
   }

   public void getDireccion() {
      System.out.println(Direccion);
   }

   public void getLicenciaConduccion() {
      System.out.println(LicenciaConduccion);
   }

   public void setCedula(String cedula) {
      Cedula = cedula;
   }

   public void setNombre(String nombre) {
      Nombre = nombre;
   }

   public void setApellido(String apellido) {
      Apellido = apellido;
   }

   public void setTelefono(String telefono) {
      Telefono = telefono;
   }

   public void setDireccion(String direccion) {
      Direccion = direccion;
   }

   public void setLicenciaConduccion(String licenciaConduccion) {
      LicenciaConduccion = licenciaConduccion;
   }
}
