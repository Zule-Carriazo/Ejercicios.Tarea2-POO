package com.mycompany.ejercicio15cap4;

import java.util.Scanner;
/**
 *
 * @author zuzul
 */
public class Ejercicio15cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los pesos de las cuatro esferas (A, B, C, D):");

        System.out.print("Peso de la esfera A: ");
        int pesoA = scanner.nextInt();

        System.out.print("Peso de la esfera B: ");
        int pesoB = scanner.nextInt();

        System.out.print("Peso de la esfera C: ");
        int pesoC = scanner.nextInt();

        System.out.print("Peso de la esfera D: ");
        int pesoD = scanner.nextInt();

        // Función para determinar que esfera es diferente
        String resultado = determinarEsferaDiferente(pesoA, pesoB, pesoC, pesoD);
        System.out.println("\n" + resultado);
        scanner.close();
    }

   
    private static String determinarEsferaDiferente(int pesoA, int pesoB, int pesoC, int pesoD) {
        if (pesoA == pesoB && pesoB == pesoC) {
            if (pesoD > pesoA) {
                return "D es la esfera diferente\n y es de mayor peso";
            } else {
                return "D es la esfera diferente\n y es de menor peso";
            }
        } else if (pesoA == pesoC && pesoC == pesoD) {
            if (pesoB > pesoA) {
                return "B es la esfera diferente\n y es de mayor peso";
            } else {
                return "B es la esfera diferente\n y es de menor peso";
            }
        } else if (pesoA == pesoB && pesoB == pesoD) {
            if (pesoC > pesoA) {
                return "C es la esfera diferente\n y es de mayor peso";
            } else {
                return "C es la esfera diferente\n y es de menor peso";
            }
        } else {
            if (pesoA > pesoB) {
                return "A es la esfera diferente\n y es de mayor peso";
            } else {
                return "A es la esfera diferente\n y es de menor peso";
            }
        }
    }
}
