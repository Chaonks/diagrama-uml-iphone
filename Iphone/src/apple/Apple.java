package apple;

public class Apple {

    public static void main(String[] args) {

        System.out.println("Ipod\n");

        //A classe Ipod e seus métodos.
        Ipod ipod = new Ipod();
        ipod.ligarAparelho();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();
        ipod.abrirNavegador();
        ipod.exibirPagina();
        ipod.abrirAba();
        System.out.println("\n");

           System.out.println("Iphone\n");
        //A classe Iphone commétodos herdados da classe Ipod.
        
      Iphone iphone = new Iphone();
        iphone.ligarAparelho();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.abrirNavegador();
        iphone.exibirPagina();
        iphone.abrirAba();
        iphone.atender();
        iphone.iniciarCorreio();

    }

}
