/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        Integer numero = 20;
        //Uso de predicate
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(4));

        List<Integer> lista = new LinkedList<>();

        if (getMayorNumero(x -> numero > 10, numero)) {

            System.out.println("El numero es mayor que " + numero);
        } else {
            System.out.println("No es mayor");
        }
    }

    static boolean getMayorNumero(Predicate<Integer> predicate, Integer numero) {

        return predicate.test(numero);

    }

}
