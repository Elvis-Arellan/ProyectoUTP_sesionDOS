package programas_ejercicios_utp;
import java.util.Scanner;
public class Semana7_doWhile1 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;
        String continuar;

        do {
            System.out.println("Ingrese un numero entero para sumar:");
            numero = scanner.nextInt();
            suma += numero;

            System.out.println("¿Desea ingresar otro número? (si/no)");
            continuar = scanner.next().toLowerCase();
        } while (continuar.equals("si"));

        System.out.println("La suma total de los números ingresados es: " + suma);
        
    }
}
