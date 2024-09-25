package programas_ejercicios_utp;
import java.util.Scanner;
public class Semana7_doWhile2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        String continuar;
          System.out.println("Contaremos positivos, negativos y ceros");
        do {
            System.out.println("Ingrese un número:");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }

            System.out.println("¿Desea ingresar otro número? (si/no)");
            continuar = scanner.next().toLowerCase();
        } while (continuar.equals("si"));

        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
