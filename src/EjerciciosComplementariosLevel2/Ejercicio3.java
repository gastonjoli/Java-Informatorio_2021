package EjerciciosComplementariosLevel2;
/* EJERCICIO 3:
Crear una lista que contenga como elementos la numeración
de cartas de una baraja francesa (solo los valores, no figuras).
Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

Ayuda: ArrayList implementa la interface Collection, existe
algún método que me permita hacer la operación sort (mezclar) aleatoriamente?
Idem para el reverso.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Ejercicio3 {
    public static void main(String[] args) {

        List<String> cartas = new ArrayList<>();

        cartas.add("1");
        cartas.add("2");
        cartas.add("3");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("10");
        cartas.add("11");
        cartas.add("12");
        cartas.add("13");

        System.out.println("♦♦♤♤♣♣♢♥♥♥♥♢♣♣♤♤♦♦");
        System.out.println("Mazo inicial");
        System.out.println("♦♦♤♤♣♣♢♥♥♥♥♢♣♣♤♤♦♦");

        for (var carta : cartas) {
            System.out.println("carta - " + carta);
        }
        System.out.println("♦♦♤♤♣♣♢♥♥♥♥♢♣♣♤♤♦♦");
        System.out.println("Mazo de Fin a Inicio ");
        System.out.println("♦♦♤♤♣♣♢♥♥♥♥♢♣♣♤♤♦♦");

        for (int i = cartas.size() -1; i >= 0; --i){
            System.out.println("carta - " + cartas.get(i));
        }

        System.out.println("♦♦♤♤♣♣♢♥♥♥♥♢♣♣♤♤♦♦");
        System.out.println("Mazo Mezclado ");
        System.out.println("♦♦♤♤♣♣♢♥♥♥♥♢♣♣♤♤♦♦");

        Collections.shuffle(cartas);

        for (var carta : cartas) {

            System.out.println("carta - " + carta);

        }

    }

}