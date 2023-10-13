package ejercicio2_2;

public class Main {

    public static void main(String[] args) {
        // Crear dos objetos de Planeta
        Planeta planeta1 = new Planeta("Marte", 2, 6.39e23, 163.2e9, 6792, 225, TipoPlaneta.TERRESTRE, true, 1.88, 1.03);
        Planeta planeta2 = new Planeta("Júpiter", 79, 1.898e27, 1431e12, 139822, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        // Mostrar los valores de los atributos en pantalla
        System.out.println("Planeta 1:");
        planeta1.imprimir();
        System.out.println("Densidad de Planeta 1: " + planeta1.calcularDensidad() + " kg/km³");
        System.out.println("¿Planeta 1 es exterior al sistema solar? " + planeta1.esPlanetaExterior());

        System.out.println("\nPlaneta 2:");
        planeta2.imprimir();
        System.out.println("Densidad de Planeta 2: " + planeta2.calcularDensidad() + " kg/km³");
        System.out.println("¿Planeta 2 es exterior al sistema solar? " + planeta2.esPlanetaExterior());
    }
}
