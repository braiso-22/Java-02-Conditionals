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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        
        System.out.println("Introduce tu nota (0-10)");
        nota = teclado.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("Tu nota es Muy deficiente");
                break;

            case 3:
            case 4:
                System.out.println("Tu nota es Insuficiente");
                break;

            case 5:
            case 6:
                System.out.println("Tu nota es un Aprobado");
                break;

            case 7:
            case 8:
                System.out.println("Tu nota es un Notable");
                break;

            case 9:
            case 10:
                System.out.println("Tu nota es Sobresaliente, felicidades!");
                break;

            default:
                System.out.println("Esa no es una nota valida");
        }
    }

}
