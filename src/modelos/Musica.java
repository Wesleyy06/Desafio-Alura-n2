package modelos;

public class Musica extends Audio{
    private String banda;
    private String genero;
    private String albun;

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    @Override
    public double getClassificacao() {
        if(this.getNumeroCurtidas() >= 1000) {
            return 10;
        }
        else if(this.getNumeroCurtidas() >= 500) {
            return 5;
        }
        else {
            return 0;
        }
    }
}
