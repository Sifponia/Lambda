/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicateMasBifunction;

import java.util.function.BiFunction;

/**
 *
 * @author diego
 */
public class ImcrementosSalarios {

    public double getSalarios(Empleado empleados, double incremento,
            BiFunction<Double, Double, Double> biFunc) {

        return biFunc.apply(empleados.getSaladrio(), incremento);
    }
}
