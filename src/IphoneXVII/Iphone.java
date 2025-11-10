package IphoneXVII;

public class Iphone implements Navegador, Telefone, PlayerMusica{
    private int id;
    private String dono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Iphone(String dono){
        setDono(dono);
    }

    @Override
    public void exibirPagina(Iphone celular) {
        System.out.println("Exibindo página para o celular com dono " + celular.getDono());
    }

    @Override
    public void adicionarNovaAba(Iphone celular) {
        System.out.println("Exibindo nova página para o celular com dono " + celular.getDono());
    }

    @Override
    public void tocarMusica(Iphone celular) {
        System.out.println("Tocando música para o celular com o dono " + celular.getDono());
    }

    @Override
    public void pausarMusica(Iphone celular) {
        System.out.println("Pausando música para o celular com o dono " + celular.getDono());
    }

    @Override
    public void selecionarMusica(Iphone celular) {
        System.out.println("Selecionando música para o celular com o dono " + celular.getDono());
    }

    @Override
    public void realizarLigacao(Iphone celular) {
        System.out.println("Realizando ligação do celular com o dono " + celular.getDono());
    }

    @Override
    public void atenderLigacao(Iphone celular) {
        System.out.println("Atendendo ligação do celular com o dono " + celular.getDono());
    }

    @Override
    public void iniciarCorreioVoz(Iphone celular) {
        System.out.println("Iniciar gravação do celular com o dono " + celular.getDono());
    }
}
