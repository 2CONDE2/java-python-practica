import java.util.Random;
import java.util.ArrayList;

public class Secuencia {
  
  public static void main(String[] args) {
    Random rnd = new Random();
    ArrayList<Integer> secuencia= new ArrayList<>(); 

    int tam=rnd.nextInt(9);
    System.out.println("tam= "+tam );
      
            for(int i = 0; i < tam ;i++){
               int elemento=rnd.nextInt(15);

               secuencia.add(elemento); 

            } 

              mostrar(secuencia);

              System.err.println();

    System.out.println("la suma de los elementos es " + suma(secuencia));       
    System.out.println("EL MENOR ELEMENTO ES "+menorElemento(secuencia, secuencia.size()));
             ordenar(secuencia, 0, secuencia.size());
             mostrar(secuencia);
  }   
  
  private static void mostrar(ArrayList<Integer> lista ){
    for(int i : lista){
                 
               System.out.print(" "+i);
            
              }
             
            
  }

  private static int suma(ArrayList<Integer> lista){
       
      return suma(lista , 0);

  }

  private static int suma(ArrayList<Integer> lista, int tam) {
        int suma ;
        if (tam == lista.size()) 
            suma = 0;

        else 
        suma= lista.get(tam) + suma(lista, tam + 1);

        return suma;
    }
    private static int menorElemento(ArrayList<Integer> lista, int tam) {

    int res ;
    if (tam == 1) {
        res = lista.get(0);
    }else{
 
    int menorDelResto = menorElemento(lista, tam - 1);

    int ultimo = lista.get(tam - 1);

    if (ultimo < menorDelResto) {
        res = ultimo;
    } else {
        res = menorDelResto;
    }
  }
    return res;
}
  
     public static void ordenar(ArrayList<Integer> lista, int ini, int n) {

       
        if (ini >= n - 1) {
            return;
        }

        
        int indiceMin = indiceMenor(lista, ini, n);

       
        int aux = lista.get(ini);
        lista.set(ini, lista.get(indiceMin));
        lista.set(indiceMin, aux);

        ordenar(lista, ini + 1, n);
    }

    private static int indiceMenor(ArrayList<Integer> lista, int ini, int n) {

        
        if (ini == n - 1) {
            return ini;
        }

        int indiceResto = indiceMenor(lista, ini + 1, n);

        if (lista.get(ini) < lista.get(indiceResto)) {
            return ini;
        } else {
            return indiceResto;
        }
    }

}