package com.mycompany.ejercicio22cap4;
import java.util.Scanner;
/**
 *
 * @author zuzul
 */
public class Ejercicio22cap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Salario básico por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Número de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        double salarioMensual = salarioPorHora * horasTrabajadas;

        if (salarioMensual > 450000) {

            System.out.println("\nNombre del empleado: " + nombreEmpleado);
            System.out.println("Salario Mensual: $" + salarioMensual);
        } else {

            System.out.println("\nNombre del empleado: " + nombreEmpleado);
        }

        scanner.close();
    }
}