public class Arbol1 {
    public static void main(String[] args) {
        boolean estaLloviendo = true;
        int temperatura = 20; // Temperatura en grados Celsius

        if (estaLloviendo) {
            if (temperatura < 15) {
                System.out.println("Lleva un paraguas y un abrigo.");
            } else {
                System.out.println("Lleva un paraguas.");
            }
        } else {
            System.out.println("No necesitas llevar un paraguas.");
        }
    }
}
