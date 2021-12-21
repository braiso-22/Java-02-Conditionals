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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int year, mes, dia,
            year2, mes2, dia2;

        System.out.println("Introduce 2 fechas con dia, mes y año");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        year = teclado.nextInt();
        dia2 = teclado.nextInt();
        mes2 = teclado.nextInt();
        year2 = teclado.nextInt();

        boolean mayor1 = year > year2 || year == year2 && mes > mes2 || year == year2 && mes == mes2 && dia > dia2;
                

        if (mayor1) {
            System.out.printf("%d/%d/%d es mayor\n",dia,mes,year);
        } else if (!mayor1) {
            System.out.printf("%d/%d/%d es mayor\n",dia2,mes2,year2);
        } else {
            System.out.println("Son la misma fecha");
        }
    }

}
