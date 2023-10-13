package ejercicio2_6;

public class CuentaBancaria {
    private String nombres;
    private String apellidos;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    private double tasaInteres;
    private boolean activa;

    public CuentaBancaria(String nombres, String apellidos, String numeroCuenta, String tipoCuenta, double saldo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.tasaInteres = 0.0;
        this.activa = (saldo > 0);
    }

    public void imprimirInformacion() {
        System.out.println("Información de la cuenta bancaria:");
        System.out.println("Titular: " + nombres + " " + apellidos);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + String.format("%.2f", saldo));
        System.out.println("Tasa de interés mensual: " + tasaInteres + "%");
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        if (activa && valor > 0) {
            saldo += valor;
            System.out.println("Se ha consignado $" + String.format("%.2f", valor) + " en la cuenta.");
            activa = true;
        } else {
            System.out.println("No se puede consignar en una cuenta inactiva o con valor no válido.");
        }
    }

    public void retirar(double valor) {
        if (activa && valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Se ha retirado $" + String.format("%.2f", valor) + " de la cuenta.");
            if (saldo == 0) {
                activa = false;
            }
        } else {
            System.out.println("No es posible retirar esa cantidad de la cuenta o la cuenta está inactiva.");
        }
    }

    public void calcularInteres() {
        if (activa) {
            double interesMensual = (tasaInteres / 100) * saldo;
            saldo += interesMensual;
            System.out.println("Se ha aplicado un interés de $" + String.format("%.2f", interesMensual) + " a la cuenta.");
        } else {
            System.out.println("No se puede aplicar interés a una cuenta inactiva.");
        }
    }

    public boolean compararSaldos(CuentaBancaria otraCuenta) {
        return this.saldo >= otraCuenta.saldo;
    }

    public void transferir(CuentaBancaria cuentaDestino, double valor) {
        if (activa && valor > 0 && valor <= saldo) {
            this.retirar(valor);
            cuentaDestino.consignar(valor);
            System.out.println("Se ha transferido $" + String.format("%.2f", valor) + " a la cuenta " + cuentaDestino.numeroCuenta + ".");
        } else {
            System.out.println("No es posible realizar la transferencia.");
        }
    }
}
