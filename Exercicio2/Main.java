public class Main {

    public static void main(String[] args) {

        PerfilUsuario perfil = new PerfilUsuario();

        Thread dispositivoMovel = new Thread(() -> {
            perfil.atualizarPerfil(
                    "Estudante de Sistemas de Informação",
                    "Disponível",
                    "Dispositivo Móvel"
            );
        });

        Thread computador = new Thread(() -> {
            perfil.atualizarPerfil(
                    "Estudante de tecnologia",
                    "Ocupada",
                    "Computador"
            );
        });

        dispositivoMovel.start();
        computador.start();
    }
}
