package com.mycompany.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ventas_depto1, ventas_depto2, ventas_depto3, salario;
        double total_ventas, percent_ventas, salario1, salario2, salario3;

        System.out.println("Ingrese las ventas del departamento 1:");
        ventas_depto1 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 2:");
        ventas_depto2 = scanner.nextDouble();

        System.out.println("Ingrese las ventas del departamento 3:");
        ventas_depto3 = scanner.nextDouble();

        System.out.println("Ingrese el salario de los vendedores:");
        salario = scanner.nextDouble();

        total_ventas = ventas_depto1 + ventas_depto2 + ventas_depto3;
        percent_ventas = 0.33 * total_ventas;

        if (ventas_depto1 > percent_ventas) {
            salario1 = salario + 0.2 * salario;
        } else {
            salario1 = salario;
        }

        if (ventas_depto2 > percent_ventas) {
            salario2 = salario + 0.2 * salario;
        } else {
            salario2 = salario;
        }

        if (ventas_depto3 > percent_ventas) {
            salario3 = salario + 0.2 * salario;
        } else {
            salario3 = salario;
        }

        System.out.println("Salario vendedores departamento 1: $" + salario1);
        System.out.println("Salario vendedores departamento 2: $" + salario2);
        System.out.println("Salario vendedores departamento 3: $" + salario3);

        scanner.close();
    }
}

