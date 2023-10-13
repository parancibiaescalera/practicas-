package ejercicio2_8;

public class Avion {
    private String fabricante;
    private int numMotores;

    public Avion(String fabricante, int numMotores) {
        this.fabricante = fabricante;
        this.numMotores = numMotores;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public void imprimirFabricante() {
        System.out.println("Fabricante del avión: " + fabricante);
    }

    public void cambiarFabricante(Avion a) {
        a.setFabricante("Lockheed");
    }
}
