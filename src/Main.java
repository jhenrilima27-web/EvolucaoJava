public class Main {

    public static void main(String[] args) {

        Guerreiro joiu = new Guerreiro("Joiu", 150, 60, "Espada");
        Ocultista dante = new Ocultista("Dante", 70, 40, "Decadência");

        dante.receberDano(20);

        System.out.println("Vida do Dante: " + dante.getVida());

    }
}