package EjerciciosComplementariosLevel1;

/* EJERCICIO 4:
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías..
*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        entrada.close();

         int numero = entrada.nextInt();
         int factorial = 1;
        for (int i = 1; i <= numero; ++i){
            factorial *=i;
        }
        System.out.println(factorial);
    }
}