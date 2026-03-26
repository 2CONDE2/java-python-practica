
import java.util.List;

public class Bus extends TransportePublico {

    private String nombreLinea;
    private List<String> ruta;

    public Bus(String nombreLinea, List<String> ruta, double costoBasico) {
        this.nombreLinea = nombreLinea;
        this.ruta = ruta;
        this.costoBasico = costoBasico;
    }

    @Override
    public boolean puedeLlevar(String origen, String destino) {

        int posOrigen = ruta.indexOf(origen);
        int posDestino = ruta.indexOf(destino);

        return posOrigen != -1 && posDestino != -1 && posOrigen < posDestino;
    }

    public void recogerPasajero() {
        recaudacionDia += costoBasico;
    }
}