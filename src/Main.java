public class Main {

    public static void main(String[] args) {

        Guerreiro joui = new Guerreiro("Joiu", 120, 60, "Espada");
        Ocultista dante = new Ocultista("Dante", 70, 40, "Decadência");

        System.out.println(joui.nome);
        System.out.println(joui.vida);
        System.out.println(joui.nivel);
        System.out.println(joui.arma);

        joui.atacar();
        dante.atacar();
    }
}