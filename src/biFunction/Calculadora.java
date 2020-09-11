/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 *
 * @author diego
 */
public class Calculadora {

    String calcu(BiFunction<Integer, Integer, String> biFunc, Integer num1, Integer num2) {

        return biFunc.apply(num1, num2);
    }

    List<Double> calcuDos(BiFunction<Double, Double, Double> biFunc, List<EjercicioDosEmpleado> lista, Double num2) {

        List<Double> listaSalario = new ArrayList<>();

        for (EjercicioDosEmpleado ede : lista) {
            listaSalario.add(biFunc.apply(ede.getSaladrio(), num2));
        }

        return listaSalario;
    }

    List<Double> calcuDos(BiFunction<Double, Double, Double> biFunction, List<Double> lista, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
