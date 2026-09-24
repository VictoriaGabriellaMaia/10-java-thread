public class Main {

    public static void main(String[] args) {

        GerenciadorDownloads gerenciador = new GerenciadorDownloads();

        Thread threadSucesso = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                gerenciador.incrementarSucesso("Arquivo_Sucesso_" + i);
            }
        });

        Thread threadFalha = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                gerenciador.incrementarFalha("Arquivo_Falha_" + i);
            }
        });

        threadSucesso.start();
        threadFalha.start();
    }
}
