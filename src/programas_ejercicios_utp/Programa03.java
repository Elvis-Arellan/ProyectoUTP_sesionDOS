package programas_ejercicios_utp;

import java.util.Scanner;
import java.lang.Math;

public class Programa03 {
    public static void main(String[] args){
        // declarar variables
        double cateto1, cateto2, hipotenusa;
        // crear objeto Scanner
        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Ingresar el valor del primer cateto: ");
        cateto1 = lectura.nextDouble();
        System.out.print("Ingresar el valor del segundo cateto: ");
        cateto2 = lectura.nextDouble();
        // proceso de datos
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        // salida de resultados
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
