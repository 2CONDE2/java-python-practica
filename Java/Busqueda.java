public class Busqueda {
 
    public static boolean busquedaSecuencial(int[] col, int n,int dato ){
        boolean res;
        if(n==0)
           res=false;
        if(col[n-1]==dato)
           res=true;
        else
            res=busquedaSecuencial(col,n-1,dato);
        
        return res;
         
    }
        public static boolean busquedaBinaria(int[] col, int ini, int fin, int dato) {

        boolean res = false;

        if (ini <= fin) {

            int medio = (ini + fin) / 2;

            if (col[medio] == dato) {
                res = true;
            } 
            else if (dato < col[medio]) {
                res = busquedaBinaria(col, ini, medio - 1, dato);
            } 
            else {
                res = busquedaBinaria(col, medio + 1, fin, dato);
            }
        }

        return res;


    
}
}