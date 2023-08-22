import java.util.Random;

public class Arbol2 {
    public static void main(String[] args) {
        double Soleado = 0.7;
        double Disponibles = 0.8;
        double Disponible = 0.9;

        Random rand = new Random();
        boolean clima = rand.nextDouble() <= Soleado;
        boolean jugadores = rand.nextDouble() <= Disponibles;
        boolean campo = rand.nextDouble() <= Disponible;

        if (clima) {
            if (jugadores) {
                if (campo) {
                    System.out.println("Jugar al fútbol (Probabilidad de ganar: alta)");
                } else {
                    System.out.println("No jugar al fútbol (Campo no disponible, Probabilidad de ganar: baja)");
                }
            } else {
                System.out.println("No jugar al fútbol (Insuficientes jugadores, Probabilidad de ganar: baja)");
            }
        } else {
            System.out.println("No jugar al fútbol (Clima no soleado, Probabilidad de ganar: baja)");
        }
    }
}
