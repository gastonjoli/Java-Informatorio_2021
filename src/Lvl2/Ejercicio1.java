package Lvl2;

/* EJERCICIO 1:
Crear un ArrayList y cargarlo con tus ciudades
favoritas de Argentina, luego imprimir por pantalla el ranking
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        List<String> ciudades = new ArrayList<>();

        listaFavoritas(ciudades);

        int cont = 0;

        for (String fav : ciudades) {

            System.out.println("#"+ (cont += 1) + " - " +fav);

        }

    }

    public static void listaFavoritas(List<String>  ciudades) {

        ciudades.add("Salta");
        ciudades.add("Carlos Paz");
        ciudades.add("Resistencia");
    }
}