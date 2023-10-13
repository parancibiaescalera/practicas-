package ejercicio2_3;

public class Automovil {
    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;
    private boolean esAutomatico;
    private int multas;
    public enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    public enum TipoAutomovil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    public enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    // Constructor
    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible,
                     TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos,
                     int velocidadMaxima, Color color, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
        this.esAutomatico = esAutomatico;
        this.multas = 0;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public void acelerar(int velocidad) {
        if (velocidadActual + velocidad <= velocidadMaxima) {
            velocidadActual += velocidad;
        } else {
            generarMulta();
            System.out.println("Velocidad máxima permitida superada. Multa generada.");
        }
    }
    public void desacelerar(int velocidad) {
        if (velocidadActual - velocidad >= 0) {
            velocidadActual -= velocidad;
        } else {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        }
    }
    public void frenar() {
        velocidadActual = 0;
    }
    public double calcularTiempoLlegada(int distancia) {
        return (double) distancia / velocidadActual;
    }
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }
    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }
    private void generarMulta() {
        multas++;
    }
    public boolean tieneMultas() {
        return multas > 0;
    }
    public int valorTotalMultas() {
        return multas;
    }
}
