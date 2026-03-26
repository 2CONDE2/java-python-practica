

public class Taxi extends TransportePublico {

    private String nombreId;
    private String ubicacion;
    private double costoAdicional;
    private boolean ocupado;

    public Taxi(String nombreId, String ubicacion, double costoBasico, double costoAdicional) {
        this.nombreId = nombreId;
        this.ubicacion = ubicacion;
        this.costoBasico = costoBasico;
        this.costoAdicional = costoAdicional;
        this.ocupado = false;
    }

    @Override
    public boolean puedeLlevar(String origen, String destino) {
        return !ocupado && ubicacion.equals(origen);
    }

    public void recogerPasajeros(int cantidad, String destino) {
        if(!ocupado) {
            ocupado = true;
            recaudacionDia += costoBasico + (cantidad * costoAdicional);
            ubicacion = destino;
        }
    }
}
