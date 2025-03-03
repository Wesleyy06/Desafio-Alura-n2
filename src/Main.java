import modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Como tudo deve ser");
        minhaMusica.setBanda("Charlie Brown Jr");
        minhaMusica.setGenero("Pop rock");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 40; i++) {
            minhaMusica.curtir();
        }

    }
}