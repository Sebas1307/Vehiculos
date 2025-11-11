public class CarroSedan extends Vehiculo {
    private String TipoCombustible;
    private String Transmision;
    
    
    public CarroSedan(String placa, String marca, int modelo, float precioDiario, String extado, String tipoCombustible,
            String transmision) {
        super(placa, marca, modelo, precioDiario, extado);
        TipoCombustible = tipoCombustible;
        Transmision = transmision;
    }


    public String getTipoCombustible() {
        return TipoCombustible;
    }


    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }


    public String getTransmision() {
        return Transmision;
    }


    public void setTransmision(String transmision) {
        Transmision = transmision;
    }
    
    
}