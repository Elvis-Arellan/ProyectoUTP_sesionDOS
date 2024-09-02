package programas_ejercicios_utp;

import java.util.Scanner;
public class Condicionales_tarea_ejercicio2 {
    public static void main(String[] args){
        // declarar variables
        int numero;
        String mensaje="";
        // crear objeto Scanner
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar un número: ");
        numero = lectura.nextInt();
        // estructura condicional doble
        if(numero % 2 == 0){
            mensaje="El número es par.";
        } else {
            mensaje="El número es impar.";
        }
        
        System.out.println(mensaje);
    }
}
