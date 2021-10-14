package EjerciciosComplementariosLevel1;


/*EJERCICIO 6:
 Se desea una aplicación que solicite
 2 números enteros y realice la operación
 de potencia (sin uso de librerías)..
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int base, potencia, resultado;

        System.out.println("Ingrese un numero: ");
        base = entrada.nextInt();

        System.out.println("Indique a que potencia lo desea elevar: ");
        potencia = entrada.nextInt();
        entrada.close();

        resultado = multiplicacion(base, potencia);

        System.out.println("El resultado es: "+resultado);
        }
       protected static int multiplicacion(int x, int y){
        int res = x;
            for (int i = 1; i < y; i++) {
                res = res * x;
            }
            return res;
        }
    }
