/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner e = new Scanner(System.in);
int n = e.nextInt();
int c = 1;
int p = 2;
int d = 2;
while (c <= n) {
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
