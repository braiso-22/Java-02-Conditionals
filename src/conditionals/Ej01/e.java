/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals.Ej01;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 2 numeros enteros y te digo si al menos "
                + "uno es mayor de 10");

        if (teclado.nextInt() > 10 || teclado.nextInt() > 10) {
            System.out.println("Al menos 1 de los numeros es mayor que 10");
        } else {
            System.out.println("Ninguno es mayor que 10");
        }
    }

}
