import java.util.Scanner;

public class Arbol5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la calificación del examen (0-100):");
        int calificacionExamen = sc.nextInt();
        
        System.out.println("Ingrese la calificación de las tareas (0-100):");
        int calificacionTareas = sc.nextInt();
        
        // Definir el árbol de decisiones
        if (calificacionExamen >= 70 && calificacionTareas >= 70) {
            System.out.println("El estudiante aprueba el curso.");
        } else if (calificacionExamen < 70 && calificacionTareas < 70) {
            System.out.println("El estudiante reprueba el curso.");
        } else {
            System.out.println("El estudiante debe tomar un examen de recuperación.");
        }
        
        sc.close();
    }
}
