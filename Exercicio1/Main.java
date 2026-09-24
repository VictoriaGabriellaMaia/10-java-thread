public class Main {

    public static void main(String[] args) {

        Bilheteria bilheteria = new Bilheteria();

        for (int i = 1; i <= 12; i++) {
            String nomeCliente = "Cliente " + i;

            Thread cliente = new Thread(() -> {
                bilheteria.comprarIngresso(nomeCliente);
            });

            cliente.start();
        }
    }
}
