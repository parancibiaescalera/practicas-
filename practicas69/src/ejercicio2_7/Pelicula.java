package ejercicio2_7;


public class Pelicula {
    private String nombre;
    private String director;
    private Genero genero;
    private int duracion;
    private int año;
    private double calificacion;
    public Pelicula(String nombre, String director, Genero genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAño() {
        return año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Año de realización: " + año);
        System.out.println("Calificación: " + calificacion);
    }
}
