package ejercicio2_1;

public class Persona {
        private String nombre;
        private String apellido;
        private int numeroDocumento;
        private int añoNacimiento;
        private String paisNacimiento;
        private char genero;
        public Persona(String nombre, String apellido, int numeroDocumento, int añoNacimiento, String paisNacimiento, char genero) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroDocumento = numeroDocumento;
            this.añoNacimiento = añoNacimiento;
            this.paisNacimiento = paisNacimiento;
            this.genero = genero;
        }
        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Número de Documento: " + numeroDocumento);
            System.out.println("Año de Nacimiento: " + añoNacimiento);
            System.out.println("País de Nacimiento: " + paisNacimiento);
            System.out.println("Género: " + (genero == 'H' ? "Hombre" : "Mujer"));
        }
}

