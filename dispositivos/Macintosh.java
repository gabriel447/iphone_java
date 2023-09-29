package dispositivos;

import apps.NavegadorNaInternet;
import apps.ReprodutorMusical;

public class Macintosh implements NavegadorNaInternet, ReprodutorMusical {
    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }
    public void tocar(){
        System.out.println("Tocar música");
    }
    public void pausar(){
        System.out.println("Parar música");
    }
    public void exibirPagina(){
        System.out.println("Exibir página");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionar nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizar página");
    }
}
