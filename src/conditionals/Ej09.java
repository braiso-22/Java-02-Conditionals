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
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora;
        boolean malhora;

        System.out.println("Introduce la hora 0-23 y te diré que dia hay bus");

        hora = teclado.nextInt();
        malhora = hora > 23 || hora < 0;  //compruebo que la hora esté bien

        if (!malhora) {
            switch (hora) {

                case 9:
                case 13:
                case 11:
                    System.out.println("Hay el Domingo");
                    break;
                case 10:
                    System.out.println("Hay todos los días");
                    break;
                case 12:
                    System.out.println("Hay el Jueves y Domingo");
                    break;
                case 14:
                    System.out.println("Hay todos los días menos el jueves");
                    break;
                default:
                    System.out.println("No hay buses a esa hora ningún día");

            }
        } else {
            System.out.println("Has introducido mal la hora");
        }
    }

}
