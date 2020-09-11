/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author diego
 */
public class TestEmpleado {

    public static void main(String[] args) {

        //Lista con object en una lista
        List<Empleado> listaEmpleado = Arrays.asList(
                new Empleado("Rodri", 22, 222.55, "RRHH"),
                new Empleado("Rodri", 22, 2226.55, "RRHH"),
                new Empleado("Rodri", 22, 222.55, "RRHH"),
                new Empleado("Rodri", 22, 222.55, "RRHH"),
                new Empleado("Rodri", 22, 22277.55, "RRHH"),
                new Empleado("Zodri", 22, 222.55, "RRHH"),
                new Empleado("Rodri", 22, 222.55, "RRHH"),
                new Empleado("Rodri", 22, 222.55, "RRHH"),
                new Empleado("Rodri", 212, 2222.55, "RRHH")
        );

        Empleado empleado = new Empleado();

        // Devuelve un valor mayor al salario 
        EvaluarEmpleado evaluarEmpelado = new EvaluarEmpleado();
        List<Empleado> listaEmpleadoDos
                = evaluarEmpelado.evaluar(listaEmpleado,
                        x -> x.getSaladrio() > 20000);

        for (Empleado empleados : listaEmpleadoDos) {
            System.out.println(empleados.getSaladrio());
        }

        //Devuelve un nombre que comienza con la letra z
        List<Empleado> listaEmpl
                = evaluarEmpelado.evaluar(listaEmpleado,
                        x -> x.getNombre().startsWith("Z"));

        for (Empleado em : listaEmpl) {
            System.out.println(em.getNombre());
        }

        
        //Myoyes de 200 años
        
        List<Empleado> listaMayores =
                evaluarEmpelado.evaluar(listaEmpleado, x -> x.getEdad() > 200);
        
        for (Empleado empleados : listaMayores) {
            System.out.println(empleados.getEdad());
        }
        
    }

}
