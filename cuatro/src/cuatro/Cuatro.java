/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

/**
 *
 * @author adysc
 */
import java.util.*;
import java.io.*;
public class Cuatro {
    public static void Cuatro(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n, cifras;
        char car;
        do{
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras+ " cifras");
            System.out.print("Continuar? ");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N');   
    }
}
   


