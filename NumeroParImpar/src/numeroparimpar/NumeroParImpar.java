/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroparimpar;

/**
 *
 * @author adysc
 */

import java.util.Scanner;
public class NumeroParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR  " );
        }
        else
        {
            System.out.printf( "ES IMPAR  " );
        }
    }
}
        // TODO code application logic here 
