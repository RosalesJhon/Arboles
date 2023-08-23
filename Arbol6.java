import java.util.Scanner;

public class Arbol6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿El animal tiene pelo? (S/N)");
        String tienePelo = scanner.nextLine().toUpperCase();
        
        if (tienePelo.equals("S")) {
            System.out.println("¿El animal da a luz a crías vivas? (S/N)");
            String daALuz = scanner.nextLine().toUpperCase();
            
            if (daALuz.equals("S")) {
                System.out.println("El animal es un mamífero.");
            } else {
                System.out.println("El animal no es un mamífero.");
            }
        } else {
            System.out.println("El animal no es un mamífero.");
        }
        
        scanner.close();
    }
}
