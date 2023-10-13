package ejercicio2_4;

import java.lang.Math;
class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
class TrianguloRectangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }

    public String determinarTipoTriangulo() {
        if (base == altura && altura == calcularHipotenusa())
            return "Equilátero";
        else if (base == altura || altura == calcularHipotenusa() || base == calcularHipotenusa())
            return "Isósceles";
        else
            return "Escaleno";
    }

    private double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }
}
class Rombo {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double calcularPerimetro() {
        return 4 * Math.sqrt((diagonalMayor * diagonalMayor + diagonalMenor * diagonalMenor) / 4);
    }
}

class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}