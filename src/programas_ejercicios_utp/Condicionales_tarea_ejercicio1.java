package programas_ejercicios_utp;

import java.util.Scanner;

public class Condicionales_tarea_ejercicio1 {
    public static void main(String[] str){
        // declarar variables
        int numero;
        String mensaje="";
        // crear objeto Scanner
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar un número: ");
        numero = lectura.nextInt();
        // estructura condicional simple
        if(numero > 0){
            mensaje="El número es positivo";
        }
        System.out.println(mensaje);
    }
}
