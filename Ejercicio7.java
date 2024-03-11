package com.mycompany.ejercicio7;
public class Ejercicio7 {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el valor de a: ");
    int valor_a = scanner.nextInt();

    System.out.print("Ingrese el valor de b: ");
    int valor_b = scanner.nextInt();

    if (valor_a > valor_b) {
        System.out.println("A es mayor que B");
    } else if (valor_a == valor_b) {
        System.out.println("A es igual que B");
    } else {
        System.out.println("B es mayor que A");
    }
}