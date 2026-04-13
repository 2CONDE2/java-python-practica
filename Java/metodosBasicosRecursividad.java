public class metodosBasicosRecursividad {
    public static void main(String[] args){

    int a= 2; int b = 5;
     System.out.println(potencia(a,b)) ;

     if(esPrimo(b))
        System.out.println(b+": es primo ");
     else
        System.out.println("no es primo");
    
    int dig=1245;
        System.out.println(digitos(dig)); 
        factoresPrimos(dig);
    }

    private static int potencia (int b, int p){
    int res = 0;
     if(p==0)
        res=1;
     else 
        res= b * potencia(b,p-1); 

    return res;
    }
    private static boolean esPrimo(int n){
     
    return esPrimo(n,2);

    }
    private static boolean esPrimo(int n, int divisor) {
        boolean res = false ;
        if (n <= 1) 
            res = false;
        if (divisor == n) 
            res = true;
        if (n % divisor == 0) 
            res = false;
        else
           esPrimo(n, divisor + 1);

        return res;
    }

    private static int digitos(int n){
     int res ;
      if(n==0)
        res = 0;
      else 
        res = digitos(n/10)+1;  
     return res;
    }

    private static void factoresPrimos(int n) {
        factoresPrimos(n, 2);
    }

    private static void factoresPrimos(int n, int divisor) {

        if (n != 1) { 

            if (n % divisor == 0) {
                System.out.print(" "+divisor);
                factoresPrimos(n / divisor, divisor);
            } else {
                factoresPrimos(n, divisor + 1);
            }

        }
    }

}
