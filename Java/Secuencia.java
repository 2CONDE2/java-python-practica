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

            for(int i : secuencia){
                 
               System.err.print(" "+i);
            }
  }

    
}