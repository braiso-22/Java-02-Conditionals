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
public class b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Escribe 2 numeros enteros: ");

        if (a.nextInt() > a.nextInt()) {
            System.out.println("El primer número es mayor! ");
        } else {
            System.out.println("El primer número no es mayor! ");
        }
    }

}
