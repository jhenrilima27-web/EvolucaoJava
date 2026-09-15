public class Ocultista extends Personagem {

    private String ritual;

    public Ocultista(String nome, int vida, int nivel, String ritual) {
        super(nome, vida, nivel);
        this.ritual = ritual;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("O " + getNome() +" realiza o ritual " + ritual + " no " + alvo.getNome()+ "!");
    }
}