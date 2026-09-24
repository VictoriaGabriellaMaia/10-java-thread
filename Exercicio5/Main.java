public class Main {

    public static void main(String[] args) {

        PainelAeroporto painel = new PainelAeroporto();

        Thread atendimento = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                painel.registrarCheckIn("Atendente " + i);
            }
        });

        Thread logistica = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                painel.registrarBagagem("Esteira " + i);
            }
        });

        atendimento.start();
        logistica.start();
    }
}
