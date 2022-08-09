/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia6;

import java.util.Scanner;

/**
 *
 * @author Melinzilla
 */
public class Ejercicio1guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = read.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los dos números es: " + suma);
    }
    
}
