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
public class g {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe 2 numeros enteros y te digo si solo "
                + "uno es mayor de 10");

        int num1 = teclado.nextInt(), num2 = teclado.nextInt();
        boolean con1 = num1 > 10 && !(num2 > 10), con2 = num1 <= 10 && num2 > 10;

        if (con1 || con2) {
            System.out.println("Uno de los numeros es mayor que 10");
        } else {
            System.out.println("Todos o ninguno es mayor que 10");
        }
    }

}
