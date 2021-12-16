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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 3 numeros:");
        int num1 = teclado.nextInt(),
                num2 = teclado.nextInt(),
                num3 = teclado.nextInt();
        boolean negativos = num1 < 0 & num2 < 0 & num3 < 0,
                alguno = num1 < 0 || num2 < 2 || num3 < 0,
                todos = num1 > 0 & num2 > 0 & num3 > 0;

        if (negativos) {
            System.out.println(num1 * num2 * num3);
        } else if (todos) {
            System.out.println((num1 + num2) * num3);
        } else if (alguno) {
            System.out.println(num1 + num2 + num3);
        } else {
            System.out.println("No contemplado");
        }
    }

}
