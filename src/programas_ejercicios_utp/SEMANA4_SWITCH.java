package programas_ejercicios_utp;

import java.util.Scanner;

public class SEMANA4_SWITCH {
    public static void main(String[] args){
       int dia;
       Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresar un número (1-7) para seleccionar el día de la semana: ");
        dia = lectura.nextInt();
        // Proceso: Mostrar el día de la semana según el número ingresado
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido. Por favor ingrese un número entre 1 y 7.");
                break;
        }
    }
}
