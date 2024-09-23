import classes.Circulo;
import classes.Quadrado;
import classes.calculadorArea;
import classes.triangulo;

public class App {
    public static void main(String[] args) {
        Circulo littleCircle = new Circulo(4);
        System.out.println(littleCircle.calcularArea());

        Quadrado littleQuadrado = new Quadrado();
        littleQuadrado.setLado(10);
        System.out.println(littleQuadrado.calcularArea());

        triangulo littleTriangulo = new triangulo(5, 10);
        System.out.println(littleTriangulo.calcularArea());

        calculadorArea calculador = new calculadorArea();
        System.out.println(calculador.somarAreas(littleQuadrado, littleTriangulo));

    }
}