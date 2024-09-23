package programas_ejercicios_utp;
import java.util.Scanner;
public class SEMANA4_SWITCH3 {
    public static void main(String[] args){
     Scanner lectura = new Scanner(System.in);
        int calificacion;

        // Entrada de datos
        System.out.print("Ingresar la calificación (0-10): ");
        calificacion = lectura.nextInt();

        // Proceso: Convertir calificación numérica a letra
        switch (calificacion) {
            case 10:
            case 9:
                System.out.println("AD");
                break;
            case 8:
                System.out.println("AD");
                break;
            case 7:
                System.out.println("A");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("C");
                break;
            default:
                System.out.println("Calificación no válidaa. Ingrese un número entre 0 y 10.");
                break;
        }
    }
}
