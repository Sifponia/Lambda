/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author diego
 */
public class Evaluar {

    public List<Empleado> getEmpleado(List<Empleado> listaEmpelado,
            BiPredicate<Integer, String> biPre) {

        List<Empleado> listaEmpelados = new ArrayList<>();

        for (Empleado empleado : listaEmpelado) {

            if (biPre.test(empleado.getEdad(), empleado.getDepartamento())) {
                listaEmpelados.add(empleado);

            }
        }

        return listaEmpelados;
    }

}
