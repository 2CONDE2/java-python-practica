/**4. Transfer es una empresa de transporte p´ublico,
 que tiene una flota de t´axis y una variedad de l´ıneas de 
 buses. Los t´axis tienen un nombre que los identifica 
 ( por ejemplo: Rojo 100), una ubicacin actual, el costo de 
 pasaje b´asico, el costo adicional por persona, el estado 
 (ocupado/libre) y la recaudacin del d´ıa. De los buses se conoce 
 el nombre de la l´ınea, la ruta, el costo del pasaje b´asico y l
 a recaudacin del d´ıa. Los buses debido a que se tiene un costo
  ´unico se recoge pasajeros de uno en uno, pero los t´axis pueden
   recoger a uno o a muchos pasajeros. Los veh´ıculos deber´ıan 
   poder indicar si pueden llevar a un pasajero de X a Y. La ruta 
   se considera como una secuencia ordenada de lugares que se pu
   ede visitar. La empresa desea automatizar algunos de sus proceso
   s, mismos que se detallan a continuacin: Se requiere saber las
    recaudaciones del d´ıa de la empresa Se quiere saber la lista
    de veh´ıculos que pueden llevar de un lugar X a Y Se de
    sea automatizar el recojo de pasajeros**/

//package Java;

public abstract class TransportePublico {

    protected double costoBasico;
    protected double recaudacionDia;

    public abstract boolean puedeLlevar(String origen, String destino);

    public double getRecaudacionDia() {
        return recaudacionDia;
    }
}