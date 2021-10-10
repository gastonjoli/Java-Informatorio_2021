package EjerciciosComplementariosLevel2;
/* EJERCICIO 2:
Crear un ArrayList, agregar 5 números enteros.
Luego, agregar un número entero al principio de la
lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de
agregar a en la primera y última posición)..
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> numeros = new ArrayList<>();


        numeros.add("0");
        numeros.add("25");
        numeros.add("50");
        numeros.add("75");
        numeros.add("100");

        System.out.println(" El tamaño inicial de la lista es:  " + numeros.size());

        for (String numero : numeros) {

            System.out.println(numero);

        }

        numeros.add(0,"-5");
        numeros.add(6,"125");


        System.out.println(" El tamaño final de  la lista es: " + numeros.size());

        for (int i = 0; i < numeros.size(); ++i) {

            System.out.println(numeros.get(i));

        }

    }


}