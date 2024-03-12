package com.mycompany.ejercicio10;
import java.util.Scanner;


public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int horasTrabajadas;
        double valorHoraNormal;
        int horasExtrasTrabajadas;
        int horasExtrasExcedentes8;
        double salario;

        System.out.println("Ingrese el nombre del trabajador:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el número de horas trabajadas:");
        horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese el valor por hora normal de trabajo:");
        valorHoraNormal = scanner.nextDouble();

        if (horasTrabajadas > 40) {
            horasExtrasTrabajadas = horasTrabajadas - 40;

            if (horasExtrasTrabajadas > 8) {
                horasExtrasExcedentes8 = horasExtrasTrabajadas - 8;
                salario = 40 * valorHoraNormal + 16 * valorHoraNormal + horasExtrasExcedentes8 * 3 * valorHoraNormal;
            } else {
                salario = 40 * valorHoraNormal + horasExtrasTrabajadas * 2 * valorHoraNormal;
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }

        System.out.println("El trabajador " + nombre + " devengó: $" + salario);

        scanner.close();
    }
}