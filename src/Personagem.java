public class Personagem {

    private String nome;
    private int vida;
    private int nivel;

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void atacar() {
        System.out.println("O personagem está atacando!");
    }
}