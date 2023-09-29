package dispositivos;

import apps.NavegadorNaInternet;

public class Macintosh implements NavegadorNaInternet {
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
