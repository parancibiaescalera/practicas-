package ejercicio2_3;

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Toyota", 2022, 2.0, Automovil.TipoCombustible.GASOLINA, Automovil.TipoAutomovil.SUV, 4, 5, 180, Automovil.Color.AZUL, true);
        automovil.setVelocidadActual(100);

        System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " km/h");

        automovil.acelerar(20);
        System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " km/h");

        automovil.desacelerar(50);

        automovil.frenar();
        System.out.println("Velocidad Actual: " + automovil.getVelocidadActual() + " km/h");

        automovil.imprimir();
    }
}
