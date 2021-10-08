package Lvl1;

/*  EJERCICIO 1:
Solicitar por consola el nombre del usuario e imprimir
por pantalla el siguiente mensaje “HOLA {USUARIO}.!!!”

 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;

        System.out.println( "Ingrese su nombre: ");

        nombre  = entrada.nextLine();

        System.out.println("Hola "+nombre);

    }

}