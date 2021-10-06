package Lvl1;

import java.util.Scanner;

/* EJERCICIO 2:
Realizar un programa que solicite por consola 2 números enteros.
 Para luego imprimir el resultado de la suma, resta, multiplicación,
  división y módulo (resto de la división) de ambos números.
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un numero entero: ");
         num1 = entrada.nextInt();
        System.out.println("Ingrese otro numero entero: ");
         num2 = entrada.nextInt();


        System.out.println("La Suma = " + (num1+num2));
        System.out.println("La Resta = " + (num1-num2));
        System.out.println("La Multiplicacion = " + (num1*num2));
        System.out.println("La Division = "+ (num1/num2));
        System.out.println("El Módulo = "+ (num1%num2));

    }
}