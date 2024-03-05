package com.mycompany.ejercicio12cap4;

import java.util.Scanner;

public class Ejercicio12cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        double valorHoraNormal = scanner.nextDouble();

        double salario = 0;  // Declarar la variable salario

        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;

            if (horasExtras > 8) {
                int horasExtraExtras = horasExtras - 8;
                salario = 40 * valorHoraNormal + 2 * 8 * valorHoraNormal + 3 * valorHoraNormal * horasExtraExtras;
            } else {
                salario = 40 * valorHoraNormal + 2 * horasExtras * valorHoraNormal;
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }

        System.out.println("\nEl trabajador " + nombre + " debengó $" + salario);

        scanner.close();
    }
}

