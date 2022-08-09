/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guia6;

import java.util.Scanner;

/**
 *
 * @author Melinzilla
 */
public class Ejercicio5guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = read.nextInt();
        System.out.println("El doble del número es" + (2 * num));
        System.out.println("El triple del número es" + (3 * num));
        System.out.println("La raiz cuadrada del número es: " +  Math.sqrt(num));
    }
    
}
