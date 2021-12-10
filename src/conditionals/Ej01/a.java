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
public class a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero y te digo si es mayor de 10");

        if (teclado.nextInt() > 10) {
            System.out.println("Es mayor");
        } else {
            System.out.println("No es mayor");
        }
    }

}
