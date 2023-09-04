package apple;

public class Ipod extends Navegador{

    public void ligarAparelho() {
        System.out.println("Aparelho ligado.");
    }
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música em pause.");
    }

    public void selecionarMusica() {
        System.out.println("Selecione uma música para tocar.\n"+
                "Musica 1..........|\n"+
                "Musica 2..........|\n"+
                "Musica 3..........|");
    }

}
