
package com.mycompany.ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        int codigoEmpleado = 100372345;
        
        String nombres = "Juan Felipe Cruz";
        double horasTrabajadas = 160;
        double valorHora = 1000;
        double porcentajeRetencion = 12.5;
        double salarioBruto = horasTrabajadas * valorHora;
        double retencion = salarioBruto * (porcentajeRetencion / 100);
        double salarioNeto = salarioBruto - retencion;
        System.out.println("\nInformación del empleado:");
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombre: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retención en la fuente: $" + retencion);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}
