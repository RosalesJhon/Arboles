import java.util.Scanner;

public class Arbol3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuál es tu edad?");
        int edad = scanner.nextInt();

        System.out.println("Cuántos años de experiencia laboral tienes?");
        int experiencia = scanner.nextInt();

        if (edad >= 18) {
            if (experiencia >= 3) {
                System.out.println("Eres apto para el empleo senior.");
            } else if (experiencia >= 1) {
                System.out.println("Eres apto para el empleo junior.");
            } else {
                System.out.println("No tienes suficiente experiencia para el empleo.");
            }
        } else {
            System.out.println("Eres menor de edad y no puedes ser considerado para el empleo.");
        }

        scanner.close();
    }
}
