/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoLambda.ComoRetornoDeMetodo;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        System.out.println(getCalculadora().calculadora(4L, 4L));

    }

    private static Calculadora getCalculadora() {

        return (x, y) -> x / y;
    }
}
