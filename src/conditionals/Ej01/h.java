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
public class h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 2 numeros enteros y te digo cual es mayor,"
                + " menor o si son iguales");

        int num1 = teclado.nextInt(), num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.printf("%d es mayor que %d\n", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("%d es menor que %d\n", num1, num2);
        } else {
            System.out.println("Son iguales");
        }
    }

}
