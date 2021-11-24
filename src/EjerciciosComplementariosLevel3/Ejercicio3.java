package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long counter = palabras.stream()
                .filter(p -> p.startsWith("B") || p.startsWith("b"))
                .count();
        System.out.println(counter);
    }}