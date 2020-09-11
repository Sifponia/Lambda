/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        BiFunction<String, String, String> biFunc;
        biFunc = (x, y) -> x + y;
        System.out.println(biFunc.apply("Hola", "Mundo"));

        //------------------Object Calculadora
        Calculadora calcu = new Calculadora();
        String srt = calcu.calcu((x, y) -> ": " + (x + y), 5, 5);

        System.out.println(srt.length());

        //ObjectEjercciosDosEmpelado
        List<EjercicioDosEmpleado> lista = Arrays.asList(
                new EjercicioDosEmpleado("javi", 22.2),
                new EjercicioDosEmpleado("javdfdfdi", 332.2),
                new EjercicioDosEmpleado("javi", 233.2),
                new EjercicioDosEmpleado("javi", 1122.2),
                new EjercicioDosEmpleado("javfdfdi", 77722.2)
        );

        EjercicioDosEmpleado ede = new EjercicioDosEmpleado();

        //calcu.calcuDos((x, y) -> ede.getSaladrio(), lista, 4.55);
        List<Double> listaa = calcu.calcuDos((s, i) -> s + (s * (i / 100)), lista, 4.55);

        for (Double salarios : listaa) {
            System.out.println(salarios);
        }
        //System.out.println(calcu.calcuDos((s, i) -> s+(s*(i/100)), lista, 4.55));

    }
}
