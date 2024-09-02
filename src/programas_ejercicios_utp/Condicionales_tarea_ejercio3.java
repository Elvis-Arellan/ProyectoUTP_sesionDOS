package programas_ejercicios_utp;

import java.util.Scanner;

public class Condicionales_tarea_ejercio3 {
     public static void main(String[] args){
        // declarar variables
        int nota;
        String mensaje="";
        // crear objeto Scanner
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar la nota del estudiante (0-10): ");
        nota = lectura.nextInt();
        // estructura condicional múltiple
        if(nota >= 9 && nota <= 10){
            mensaje="Calificación: Sobresaliente";
        } else if(nota >= 7 && nota < 9){
            mensaje="Calificación: Notable";
        } else if(nota >= 5 && nota < 7){
            mensaje="Calificación: Aprobado";
        } else if(nota >= 0 && nota < 5){
            mensaje="Calificación: Insuficiente";
        } else {
            System.out.println("Nota no válida");
        }
        System.out.println(mensaje);
     }
}
