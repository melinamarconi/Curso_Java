/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10guia6;

import java.util.Scanner;

/**
 *
 * @author Melinzilla
 */
public class Ejercicio10guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner read = new Scanner(System.in);
         int suma = 0;
         System.out.println("Ingrese el valor límite");
         int valorLimite = read.nextInt();
         while (suma < valorLimite) {
             System.out.println("Ingrese un número");
             int num = read.nextInt();
             suma = suma + num;
         }
    }
    
}
