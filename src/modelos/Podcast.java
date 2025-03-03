package modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricaoEpisodio;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricaoEpisodio() {
        return descricaoEpisodio;
    }

    public void setDescricaoEpisodio(String descricaoEpisodio) {
        this.descricaoEpisodio = descricaoEpisodio;
    }
}
