public class Bilheteria {

    private int ingressosDisponiveis = 10;

    public synchronized void comprarIngresso(String nomeCliente) {

        if (ingressosDisponiveis > 0) {
            ingressosDisponiveis--;

            System.out.println("[Sucesso] " + nomeCliente
                    + " comprou um ingresso. Restam: "
                    + ingressosDisponiveis);
        } else {
            System.out.println("[Esgotado] " + nomeCliente
                    + " não conseguiu comprar um ingresso.");
        }
    }
}
