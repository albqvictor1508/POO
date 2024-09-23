public class uchiha extends ninja{
    Boolean sharingan;

    public String temSharingan(Boolean sharingan) {
        if(sharingan == true) return "TEM CHARINGA!";

        return "TU É UM BOSTA";
    }

    public void sharinganAtivado() {
        System.out.println("CHARINGA ATIVADO");
    }

    public void saske() {
        System.out.println("matarei todos vou me vingar do meu irmão vou passar a faca em quem eu ver");
    }

    @Override
    public void ataqueBasico() {
        System.out.println("Sou " + nome + " E estou dando um ataque básico e tacando um jutsu bola de fogo");
    }

    public void ataqueBasico(int chakra) {
        if(chakra > 2) {
            System.out.println("Susanoo ativado");
            return;
        }

        if(chakra <= 2) {
            System.out.println("Só deu pra ativar o charinga");
            return;
        }

        if(chakra == 0) {
        System.out.println("to sem chakra");
        return;
        }
    }
}