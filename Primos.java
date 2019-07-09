
package primos;
import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
     Scanner e = new Scanner(System.in);
     
     System.out.print("Ingrese la cantidad de números primos que desea mostrar:  ");
     
int x = e.nextInt();
int c = 1;
int p = 2;
int d = 2;
while (c <= x) {
   if (p % d == 0) {
      if (p == d) {
         System.out.print(p + ", ");
         c++;
      }
      d = 2;
      p++;
   }
   else
      d++;
}

    }
    
}
