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
         Scanner scan = new Scanner(System.in);

         System.out.println("Nombre y Apellido: ");
         String NombreYApellido = scan.nextLine();

         System.out.println("Edad: ");
         String Edad = scan.nextLine();

         System.out.println("Dirección: ");
         String Direccion = scan.nextLine();

         System.out.println("Ciudad: ");
         String Ciudad = scan.nextLine();

         System.out.print(Ciudad + " - " + Direccion+ " - "+ Edad + " - " + NombreYApellido);



     }








 }


