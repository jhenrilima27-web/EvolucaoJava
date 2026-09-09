public class Main {

    public static void main(String[] args) {

        Personagem joiu = new Personagem("Joiu", 120, 55);

        System.out.println(joiu.nome);
        System.out.println(joiu.vida);
        System.out.println(joiu.nivel);

        joiu.atacar();
    }
}