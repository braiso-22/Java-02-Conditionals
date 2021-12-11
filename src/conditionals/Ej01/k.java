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
public class k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe 2 numeros para saber si el menor "
                + "es divisor del mayor");

        int num = teclado.nextInt();
        boolean mul2 = num % 2 == 0,
                mul3 = num % 3 == 0,
                mul10 = mul2 && num % 10 == 0;

        if (mul2) {
            System.out.println("Es multiplo de 2");
        }
        if (mul3) {
            System.out.println("Es multiplo de 3");
        }
        if (mul10) {
            System.out.println("Es multiplo de 10");
        }
    }

}
