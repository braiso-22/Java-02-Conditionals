package conditionals;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brais
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float examen, clase, practico;
        System.out.println("Introduce notas para saber si vas a aprobar");
        System.out.println("-Introduce la nota del examen:");
        examen = teclado.nextFloat();
        if (examen >= 5) {
            System.out.println("Aprobado");
        } else if (examen >= 4) {
            System.out.println("Introduce la nota del trabajo en clase");
            clase = teclado.nextFloat();
            System.out.println("Introduce la nota del trabajo practico");
            practico = teclado.nextFloat();
            if (clase > 8 || practico > 8) {
                System.out.println("aprobado");
            } else if (clase > 5 && practico > 5) {
                System.out.println("aprobado");
            }else {
                System.out.println("Suspenso");
            }
        }else{
            System.out.println("suspenso");
        }
        
    }

}
