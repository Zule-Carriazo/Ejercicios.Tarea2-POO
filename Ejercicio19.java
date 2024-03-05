package com.mycompany.ejercicio19;
public class Ejercicio19 {

    public static void main(String[] args) {
        double lado = 4;
        double perimetro = 3 * lado;
        double altura = Math.sqrt(3)*lado/2; //altura sqrt(lado**2 - (lado/2)**2) resumido para equilatero
        double area = (Math.sqrt(3) / 4) * lado * lado; //  área base*altura/2 -> 4*(4sqrt(3)/2)/2
        System.out.println("\nInformaación del triángulo equilátero:");
        System.out.println("Lado: " + lado);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}
