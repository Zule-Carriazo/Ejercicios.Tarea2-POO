package com.mycompany.ejercicio24cap4;
import java.util.Scanner;

public class Ejercicio24cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double esfera_A, esfera_B, esfera_C;

        System.out.println("Ingrese el peso de la esfera A:");
        esfera_A = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera B:");
        esfera_B = scanner.nextDouble();

        System.out.println("Ingrese el peso de la esfera C:");
        esfera_C = scanner.nextDouble();

        if (esfera_A > esfera_B && esfera_A > esfera_C) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (esfera_B > esfera_A && esfera_B > esfera_C) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (esfera_C > esfera_A && esfera_C > esfera_B) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Las esferas tienen pesos iguales.");
        }

    }
}

