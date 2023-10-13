package ejercicio2_5;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", "Pérez", "12345", "Ahorros", 1.5);

        cuenta.imprimirInformacionCuenta();

        cuenta.consignar(1000);
        cuenta.retirar(500);

        cuenta.aplicarInteresMensual();

        cuenta.imprimirInformacionCuenta();
    }
}
