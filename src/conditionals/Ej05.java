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
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora, minuto, segundo;
        System.out.println("Introduce una hora en notación digital y te digo"
                + " cuantos segundos han pasado del día ");
        System.out.println("Introduce la hora:");
        hora = teclado.nextInt();
        System.out.println("Introduce el minuto:");
        minuto = teclado.nextInt();
        System.out.println("Introduce el segundo:");
        segundo = teclado.nextInt();

        if ((hora >= 24 || minuto >= 60 || segundo >= 60)
                || hora < 0 || minuto < 0 || segundo < 0) {
            System.out.println("Recuerda que las horas no pasan de 23"
                    + " y los minutos y segundos no pasan de 59 y el minimo es 0");
        } else {
            segundo += hora * 3600;
            segundo += minuto * 60;
            System.out.printf("Han pasado %d segundos\n",segundo);
        }
    }

}
