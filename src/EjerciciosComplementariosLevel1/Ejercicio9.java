package EjerciciosComplementariosLevel1;
  /* EJERCICIO 9:
    Dado un String de entrada (frase, texto, etc)
    calcular la cantidad de veces que aparece una letra dada.
    */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una Oracion: ");
        String texto = entrada.nextLine();
        System.out.print("Que letra desea saber cuantas veces se repite?: ");
        char caracter = entrada.next().charAt(0);

        char[] letras = texto.toCharArray();
        int cantidad = 0;

        for (char letra : letras) {
            if (letra == caracter) {
                cantidad++;
            }
        }

        System.out.println("La letra se repite "  + cantidad +  " veces");
        entrada.close();
    }
}
