import java.util.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        aluno.setNome(entrada.nextLine());

        System.out.println("Qual seu sobrenome?");
        aluno.setSobrenome(entrada.nextLine());

        System.out.println("Qual sua idade?");
        aluno.setIdade(entrada.nextInt());

        entrada.nextLine();

        System.out.println("Qual o nome do seu professor?");
        aluno.setProfessor(prof);
        aluno.prof.setNome(entrada.nextLine());
        
        System.out.println(aluno.getNome() + " " + aluno.getSobrenome() + " " + aluno.getIdade() + " " + aluno.prof.getNome());
    }
}