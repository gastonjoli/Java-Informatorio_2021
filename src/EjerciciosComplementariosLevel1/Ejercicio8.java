package EjerciciosComplementariosLevel1;

/* EJERCICIO 8:
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido :
Edad :
Dirección :
Ciudad :
Luego imprimirá el siguiente mensaje:.
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido} */

import java.util.Scanner;

public class Ejercicio8 {

     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

         System.out.println("Nombre y Apellido: ");
         var NombreYApellido = entrada.nextLine();

         System.out.println("Edad: ");
         var Edad = entrada.nextLine();

         System.out.println("Dirección: ");
         var Direccion = entrada.nextLine();

         System.out.println("Ciudad: ");
         var Ciudad = entrada.nextLine();

         System.out.print(Ciudad + " - " + Direccion+ " - "+ Edad + " - " + NombreYApellido);
         entrada.close();
     }
 }


