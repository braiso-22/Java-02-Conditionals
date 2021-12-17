/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año;

        System.out.println("Introduce un año para saber si es bisiesto");
        año = teclado.nextInt();
        boolean bisiesto = año % 100 != 0 && año % 4 == 0 || año % 400 == 0;

        if (bisiesto) {
            System.out.println(año + " es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }

}
