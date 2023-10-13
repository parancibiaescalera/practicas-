package ejercicio2_8;

public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Airbus", 4);
        Avion a2 = new Avion("Lockheed", 4);

        // Imprimir datos iniciales de ambos aviones
        System.out.println("Datos del avión a1:");
        System.out.println("Fabricante: " + a1.getFabricante());
        System.out.println("Número de motores: " + a1.getNumMotores());

        System.out.println("Datos del avión a2:");
        System.out.println("Fabricante: " + a2.getFabricante());
        System.out.println("Número de motores: " + a2.getNumMotores());

        // Llamada al método cambiarFabricante
        a1.cambiarFabricante(a2);

        // Imprimir datos después de cambiar el fabricante
        System.out.println("Datos del avión a1 después de cambiar el fabricante de a2:");
        System.out.println("Fabricante: " + a1.getFabricante());
        System.out.println("Número de motores: " + a1.getNumMotores());

        System.out.println("Datos del avión a2 después de cambiar el fabricante de a2:");
        System.out.println("Fabricante: " + a2.getFabricante());
        System.out.println("Número de motores: " + a2.getNumMotores());
    }
}
