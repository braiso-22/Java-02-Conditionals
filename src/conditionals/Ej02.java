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
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, r;

        System.out.println("Introduce 2 numeros con decimales");
        a = teclado.nextDouble();
        b = teclado.nextDouble();

        /*
        a) este codigo evita que se haga una division entre 0 
        consiguiendo que el programa no crashee
         */
        if (b != 0 && a / b == 0) {
            r = a / b;
            System.out.println(r);
        }
        

    }

}
