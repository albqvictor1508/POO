public class Aluno {
    String nome;
    String sobrenome;
    int idade;
    Professor prof;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setProfessor(Professor prof) {
        this.prof = prof;
    }

    public Professor getProfessor() {
        return prof;
    }
}