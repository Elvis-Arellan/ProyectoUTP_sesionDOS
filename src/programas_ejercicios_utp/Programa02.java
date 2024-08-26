package programas_ejercicios_utp;

import java.util.Scanner;
import java.lang.Math;

public class Programa02 {
    public static void main(String[] args){
        // declarar variables
        double base, exponente, resultado;
        // crear objeto Scanner
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar la base: ");
        base = lectura.nextDouble();
        System.out.print("Ingresar el exponente: ");
        exponente = lectura.nextDouble();
        // proceso de datos
        resultado = Math.pow(base, exponente);
        // salida de resultados
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
    }
}
