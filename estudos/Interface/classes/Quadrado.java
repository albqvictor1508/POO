package classes;

public class Quadrado implements figuraGeometrica{
    private int lado;
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
