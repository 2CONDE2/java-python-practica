//package Java;
public class Main {

    public static void main(String[] args) {

        Transfer empresa = new Transfer();

        Taxi t1 = new Taxi("Rojo100", "Centro", 10, 3);

        empresa.agregarVehiculo(t1);

        t1.recogerPasajeros(2, "Sur");

        System.out.println("Recaudación total: " + empresa.recaudacionTotal());
    }
}