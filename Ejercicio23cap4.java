/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio23cap4;
import java.util.Scanner;
public class Ejercicio23cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Valor de C: ");
        double C = scanner.nextDouble();


        double discriminante = B * B - 4 * A * C;


        if (discriminante > 0) {
            // Dos soluciones reales distintas
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);

            System.out.println("\nLas soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -B / (2 * A);

            System.out.println("\nLa solución doble es:");
            System.out.println("x = " + x);
        } else {
    
            double parteReal = -B / (2 * A);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * A);

            System.out.println("\nLas soluciones son imaginarias:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }


    }
}
