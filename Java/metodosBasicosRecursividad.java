public class metodosBasicosRecursividad {
    public static void main(String[] args){

    int a= 2; int b = 5;
     System.out.print(potencia(a,b)) ;
    }

    private static int potencia (int b, int p){
    int res = 0;
     if(p==0)
        res=1;
     else 
        res= b * potencia(b,p-1); 

    return res;
    }
}
