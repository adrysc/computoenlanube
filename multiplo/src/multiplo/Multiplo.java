/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo;

/**
 *
 * @author adysc
 */
import java.util.Scanner;
public class Multiplo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 int n; // Cuenta
 int x; // Múltiplo
 int i; // Contador

System.out.print("¿De qué número quieres los múltiplos?: ");
 x = sc.nextInt();

System.out.print("¿Hasta qué número quieres la lista?: ");
 n = sc.nextInt();

for (i=1; i <=n; i++) {

if (i % x == 0)
 System.out.println(i);

   }

}
    
}
