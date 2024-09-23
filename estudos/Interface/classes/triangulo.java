package classes;

public class triangulo implements figuraGeometrica {
    final private int base;
    final private int altura;

    public triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
}
