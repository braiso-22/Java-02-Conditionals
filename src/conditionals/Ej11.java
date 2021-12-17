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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, diasMeses = 0, mes, year;
        boolean diaCorrecto, mesCorrecto, yearBisiesto, fechaValida;

        System.out.println("Introduce una fecha y te digo si es correcta:");
        System.out.println("-Introduce el dia");
        dia = teclado.nextInt();
        System.out.println("-Introduce el mes");
        mes = teclado.nextInt();
        System.out.println("-Introduce el año");
        year = teclado.nextInt();

        mesCorrecto = mes <= 12 && mes > 0;
        yearBisiesto = year % 100 != 0 && year % 4 == 0 || year % 400 == 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMeses = 31;
                diaCorrecto = dia > 0 && dia <= diasMeses;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                diasMeses = 30;
                diaCorrecto = dia > 0 && dia <= diasMeses;
                break;

            case 2:
                if (yearBisiesto) {
                    diasMeses = 29;
                    diaCorrecto = dia > 0 && dia <= diasMeses;
                } else {
                    diasMeses = 28;
                    diaCorrecto = dia > 0 && dia <= diasMeses;
                }
                break;
            default:
                diaCorrecto = false;
                break;
        }
        fechaValida = diaCorrecto && mesCorrecto;
        if (fechaValida) {
            if (dia < diasMeses) {
                dia++;
            } else if (mes == 12) {
                dia = 1;
                mes = 1;
                year++;
            } else {
                dia = 1;
                mes++;
            }
            System.out.println("El dia siguiente es: " + +dia + "/" + mes + "/" + year);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
