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
public class i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe 2 numeros para saber si el segundo es"
                + " divisor del primero");

        int num1 = teclado.nextInt(), num2 = teclado.nextInt();
        boolean valido = num2 != 0, divisor = num1 % num2 == 0;
        if (valido && divisor) {
            System.out.printf("%d es divisor de %d\n", num2, num1);
        } else {
            System.out.printf("%d es no divisor de %d\n", num2, num1);

        }
    }

}
