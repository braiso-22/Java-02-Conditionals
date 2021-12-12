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
public class l {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 3 numeros para saber si alguno es mayor que cero");
        int num1 = teclado.nextInt(),
                num2 = teclado.nextInt(),
                num3 = teclado.nextInt();
        boolean mayor0 = num1 > 0 || num2 > 0 || num3 > 0;

        if (mayor0) {
            System.out.println("Hay algun mayor que 0");
        } else {
            System.out.println("No hay mayores que 0");
        }

    }

}
