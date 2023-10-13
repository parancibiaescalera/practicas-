package ejercicio2_6;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "Perez", "12345", "Ahorros", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", "Gomez", "67890", "Corriente", 500.0);

        cuenta1.imprimirInformacion();
        cuenta2.imprimirInformacion();

        cuenta1.transferir(cuenta2, 300.0);
        cuenta1.imprimirInformacion();
        cuenta2.imprimirInformacion();
    }
}
