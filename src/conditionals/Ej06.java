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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a, b, c, d, e, f, x, y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a resolver la siguiente ecuación lineal,\n \n"
                + "ax + by = c \n"
                + "dx + ey = f");
        System.out.println("por favor introduce los valores a, b, c, d, e, f \n");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        d = teclado.nextFloat();
        e = teclado.nextFloat();
        f = teclado.nextFloat();

        if ((a * e) - (b * d) != 0) {
            x = ((c * e) - (b * f)) / ((a * e) - (b * d));
            y = ((a * f) - (c * d)) / ((a * e) - (b * d));

            System.out.printf("En ese caso\n\tX es: %f \n\tY es: %f\n", x, y);
        } else {
            System.out.println("En este caso hay soluciones infinitas o ninguna");
        }
    }

}
