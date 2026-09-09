public class Main {

    public static void main(String[] args) {

        Guerreiro joui = new Guerreiro("Joiu", 120, 60, "Espada");
        Ocultista dante = new Ocultista("Dante", 70, 40, "Decadência");

        joui.atacar();
        dante.atacar();
    }
}