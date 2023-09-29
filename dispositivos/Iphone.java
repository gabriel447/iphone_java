package dispositivos;

import apps.AparelhoTelefonico;
import apps.NavegadorNaInternet;
import apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    public void ligar(){
        System.out.println("Fazer ligação");
    }
    public void atender(){
        System.out.println("Atender ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciar correio de voz");
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
