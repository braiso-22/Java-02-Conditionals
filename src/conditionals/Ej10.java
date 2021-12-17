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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, year;
        boolean diaCorrecto, mesCorrecto, yearBisiesto;

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
                diaCorrecto = dia > 0 && dia <= 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia > 0 && dia <= 30;
                break;

            case 2:
                if (yearBisiesto) {
                    diaCorrecto = dia > 0 && dia <= 29;
                } else {
                    diaCorrecto = dia > 0 && dia <= 28;
                }
                break;
            default:
                diaCorrecto = false;
                break;
        }
        if(diaCorrecto && mesCorrecto){
            System.out.println("Fecha valida");
        }else{
            System.out.println("Fecha no valida");
        }
    }

}
