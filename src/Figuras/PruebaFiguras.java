package Figuras;

import java.util.Scanner;


public class PruebaFiguras {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio,lado,base_rectangulo,altura_rectangulo;
        int base_triangulorectangulo,altura_triangulorectangulo;
        System.out.println("Ingrese el valor del radio del cuadrado: ");
        radio = entrada.nextInt();
        Circulo figura1 = new Circulo(radio);
        
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado = entrada.nextInt();
        Cuadrado figura3 = new Cuadrado(lado);
        
        System.out.println("Ingrese el valor de la base del rectángulo: ");
        base_rectangulo = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura del rectángulo: ");
        altura_rectangulo = entrada.nextInt();
        
        Rectangulo figura2 = new Rectangulo(base_rectangulo,altura_rectangulo);
        
        System.out.println("Ingrese el valor de la base del triángulo rectángulo: ");
        base_triangulorectangulo = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura del triángulo rectángulo: ");
        altura_triangulorectangulo = entrada.nextInt();
        
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base_triangulorectangulo,altura_triangulorectangulo);
        
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

        }
    
}
