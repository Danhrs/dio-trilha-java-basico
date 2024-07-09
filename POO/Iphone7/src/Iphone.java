public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical{

    @Override
    public void ligar(String numero){
        System.out.println("LINGANDO PARA O NÚMERO");
    }
    @Override
    public void atender(){
        System.out.println("ATENDENDO");
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("INICIAR CORREIO DE VOZ");
    }
    
    @Override
    public void exibirPagina(String url){
        System.out.println("EXIBIR PÁGINA");
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("ADICIONAR NOVA ABA");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("ATUALIZAR PAGINA");
    }
    
    @Override
    public void tocar(){
        System.out.println("TOCAR MÚSICA");
    }
    @Override
    public void pausar(){
        System.out.println("PAUSAR MÚSICA");
    }
    @Override
    public void  selecionarMusica(String musica){
        System.out.println("SELECIONAR MÚSICA");
    }
    
}
