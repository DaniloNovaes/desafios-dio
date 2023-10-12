import java.util.Objects;
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private String usuario;
    private String pin;


    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o seu " + this.getModelo());
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz...");
    }

    @Override
    public void exibirPagina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o site: ");
        String url = scanner.nextLine();
        System.out.println("Acessando " + url);

    }


    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando a música " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selecionarMusica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecionando uma música:\n Metallica - Sad but true\n Trivium - Down from the Sky");
        String musica = scanner.nextLine();
        scanner.close();
        tocar(musica);
    }

    public void ligarRegistrarAppleId(){
        System.out.println("Bem-vindo ao seu novo " + getModelo());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome de usuário: ");
        setUsuario(scanner.nextLine());
        System.out.println("Digite o seu pin (quatro números): ");
        setPin(scanner.nextLine());
        acessoIphone();
    }
    private void acessoIphone(){

        System.out.println("Bem-vindo ao seu " + getModelo() + ", " + getUsuario());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, confirme o seu Pin:");
        String confirmaPin = scanner.nextLine();
        if (Objects.equals(confirmaPin, getPin())){
            System.out.println("Senha correta! Acesso autorizado.");
            usandoMeuIphone();
        } else {
            System.out.println("Senha incorreta! Bloqueando o Iphone...");
        }
    }
    private void usandoMeuIphone() {
        System.out.println("\n========Menu Principal=========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nQual ferramenta deseja testar?\n Reprodutor Musical - Digite 1\n " +
                "Aparelho Telefônico - Digite 2\n Navegador de Internet - Digite 3");
        String opcaoUsuario = scanner.nextLine();
        if (Objects.equals(opcaoUsuario, "1")) {
            selecionarMusica();
            pausar();
        } else if (Objects.equals(opcaoUsuario, "2")) {
            ligar();
            atender();
            iniciarCorreioVoz();
        } else {
            exibirPagina();
            adicionarNovaAba();
            atualizarPagina();
        }
        scanner.close();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
