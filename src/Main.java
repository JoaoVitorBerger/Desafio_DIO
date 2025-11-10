import IphoneXVII.Iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("João Vitor Berger");
        System.out.println(iphone.getDono());
        iphone.tocarMusica(iphone);
        iphone.pausarMusica(iphone);
        iphone.adicionarNovaAba(iphone);
        iphone.exibirPagina(iphone);
        iphone.iniciarCorreioVoz(iphone);

    }
}