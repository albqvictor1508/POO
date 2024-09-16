import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual seu sobrenome?");
        String sobrenome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        entrada.nextLine();

        pegaDados dados = new pegaDados(nome, sobrenome, idade);
    }
    
}