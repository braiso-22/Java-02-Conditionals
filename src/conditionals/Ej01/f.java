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
public class f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número para saber si está entre 10 y 20");
        int num1 = teclado.nextInt();
        if (num1 >= 10 && num1 <= 20) {
            System.out.println("Está entre 10 y 20");
        } else {
            System.out.println("No está entre 10 y 20");
        }
    }

}
