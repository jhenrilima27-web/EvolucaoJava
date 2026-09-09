public class Ocultista extends Personagem {

    String ritual;

    public Ocultista(String nome, int vida, int nivel, String ritual) {
        super(nome, vida, nivel);
        this.ritual = ritual;
    }
}