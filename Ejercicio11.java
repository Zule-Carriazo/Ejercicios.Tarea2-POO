package com.mycompany.ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definamos las variables
        double numero1, numero2, numero3, mayor;

        
        System.out.println("Ingrese el primer número:");
        numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        numero3 = scanner.nextDouble();

        if ((numero1 > numero2) && (numero1 > numero3)) {
            mayor = numero1;
        } else {
            if (numero2 > numero3) {
                mayor = numero2;
            } else {
                mayor = numero3;
            }
        }

        System.out.println("El valor mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);

        scanner.close();
    }
}