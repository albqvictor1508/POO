package classes;

public class Circulo implements figuraGeometrica {
    final private int raio; //tipo um const

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}