public class CaixaRegistradora {

    private double saldoCaixa = 100.0;

    private final Object travaSaldo = new Object();

    public void registrarVenda(double valor, String operador) {

        synchronized (travaSaldo) {
            saldoCaixa += valor;

            System.out.println(operador
                    + " registrou uma venda de R$ "
                    + valor
                    + ". Saldo atual: R$ "
                    + saldoCaixa);
            System.out.flush();
        }
    }

    public void realizarSangria(double valor, String operador) {

        synchronized (travaSaldo) {
            saldoCaixa -= valor;

            System.out.println(operador
                    + " realizou uma sangria de R$ "
                    + valor
                    + ". Saldo atual: R$ "
                    + saldoCaixa);
            System.out.flush();
        }
    }
}
