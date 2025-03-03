package modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " Esta entre as mais curtidas");
        }
        else{
            System.out.println(audio.getTitulo()+ " É uma que os usuarios estão curtindo");
        }
    }
}
