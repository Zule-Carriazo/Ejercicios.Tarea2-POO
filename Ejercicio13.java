package com.mycompany.ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double costo_compra;
        String color_bolita;
        double valor_pagar;
        double porcentajeDescuento;

        System.out.println("Ingrese el valor de la compra:");
        costo_compra = scanner.nextDouble();

        System.out.println("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL):");
        scanner.nextLine(); 
        color_bolita = scanner.nextLine().toUpperCase();

        switch (color_bolita) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            default:
                porcentajeDescuento = 100;
        }

        valor_pagar = costo_compra - (porcentajeDescuento * costo_compra / 100);

        System.out.println("El cliente debe pagar: $" + valor_pagar);

        scanner.close();
    }
}