public class Main {

    public static void main(String[] args) {

        Personagem joiu = new Personagem("Joiu", 120, 55);
        Guerreiro arthur = new Guerreiro("Guerreiro", 150, 60);

        System.out.println(arthur.nome);
        System.out.println(arthur.vida);
        System.out.println(arthur.nivel);

    }
}