package programas_ejercicios_utp;

import java.util.Scanner;
import java.lang.Math;

public class Programa01 {
    public static void main(String[] args){
        // declarar variables
        double grados, radianes;
        // crear objeto Scanner
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar el ángulo en grados: ");
        grados = lectura.nextDouble();
        // proceso de datos
        radianes = Math.toRadians(grados);
        // salida de resultados
        System.out.println("El ángulo en radianess ess: " + radianes);
    }
}
