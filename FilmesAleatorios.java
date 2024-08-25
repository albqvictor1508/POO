public class FilmesAleatorios {
    public static void main(String[] args) {
        FilmesAleatorios filme = new FilmesAleatorios();

        int numero = filme.numeroAleatorio();

        System.out.println(filme.acessaArray(numero));
        //System.out.println(filme.acessaArray());
    }

    public String[] FrasesDeFilme() {
        String[] frases = {"Que a Força esteja com você. - Star Wars (1977)", "De todos os bares de todas as cidades do mundo, ela entra no meu. - Casablanca (1942)", "Vou fazer uma oferta irrecusável. - O Poderoso Chefão (1972)", "Eu voltarei. - O Exterminador do Futuro (1984)", "Não há lugar como o nosso lar. - O Mágico de Oz (1939)"};
        return frases;   
    }

    public int numeroAleatorio() {
        return (int) (Math.random() * 5); 
    }

    public String acessaArray(int numero) {
        String[] frases = this.FrasesDeFilme();
        return this.ExibeFilme(frases[numero]);

    }

    public String ExibeFilme(String frase) {
        System.out.println(frase);
    }
}
