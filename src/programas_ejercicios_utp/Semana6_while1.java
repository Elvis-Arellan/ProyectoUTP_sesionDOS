package programas_ejercicios_utp;
import java.util.Scanner;
public class Semana6_while1 {
   public static void main(String[] args) {
        int numero;  // Declaración de la variable que almacenará el número ingresado

        // Entrada de datos: Solicitar al usuario que ingrese un número
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número para comenzar: ");
        numero = lectura.nextInt();  // Leer el número ingresado por el usuario

        // Proceso: Mostrar los números desde el número ingresado hasta 10
        while (numero <= 10) {
            System.out.println(numero);  // Mostrar el número actual
            numero++;  // Incrementar el número en 1
        }
    }
}

