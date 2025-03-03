package modelos;

public class Audio {
    private String titulo;
    private int numeroCurtidas;
    private int visualizacoes = 0;

    private double classificacao;

    public String getTitulo() {
        return titulo;
   }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curtir() {
        this.numeroCurtidas++;
    }
    public void reproduz() {
        this.visualizacoes++;
    }
}
