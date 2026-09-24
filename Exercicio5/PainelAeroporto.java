public class PainelAeroporto {

    private int passageiros = 0;
    private int bagagens = 0;

    private final Object travaPassageiros = new Object();
    private final Object travaBagagens = new Object();

    public void registrarCheckIn(String atendente) {

        synchronized (travaPassageiros) {
            passageiros++;

            System.out.println(atendente
                    + " registrou check-in. Passageiros: "
                    + passageiros);

            System.out.flush();
        }
    }

    public void registrarBagagem(String esteira) {

        synchronized (travaBagagens) {
            bagagens++;

            System.out.println(esteira
                    + " registrou bagagem. Bagagens: "
                    + bagagens);

            System.out.flush();
        }
    }
}
