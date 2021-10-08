package Lvl2;

/* EJERCICIO 7:
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
nos devuelva un array de Strings. Con la secuencia de números enteros de principio
a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo
de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y
 el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println(numMulti());

    }

    private static List<String> numMulti() {

        List<String> listaNum = new ArrayList<>();

        for (int i = 1; i < 8; ++i) {

            String l = String.valueOf(i);

            if (i%2 == 0 && i%3 == 0 ) {

                l = "FizzBazz";

            }

            else if (i%2 == 0) {

                l = "Fizz";
            }

            else if ( i%3 == 0) {

                l = "Buzz";
            }

            listaNum.add(l);

        }

        return listaNum;

    }


}

