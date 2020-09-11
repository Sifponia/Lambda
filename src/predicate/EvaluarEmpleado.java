/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author diego
 */
public class EvaluarEmpleado {

    //Metodo para evaluar 
    public List<Empleado> evaluar(List<Empleado> listaEmpelado, Predicate<Empleado> predicate) {

        List<Empleado> listaEmpelados = new ArrayList<>();

        for (Empleado empleado : listaEmpelado) {
            if (predicate.test(empleado)) {

                listaEmpelados.add(empleado);
            }
        }

        return listaEmpelados;
    }

}
