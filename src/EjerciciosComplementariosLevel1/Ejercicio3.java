package EjerciciosComplementariosLevel1;

/* EJERCICIO 3:
Confeccionar un programa que dado un número entero
como dato de entrada imprima la secuencia de números
(incrementos de 1).
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero entero: ");
        num = entrada.nextInt();
        entrada.close();

        for (int i = 1 ; i <=num; ++i){
            for ( int n = 1; n <= i; ++n) {
                System.out.print(n);
            }
            System.out.println(" ");
        }


    }

}