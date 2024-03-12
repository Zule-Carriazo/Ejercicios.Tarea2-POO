package com.mycompany.ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definamos las variables
        int numeroInscripcion;
        String nombres;
        double patrimonio;
        int estratoSocial;
        double pagoMatricula = 50000;

        
        System.out.println("Ingrese el número de inscripción:");
        numeroInscripcion = scanner.nextInt();

        System.out.println("Ingrese los nombres:");
        scanner.nextLine(); 
        nombres = scanner.nextLine();

        System.out.println("Ingrese el patrimonio:");
        patrimonio = scanner.nextDouble();

        System.out.println("Ingrese el estrato social:");
        estratoSocial = scanner.nextInt();

    
        if (patrimonio > 2000000 && estratoSocial > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }

    
        System.out.println("El estudiante con número de inscripción " + numeroInscripcion +
                " y nombre " + nombres + " debe pagar: $" + pagoMatricula);

        scanner.close();
    }
}