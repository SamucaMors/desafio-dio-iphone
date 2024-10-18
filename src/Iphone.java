

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegaNaInternet{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Iphone iphone_4 = new Iphone();
        //Comportamentos de Reprodutor Musical
        iphone_4.tocar();
        iphone_4.selecionaMusica("I love You - Samuca Mors");
        iphone_4.pausar();
        //Comportamentos de AAparelho Telefônico
        iphone_4.ligar("91 912345678");
        iphone_4.atender();
        iphone_4.iniciaCorreioVoz();
        //Comportamentos de Navegador na Internet
        iphone_4.exibePagina("www.google.com");
        iphone_4.adicionaNovaAba();
        iphone_4.atualizaPagina();

    }

    //Comportamentos de Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Iphone tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone pausou música");
    }

    @Override
    public void selecionaMusica(String musica) {
        System.out.println("Iphone tocando " + musica);
    }

    //Comportamentos de Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Iphone ligando " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Iphone atende.");
    }

    @Override
    public void iniciaCorreioVoz() {
        System.out.println("Iphone iniciou Correio de voz");
    }

    //Comportamentos de Navagador na Internet
    @Override
    public void exibePagina(String url) {
        System.out.println("Iphone exibindo pagina url: " + url);
    }

    @Override
    public void adicionaNovaAba() {
        System.out.println("Iphone adicionando nova aba");
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Iphone atualizando página");
    }
}
