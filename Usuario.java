import dispositivos.Ipod;
import dispositivos.Macintosh;
import dispositivos.Iphone;
public class Usuario {
    public static void main(String[] args) {
        Ipod ipod1 = new Ipod();
        Macintosh macintosh1 = new Macintosh();
        Iphone iphone1 = new Iphone();

        System.out.println(" ");
        System.out.println("** IPOD **");
        System.out.println(" ");

        ipod1.selecionarMusica();
        ipod1.tocar();
        ipod1.pausar();

        System.out.println(" ");
        System.out.println("** Macintosh **");
        System.out.println(" ");

        macintosh1.exibirPagina();
        macintosh1.adicionarNovaAba();
        macintosh1.atualizarPagina();
        macintosh1.selecionarMusica();
        macintosh1.tocar();
        macintosh1.pausar();

        System.out.println(" ");
        System.out.println("** Iphone **");
        System.out.println(" ");
        iphone1.ligar();
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        iphone1.selecionarMusica();
        iphone1.tocar();
        iphone1.pausar();
        iphone1.exibirPagina();
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();


    }
}
