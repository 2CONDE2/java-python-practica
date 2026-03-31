public class ordenarArreglos {

    public static void ordenar(int[] col, int n, int i) {

    if (n > 1) {

        if (i < n - 1) {

            if (col[i] > col[i + 1]) {

                int aux = col[i];
                col[i] = col[i + 1];
                col[i + 1] = aux;

            }

            ordenar(col, n, i + 1);
        }
        else {
            ordenar(col, n - 1, 0);
        }
    }
}
}