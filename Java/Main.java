//package Java;
public class Main {
   

    //prueba de la busqueda recursiva
     public static void main(String[] args) {

        int[] col = {8, 3, 5, 1, 9, 2};

        System.out.println("Arreglo original:");
        mostrar(col);

        // ordenar el arreglo
        ordenarArreglos.ordenar(col, col.length, 0);

        System.out.println("Arreglo ordenado:");
        mostrar(col);

        int dato = 5;

        boolean res = Busqueda.busquedaBinaria(col, 0, col.length - 1, dato);

        if (res) {
            System.out.println("El dato existe en el arreglo");
        } else {
            System.out.println("El dato NO existe en el arreglo");
        }
    }

    public static void mostrar(int[] col) {

        for (int i = 0; i < col.length; i++) {
            System.out.print(col[i] + " ");
        }

        System.out.println();
    }
}