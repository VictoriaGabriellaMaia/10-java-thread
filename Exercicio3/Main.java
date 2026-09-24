public class Main {

    public static void main(String[] args) {

        CaixaRegistradora caixa = new CaixaRegistradora();

        Thread operador1 = new Thread(() -> {
            caixa.registrarVenda(50.0, "Operador 1");
            caixa.realizarSangria(20.0, "Operador 1");
        });

        Thread operador2 = new Thread(() -> {
            caixa.registrarVenda(100.0, "Operador 2");
            caixa.realizarSangria(30.0, "Operador 2");
        });

        Thread operador3 = new Thread(() -> {
            caixa.registrarVenda(75.0, "Operador 3");
            caixa.realizarSangria(25.0, "Operador 3");
        });

        operador1.start();
        operador2.start();
        operador3.start();
    }
}
