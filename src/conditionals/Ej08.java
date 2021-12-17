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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, hora;
        String dia_e;
        boolean haybus, //esto solo es verdadero si se cumplen todas las condiciones de que haya bus
                malhora; //esto es para que no escriban mal la hora

        System.out.println("Introduce primero el día de la semana 1-7 y despúes"
                + " la hora 9-14 después te diré si hay bus");
        dia = teclado.nextInt();
        hora = teclado.nextInt();

        haybus = dia == 7 || hora == 10 || hora == 14 && dia != 6 || dia == 4 && hora == 12;
        malhora = hora > 14 || hora < 9;

        switch (dia) {     //para que diga el dia y además comprueba que no lo hayas metido mal 
            case 1:
                dia_e = "Lunes";
                break;
            case 2:
                dia_e = "Martes";
                break;
            case 3:
                dia_e = "Miercoles";
                break;
            case 4:
                dia_e = "Jueves";
                break;
            case 5:
                dia_e = "Viernes";
                break;
            case 6:
                dia_e = "Sabado";
                break;
            case 7:
                dia_e = "Domingo";
                break;
            default:
                dia_e = "error";
        }

        if (!dia_e.equals("error") && !malhora && haybus) { //si metes bien el dia, la hora y hay bus te lo dice
            System.out.println("El " + dia_e + " a las " + hora + " hay bus");
        } else if (!haybus) {                        //si no hay bus te lo dice
            System.out.println("No hay bus a esa hora del día");
        } else {                                     //como no era ninguno de los anteriores es que metiste mal los datos
            System.out.println("No has introducido bien los numeros");
        }
    }

}
