import java.util.Random;
import java.util.Scanner;
public class digitos
{
   public static void main(String args[]){
    Random rnd = new Random();
    Scanner sc =new Scanner(System.in);
    int num1,num2;
     
    num2=0;
     for(int i=0;i<4;i++) {
         int dig = rnd.nextInt(9)+1;
         num2= num2*10+dig;
        }   
    
            System.out.println(num2);

   
   
    do {
        int conta = 0;
            int conts = 0;

            System.out.print("Ingrese el número: ");
            num1 = sc.nextInt();

            int aux1 = num2;
            int aux2 = num1;

            for (int i = 0; i < 4; i++) {
                int d1 = aux1 % 10;
                int d2 = aux2 % 10;

                if (d1 == d2) {
                    conta++; 
                }

                aux1 /= 10;
                aux2 /= 10;
            }

        
            aux1 = num2;

            for (int i = 0; i < 4; i++) {
                int d1 = aux1 % 10;
                aux2 = num1;

                for (int j = 0; j < 4; j++) {
                    int d2 = aux2 % 10;

                    if (d1 == d2) {
                        conts++;
                    }

                    aux2 /= 10;
                }

                aux1 /= 10;
            }

            conts = conts - conta; 

            System.out.println(conta + " aciertos");
            System.out.println(conts + " semiaciertos");
           
        } while (num1 != num2);
          System.out.println("¡Correcto!");
              }
            }
        
    
