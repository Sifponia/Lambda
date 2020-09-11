/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConParametros;

/**
 *
 * @author diego
 */
public class MainSumar {

    public static void main(String[] args) {

        double suma = sumar(5, 6);

        System.out.println(suma);
    }

    public static double sumar(double a, double b) {

        Sumar suma = (c, d) -> {
            return a - b;
        };

        return suma.sumarI(a, b);
    }

}
