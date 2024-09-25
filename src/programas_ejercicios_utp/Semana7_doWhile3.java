package programas_ejercicios_utp;
import java.util.Scanner;
public class Semana7_doWhile3 {
    public static void main(String[] args){
    String nombre, opc, chancon="";
        int countAlum=0, sn=0;
        int nota1, nota2, nota3;
        double prom, mayorProm=0;
        Scanner lectura=new Scanner(System.in);
        do{
            System.out.println("Ingrese su nombre");
            nombre =lectura.next();
            System.out.println("Ingrese nota 1 (0-20)");
            nota1 =lectura.nextInt(); 
            if(nota1<=20){
                System.out.println("Ingrese nota 2 (0-20)");
                nota2 =lectura.nextInt();
                System.out.println("Ingrese nota 3 (0-20)");
                nota3 =lectura.nextInt();
                
            } else{
                System.out.println("EROR!!! Ingrese una nota del (0-20)");
                break;
            }
            sn=nota1+nota2+nota3;
            countAlum++;
            prom=sn/3;
            if(prom>mayorProm){
                mayorProm=prom;
                chancon=nombre;
            }
            System.out.println("Promedio actual: "+prom);
            System.out.println("Desea continuar SI/NO");
            opc =lectura.next();
        }while(opc.equals("si"));
        System.out.println("cantidad de Alumos: "+countAlum);
        System.out.println("Mejor promedio: "+chancon);
        System.out.println("promedio: "+mayorProm);

    }
}
