public class PerfilUsuario {

    private String biografia;
    private String status;

    public void atualizarPerfil(String novaBio, String novoStatus, String dispositivo) {

        System.out.println(dispositivo + " realizando validação do texto...");
        System.out.flush();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            biografia = novaBio;
            status = novoStatus;

            System.out.println(dispositivo + " atualizou o perfil.");
            System.out.println("Biografia: " + biografia);
            System.out.println("Status: " + status);
            System.out.flush();
        }
    }
}
