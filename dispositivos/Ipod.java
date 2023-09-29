package dispositivos;

import apps.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }
    public void tocar(){
        System.out.println("Tocar música");
    }
    public void pausar(){
        System.out.println("Parar música");
    }
}
