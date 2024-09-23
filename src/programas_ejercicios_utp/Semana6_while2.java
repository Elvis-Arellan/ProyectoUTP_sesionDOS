package programas_ejercicios_utp;
import java.util.Scanner;
public class Semana6_while2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;  // Variable para almacenar el número ingresado por el usuario
        int suma = 0;  // Variable para acumular la suma de los números

        // Entrada de datos: Solicitar al usuario que ingrese números
        System.out.println("Ingrese números para sumar. Ingrese un número negativo para terminar:");

        // Proceso: Sumar números hasta que se ingrese un número negativo
        while (true) {
            numero = scanner.nextInt();  // Leer número ingresado por el usuario
            if (numero < 0) {  // Si el número es negativo, salir del ciclo
                break;
            }
            suma += numero;  // Sumar el número ingresado a la suma total
        }

        // Salida: Mostrar el resultado de la suma
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
