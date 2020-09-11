/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoDeFunction.pruebaDosFunctionComensal;

import java.util.function.Function;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        
        
    }

    static Object getDatosComensal(Comensal comensal, Function<Object, Comensal> func) {

        return func.apply(comensal);

    }

}
