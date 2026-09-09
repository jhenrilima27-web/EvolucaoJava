public class Guerreiro extends Personagem {

    String arma;

    public Guerreiro(String nome, int vida, int nivel, String arma) {
        super(nome, vida, nivel);
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println("O " + nome +" ataca com " + arma + "!");
    }
}