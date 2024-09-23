
package programas_ejercicios_utp;

import java.util.Scanner;

public class Semana6_while3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos: Solicitar al usuario los valores inicial y límite
        System.out.print("Ingrese el número inicial: ");
        int numero = lectura.nextInt();  // Leer el número inicial ingresado por el usuario

        System.out.print("Ingrese el número límite: ");
        int limite = lectura.nextInt();  // Leer el número límite ingresado por el usuario

        // Si el número inicial es impar, incrementar en 1 para empezar desde el siguiente número par
        if (numero % 2 != 0) {
            numero++;
        }

        // Proceso: Mostrar números pares desde el número inicial hasta el número límite
        while (numero <= limite) {
            System.out.println(numero);  // Mostrar el número par actual
            numero += 2;  // Incrementar en 2 para obtener el siguiente número par
        }
    }
}
