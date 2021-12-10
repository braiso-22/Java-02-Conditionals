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
        int numero;
        int numero2;
        System.out.println("Escribe 2 numeros enteros: ");
        numero = a.nextInt();
        numero2 = a.nextInt();

        if (numero > numero2) {
            System.out.println("El primer número es mayor!");
        } else {
            System.out.println("El primer número no es mayor!");
        }
    }

}
