package Figuras;


public class Rectangulo {
    int base; // Atributo que define la base de un rectangulo
    int altura; // Atributo que define la altura de un rectangulo
    /**
    * Constructor de la clase Rectangulo
    * @param base Parametro que define la base de un rectangulo
    * @param altura Parametro que define la altura de un rectangulo
    */
    Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    /**
    * Método que calcula y devuelve el área de un rectangulo como la
    * multiplicación de la base por la altura
    * @return Área de un rectangulo
    */
    double calcularArea() {
    return base * altura;
    }
    /**
    * Método que calcula y devuelve el perímetro de un rectangulo
    * como (2 * base) + (2 * altura)
    * @return Perímetro de un rectangulo
    */
    double calcularPerimetro() {
    return (2 * base) + (2 * altura);
    }

}
