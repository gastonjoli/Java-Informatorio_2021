package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumnos> alumnos = List.of(
                new Alumnos("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumnos("Moe", "Szyslak", LocalDate.of(1956, 5, 12)),
                new Alumnos("Bob", "Patiño", LocalDate.of(1974, 2, 10)),
                new Alumnos("Alcalde", "Diamante", LocalDate.of(2001, 3, 30)),
                new Alumnos("Marge", "Bouvier", LocalDate.of(1984, 2, 5)),
                new Alumnos("Ned", "Flanders", LocalDate.of(1975, 7, 21)),
                new Alumnos("Selma", "Bouvier", LocalDate.of(1981, 11, 11)));
        Map<String, Integer> alumnosAndEdades = alumnos.stream()
                .collect(Collectors
                        .toMap(p-> (p.getName() + " " + p.getSurname()),
                                p -> Ejercicio5.getEdad(p.getBirthday())));
        System.out.println(alumnosAndEdades);
    }

    public static Integer getEdad(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}