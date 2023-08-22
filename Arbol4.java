import java.util.Scanner;

public class Arbol4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el color de la fruta (rojo, amarillo o verde): ");
        String color = scanner.nextLine();
        
        System.out.println("Ingrese la forma de la fruta (redonda o alargada): ");
        String forma = scanner.nextLine();
        
        String decision = (color.equals("rojo") && forma.equals("redonda")) ? "Manzana" :
                         (color.equals("rojo") && forma.equals("alargada")) ? "Fresa" :
                         (color.equals("amarillo") && forma.equals("redonda")) ? "Plátano" :
                         (color.equals("amarillo") && forma.equals("alargada")) ? "Pera" :
                         (color.equals("verde") && forma.equals("redonda")) ? "Sandía" :
                         (color.equals("verde") && forma.equals("alargada")) ? "Pepino" :
                         "No se puede clasificar";
        
        System.out.println("La fruta es: " + decision);
        
        scanner.close();
    }
}
