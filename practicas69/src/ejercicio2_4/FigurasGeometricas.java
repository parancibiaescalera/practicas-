package ejercicio2_4;

public class FigurasGeometricas {
    public static void main(String[] args) {
        // Crear instancias de cada figura
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Cuadrado cuadrado = new Cuadrado(5);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);
        Rombo rombo = new Rombo(6, 8);
        Trapecio trapecio = new Trapecio(10, 6, 5, 7, 7);

        // Calcular y mostrar el área y el perímetro de cada figura
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del triángulo rectángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo rectángulo: " + triangulo.calcularPerimetro());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());

        System.out.println("Área del rombo: " + rombo.calcularArea());
        System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());

        System.out.println("Área del trapecio: " + trapecio.calcularArea());
        System.out.println("Perímetro del trapecio: " + trapecio.calcularPerimetro());
    }
}
