public class GerenciadorDownloads {

    private int downloadsConcluidos = 0;
    private int downloadsFalhados = 0;

    private final Object travaSucesso = new Object();
    private final Object travaFalha = new Object();

    public void incrementarSucesso(String nomeArquivo) {

        synchronized (travaSucesso) {
            downloadsConcluidos++;

            System.out.println("[Sucesso] "
                    + nomeArquivo
                    + " concluído. Total: "
                    + downloadsConcluidos);
            System.out.flush();
        }
    }

    public void incrementarFalha(String nomeArquivo) {

        synchronized (travaFalha) {
            downloadsFalhados++;

            System.out.println("[Falha] "
                    + nomeArquivo
                    + " falhou. Total: "
                    + downloadsFalhados);
            System.out.flush();
        }
    }
}
