public class Vehiculo {
    protected String Placa;
    protected String Marca;
    protected int Modelo;
    protected float PrecioDiario;
    protected String Estado;     //disponible / alquilado
    
    
    public Vehiculo(String placa, String marca, int modelo, float precioDiario, String estado) {
        Placa = placa;
        Marca = marca;
        Modelo = modelo;
        PrecioDiario = precioDiario;
        Estado = estado;
    }


    public String getPlaca() {
        return Placa;
    }


    public void setPlaca(String placa) {
        Placa = placa;
    }


    public String getMarca() {
        return Marca;
    }


    public void setMarca(String marca) {
        Marca = marca;
    }


    public int getModelo() {
        return Modelo;
    }


    public void setModelo(int modelo) {
        Modelo = modelo;
    }


    public float getPrecioDiario() {
        return PrecioDiario;
    }


    public void setPrecioDiario(float precioDiario) {
        PrecioDiario = precioDiario;
    }


    public String getEstado() {
        return Estado;
    }


    public void setEstado(String extado) {
        Estado = extado;
    }

    
}