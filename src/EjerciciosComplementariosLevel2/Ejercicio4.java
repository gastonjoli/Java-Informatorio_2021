package EjerciciosComplementariosLevel2;

/* Ejercicio 4:
Cargar un arrayList con 12 nombres de
estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos..
 */
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<>();

        alumnos.add("Gaston");
        alumnos.add("Fabian");
        alumnos.add("Noelia");
        alumnos.add("Sandra");
        alumnos.add("Amelie");
        alumnos.add("Bautista");
        alumnos.add("Elian");
        alumnos.add("Pedro");
        alumnos.add("Ivan");
        alumnos.add("Florencia");
        alumnos.add("Jesus");
        alumnos.add("Franco");

        List<String> lista1 = alumnos.subList(0, 4);

        List<String> lista2 = alumnos.subList(4, 8);

        List<String> lista3 = alumnos.subList(8, 12);

        System.out.println("________________________________");
        System.out.println("Alumnos del Curso  1");
        System.out.println("________________________________");

        for (var l1 : lista1) {
            System.out.println(l1);
        }
        System.out.println("________________________________");
        System.out.println("Alumnos del Curso 2");
        System.out.println("________________________________");

        for (var l2 : lista2) {
            System.out.println(l2);
        }
        System.out.println("________________________________");
        System.out.println("Alumnos del Curso 3");
        System.out.println("________________________________");

        for (var l3 : lista3) {
            System.out.println(l3);
        }
    }
}