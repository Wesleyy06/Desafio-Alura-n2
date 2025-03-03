import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Como tudo deve ser");
        minhaMusica.setBanda("Charlie Brown Jr");
        minhaMusica.setGenero("Pop rock");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow podcast");
        meuPodcast.setApresentador("igor");
        meuPodcast.setDescricaoEpisodio("Este episodio traz a conversa de como o clima é\n" +
                "afetado diretamente por meio de do impacto ambiental causado pelo ser humano.");

        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 80; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}