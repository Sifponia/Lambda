/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        //    BiPredicate<Integer, Integer> biPre = (x, y) -> x < y;
        //  System.out.println(biPre.test(5, 6));
        List<Empleado> listaEmpleado = Arrays.asList(
                new Empleado("Oscar", 70, 5000, "IA"),
                new Empleado("Oscar", 30, 555000, "IA"),
                new Empleado("Oscar", 20, 5000, "IA"),
                new Empleado("Oscar", 60, 5444000, "Ventas"),
                new Empleado("Oscar", 10, 335000, "IA"),
                new Empleado("Oscar", 40, 5555000, "IA"),
                new Empleado("Oscar", 36, 1115000, "IA"),
                new Empleado("Oscar", 37, 6665000, "IA"),
                new Empleado("Oscar", 39, 775000, "Mostrador"),
                new Empleado("Oscar", 38, 7785000, "Mostrador"),
                new Empleado("Oscar", 35, 78785000, "IA"),
                new Empleado("Oscar", 33, 565645000, "IA"),
                new Empleado("Oscar", 20, 46465000, "IA")
        );

        Evaluar eva = new Evaluar();

        //Creo  el primer critero donde le pido la edad > 25 y un cierto departamento
        BiPredicate<Integer, String> biPredi
                = (edad, departamento) -> (edad > 25) && (departamento.equals("Ventas"));

        //Creo  el segundo critero donde le pido la edad > 25 y un cierto departamento
        BiPredicate<Integer, String> biPrediDos
                = (edad, departamento) -> (edad > 25) && (departamento.equals("Mostrador"));

        //Creo  el tercer criterio y creo una condiicion or donnde le paso los dos criterios creados anteriormente
        BiPredicate<Integer, String> biPrediTres
                = biPredi.or(biPrediDos);

        //Luego creo una lista y añado los valores usando el metodo eva 
        List<Empleado> emp
                = eva.getEmpleado(listaEmpleado, biPrediTres);

        //Imprimo los valores por consola
        for (Empleado empleados : emp) {
            System.out.println(empleados.getNombre() + " " + empleados.getEdad() + " "
                    + " " + empleados.getDepartamento());
        }

    }
}
