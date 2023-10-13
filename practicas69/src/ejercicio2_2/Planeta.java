package ejercicio2_2;

public class Planeta {
     private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaAlSol;
    private TipoPlaneta tipo;
    private boolean observableASimpleVista;
    private double periodoOrbital;
    private double periodoRotacion;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                   int distanciaAlSol, TipoPlaneta tipo, boolean observableASimpleVista,
                   double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observableASimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaAlSol + " millones de km");
        System.out.println("Tipo de Planeta: " + tipo);
        System.out.println("Observable a Simple Vista: " + observableASimpleVista);
        System.out.println("Periodo Orbital: " + periodoOrbital + " años");
        System.out.println("Periodo de Rotación: " + periodoRotacion + " días");
    }
    public double calcularDensidad() {
        return masa / volumen;
    }
    public boolean esPlanetaExterior() {
        double distanciaEnKilometros = distanciaAlSol * 1000000; // Convertir a kilómetros
        return distanciaEnKilometros > 3400000 || distanciaEnKilometros < 2100000; // Rango del cinturón de asteroides
    }
}
