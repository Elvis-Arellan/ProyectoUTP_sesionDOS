package programas_ejercicios_utp;
import java.util.Scanner;
public class SEMANA4_SWITCH2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        char calificacion;

        // Entrada de datos
        System.out.print("Ingrese la calificación (A, B, C, D, F): ");
        calificacion = lectura.next().charAt(0);

        // Proceso: Determinar el desempeño según la calificación
        switch (calificacion) {
            case 'A':
            case 'a':
                System.out.println("Excelente");
                break;
            case 'B':
            case 'b':
                System.out.println("Muy Bueno");
                break;
            case 'C':
            case 'c':
                System.out.println("Bueno");
                break;
            case 'D':
            case 'd':
                System.out.println("Suficiente");
                break;
            case 'F':
            case 'f':
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Calificación no válidaaa.");
                break;
        }
    }
}
