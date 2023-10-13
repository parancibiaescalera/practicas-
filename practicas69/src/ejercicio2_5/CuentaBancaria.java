package ejercicio2_5;

public class CuentaBancaria {
    private String nombresTitular;
    private String apellidosTitular;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    private double tasaInteresMensual;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, String numeroCuenta, String tipoCuenta, double tasaInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public void imprimirInformacionCuenta() {
        System.out.println("Información de la cuenta bancaria:");
        System.out.println("Titular: " + nombresTitular + " " + apellidosTitular);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tasa de Interés Mensual: " + tasaInteresMensual + "%");
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Consignación exitosa. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar el retiro.");
            }
        } else {
            System.out.println("El valor a retirar debe ser mayor que cero.");
        }
    }

    public void aplicarInteresMensual() {
        double interesMensual = (saldo * tasaInteresMensual) / 100;
        saldo += interesMensual;
        System.out.println("Interés mensual aplicado. Nuevo saldo: $" + saldo);
    }
}
