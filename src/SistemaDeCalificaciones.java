import java.util.Scanner;
public class SistemaDeCalificaciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu primera calificacion: ");
        double Calificacion1 = scanner.nextDouble();
        System.out.println("Introduce tu segunda calificacion: ");
        double Calificacion2 = scanner.nextDouble();
        System.out.println("Introduce tu tercera calificacion: ");
        double Calificacion3 = scanner.nextDouble();
        final int MINIMO_APROBATORIO = 70;
        final int MINIMO_UNIDAD = 60;
        double promedio = (Calificacion1 + Calificacion2 + Calificacion3) / 3;

        if (promedio < MINIMO_APROBATORIO){
            System.out.println("Alumno reprobado");
        }
        else if (Calificacion1 < MINIMO_UNIDAD) {
            System.out.println("Alumno aprobado. ");
            System.out.println("Sin embargo, el alumno debe presentar recuperacion de la primera unidad");
        }
        else if (Calificacion2 < MINIMO_UNIDAD) {
            System.out.println("Alumno aprobado. ");
            System.out.println("Sin embargo, el alumno debe presentar recuperacion de la segunda unidad");
        }
        else if (Calificacion3 < MINIMO_UNIDAD) {
            System.out.println("Alumno aprobado. ");
            System.out.println("Sin embargo, el alumno debe presentar recuperacion de la tercera unidad");
        }
        else {
            System.out.println("Alumno aprobado");
        }
    }
}
