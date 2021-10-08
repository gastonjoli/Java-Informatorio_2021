package Lvl2;

/* EJERCICIO 6:
Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea
calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para
luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el
valor (value) es el sueldo calculado..
 */



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class Ejercicio6 {


    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<>();
        Map<String, Integer> sueldoTotal = new HashMap<>();



        Empleado e1 = new Empleado("Brian", "7200", 50, 350);
        Empleado e2 = new Empleado("Jose", "3500", 35, 548);

        empleados.add(e1);
        empleados.add(e2);

        for (Empleado empleado : empleados) {

            System.out.println(empleado);
        }


        sueldoTotal.put(e1.obtDni(), e1.sueldo());
        sueldoTotal.put(e2.obtDni(), e2.sueldo());

        System.out.println(sueldoTotal);


    }

}

class Empleado {

    int valorPorHora, horasTrabajadas;
    String nombre, dni;


    public Empleado(String nombre, String dni, int horasTrabajadas, int valorPorHora){

        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.dni + " - " + this.horasTrabajadas + " - " + this.valorPorHora;
    }

    public int sueldo(){

        return this.horasTrabajadas * this.valorPorHora;

    }

    public String obtDni(){

        return this.dni;

    }

}