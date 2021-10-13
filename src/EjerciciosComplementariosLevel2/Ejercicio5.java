package EjerciciosComplementariosLevel2;

/* EJERCICIO 5:
Dados 2 ArrayList que contienen horas-trabajadas (array1)
y valor-por-hora(array2) del resumen de carga de horas semanal
de un empleado. Se debe generar otra lista que contenga los totales
y luego imprimir el total final a cobrar.

Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

## Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.

Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915

 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {

            Integer[] horasTrabajadas = {6,7,8,4,5};    //Array 1
            Integer[] valorxHora = {350,345,550,600,320};   //Array 2
            List<Integer> dias = new ArrayList<>(); 

            int total = 0;

            for (int i = 0; i < valorxHora.length; i++) {

                int precioDia = valorxHora[i] * horasTrabajadas[i];
                dias.add(precioDia);
                total = total + precioDia;
            }
            System.out.println(dias);
            System.out.println("Total final: $ "+total);
        }
}
        
    