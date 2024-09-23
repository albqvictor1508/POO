package classes;

public class calculadorArea {
    public double somarAreas(figuraGeometrica quadrado, figuraGeometrica circulo) {
        return quadrado.calcularArea() + circulo.calcularArea();
    }
    
} 

//um grande exemplo do uso de interface, para somar dois parâmetros do tipo da interface, e as duas classes: quadrado e circulo, fazem uso da interface, ou seja, possuem o tipo da classe e o tipo da interface

//Dessa forma, eu poderia utilizar qualquer outra classe que faz uso dessa mesma interface
    

