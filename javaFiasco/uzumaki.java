public class uzumaki extends ninja {
    Boolean vivo;


        public void ChakraInfinito() {
        System.out.println("tenho chakra infinito porra sou uzumaki");
    }

    public String taVivo(Boolean vivo) {
        if(vivo == true) {
            return "KRL TA VIVOOOOOOOOOOO";
        }

        return "NEM VIVO TU TA FILHO DA PUTA";
    }

    @Override
    public void ataqueBasico() {
        System.out.println("Sou " + nome + " E estou dando um ataque básico e metendo um rasengan");
    }
}