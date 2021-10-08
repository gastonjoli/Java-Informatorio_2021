package Lvl2;

/* EJERCICIO 5:
Dados 2 ArrayList que contienen horas-trabajadas (array1)
y valor-por-hora(array2) del resumen de carga de horas semanal
de un empleado. Se debe generar otra lista que contenga los totales
y luego imprimir el total final a cobrar.

 */
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> HorasHombre = new ArrayList<>();
        List<Integer> total = new ArrayList<>();

        // Array 1

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        // Array 2

        HorasHombre.add(350);
        HorasHombre.add(345);
        HorasHombre.add(550);
        HorasHombre.add(600);
        HorasHombre.add(320);


        for (int i = 0 ;  i < horasTrabajadas.size() ; ++i){

            int t = horasTrabajadas.get(i) * HorasHombre.get(i);

            total.add(t);

        }
        // imprime el total

        int totalA = 0;

        for (Integer t : total) {

            totalA += t;
        }
        System.out.println(total);
        System.out.println("Total Final: $ " + totalA);

    }

}