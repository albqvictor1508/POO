public class Main {
    public static void main(String[] args) {
        uzumaki naruto = new uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.ataqueBasico();
        naruto.aldeia = "Aldeia da Folha";
        naruto.vivo = true;
        System.out.println(naruto.taVivo(naruto.vivo));
        naruto.ChakraInfinito();

        System.out.println("\n");

        uchiha sasuke = new uchiha();
        sasuke.nome = "Uchiha Sasuke";
        sasuke.ataqueBasico();
        sasuke.ataqueBasico(0);
        sasuke.aldeia = "Sou de todas as aldeia";
        sasuke.sharingan = true;
        System.out.println(sasuke.temSharingan(sasuke.sharingan)); 
        sasuke.sharinganAtivado();
        sasuke.saske();

        //usando herança, polimorfismo e 
    }
}