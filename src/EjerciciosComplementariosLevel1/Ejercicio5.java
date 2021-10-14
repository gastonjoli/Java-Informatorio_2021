package EjerciciosComplementariosLevel1;
/* EJERCICIO 5:
Se desea una aplicación que solicite 2 números
enteros y realice la operación de multiplicación
por sumas sucesivas (sin uso de librerías)..
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int num1, num2, resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
         num1 = entrada.nextInt();

        System.out.println("Ingrese otro número entero: ");
         num2 = entrada.nextInt();
        entrada.close();

         resultado = 0;

        for ( int i= 0; i < num1; ++i){
            resultado += num2;
        }
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }
}