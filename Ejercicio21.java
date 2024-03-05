
package com.mycompany.ejercicio21;
public class Ejercicio21 {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        lado1=2.5;
        lado2=Math.pow(1.8,2);
        lado3=Math.sqrt(5);
        double perimetro = lado1+lado2+lado3;
        double semiperimetro = perimetro / 2;
         // double altura = Math.sqrt(3)*lado/2; //altura sqrt(lado**2 - (lado/2)**2) resumido
         // double area = (Math.sqrt(3) / 4) * lado * lado; //  área base*altura/2 -> 4*(4sqrt(3)/2)/2
        // Cálculo del área utilizando la fórmula de Herón triangulo escaleno
        double area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        System.out.println("\nLos lados del triangulo son:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Su perimetro es: " + perimetro);
        System.out.println("Su semiperimetro: " + semiperimetro);
        //  System.out.println("Su altura: " + altura);
        System.out.println("Y su area: " + area);
    }
    
}