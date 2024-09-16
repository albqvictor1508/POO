public class pegaDados {
    private String nome;
    private String sobrenome;
    private int idade;

    public pegaDados(String nome, String sobrenome,int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        System.out.println(nome + " " + sobrenome + " de " + idade + " anos");

    }
}