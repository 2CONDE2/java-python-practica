import java.util.ArrayList;


public class Transfer {

    private ArrayList<TransportePublico> vehiculos;

    public Transfer() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(TransportePublico v) {
        vehiculos.add(v);
    }

    public double recaudacionTotal() {
        double total = 0;

        for(TransportePublico v : vehiculos) {
            total += v.getRecaudacionDia();
        }

        return total;
    }

    public void vehiculosDisponibles(String origen, String destino) {

        for(TransportePublico v : vehiculos) {
            if(v.puedeLlevar(origen, destino)) {
                System.out.println(v);
            }
        }
    }
}