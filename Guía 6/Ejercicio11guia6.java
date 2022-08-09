/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11guia6;

import java.util.Scanner;

/**
 *
 * @author Melinzilla
 */
public class Ejercicio11guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        boolean logico = false;
        System.out.println("Ingrese un número");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = read.nextInt();
        do {
            System.out.println("Menu"
                    + "1-Sumar"
                    + "2-Restar"
                    + "3-Multiplicar"
                    + "4-Dividir"
                    + "5-Salir");

            int opcion = 
            read.nextLine();
            switch (opcion) {
                case 1: 
                    System.out.println(num1 + num2);
                    break;
                case 2: 
                    System.out.println(num1 -num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4: 
                    System.out.println(num1 / num2);
                    break;
                case 5: 
                    System.out.println("¿Está seguro de que desea salir?");
                    read.nextLine();
                    String respuesta = read.nextLine();
                    if (respuesta.equalsIgnoreCase("S")); {
                         logico = true;
                    }
                    break;
            }

        } while (logico == false);
    }
    
}
