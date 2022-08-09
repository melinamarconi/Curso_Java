/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia6;

import java.util.Scanner;

/**
 *
 * @author Melinzilla
 */
public class Ejercicio4guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int grados = read.nextInt();
        System.out.println("En grados Fahrenheit es: " + (32+(9 * grados / 5)));
    }
    
}
