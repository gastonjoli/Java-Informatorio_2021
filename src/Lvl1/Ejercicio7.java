package Lvl1;

import java.util.Scanner;

/* EJERCICIO 7:
Realizar un programa que dado un String de entrada
en minúsculas lo convierta por completo a mayúsculas.
Sin uso de métodos o librerías que realicen toUppercase()..
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba una palabara en minuscula: ");

        String palabra = scan.nextLine();


        String MAY = "QWERTYUIOPASDFGHJKLÑZXCVBNM";

        String min = "qwertyuiopasdfghjklñzxcvbnm";

        for (int i = 0; i < palabra.length(); ++i) {

            for (int a = 0; a < min.length(); ++a) {

                if (palabra.charAt(i) == min.charAt(a)) {

                    System.out.print(MAY.charAt(a));

                }

            }


        }
    }
}











