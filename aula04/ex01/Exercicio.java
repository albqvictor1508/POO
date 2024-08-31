import java.util.*;

public class Exercicio {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String nome;
       System.out.println("Digite seu nome otário: ");
       nome = entrada.nextLine();
       System.out.println("Digite sua idade: ");
       int idade = entrada.nextInt();
       
       System.out.println("Boa noite, " + nome + " pelo visto você tem " + idade + " anos");

    }
}