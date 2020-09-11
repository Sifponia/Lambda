/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoDeFunction;

import java.util.function.Function;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        String numero = "123456";
        Function<String, Integer> func = x -> Integer.parseInt(numero);
        Integer inte = func.apply(numero);

        System.out.println(inte);

    }
}
