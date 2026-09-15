public class Main {

    public static void main(String[] args) {

        Guerreiro joiu = new Guerreiro("Joiu", 150, 60, "Espada");
        Ocultista dante = new Ocultista("Dante", 70, 40, "Decadência");

        Personagem[] personagens = {
                joiu,
                dante
        };

        for (Personagem personagem : personagens) {
            personagem.atacar();
        }

        System.out.println("Vida antes: " + joiu.getVida());

        joiu.setVida(200);
        System.out.println("Nova vida: " + joiu.getVida());

        System.out.println("Vida depois: " + joiu.getVida());

        System.out.println(joiu.getNome());
        System.out.println(joiu.getVida());
        System.out.println(joiu.getNivel());
    }
}