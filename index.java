public class Index {
    public static void main(String[] args) {
        Index pessoa = new Index();

    System.out.println(pessoa.falarNomeCompleto("victor", "arruda"));

    System.out.println(pessoa.Calculadora(100, "/", 10));
    System.out.println(pessoa.Media(2.5, 9, 6));
    System.out.println("Somador de numeros: " + pessoa.soma10Numeros(new int[]{1,1,1,1,1,1,1,1,1,1}));
    }
    public String falarNomeCompleto(String nome ,String sobrenome) {
        return nome + " " + sobrenome;
    }

    public int Calculadora(int numero,String operacao, int numero2) {
        int contador = 0;
        if(operacao == "+") contador += numero + numero2;
        if(operacao == "-") contador += numero - numero2;
        if(operacao == "/") contador += numero / numero2;
        if(operacao == "*") contador += numero * numero2;

        return contador;
    }

    public double Media(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }


    public int soma10Numeros(int[] numeros) {
            int contador = 0;
            
        for(int numero : numeros) {
            contador += numero;
        }

        return contador;
    }
}
