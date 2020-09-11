/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoLambda.UsoDeReturn;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        //Metodo void
        Test.suma((x, y) -> (x + y), 5, 5);

        //Metodo return
        //Test.sumaDevuelve((x, y) -> x + y, 7, 6);
        System.out.println(Test.sumaDevuelve((x, y) -> x + y, 7, 6));

    }

    static void suma(Suma suma, int num1, int num2) {

        int result = num1 + num2;
        suma.suma(num1, num2);
        System.out.println("La suma es " + result);

    }

    static int sumaDevuelve(Suma sumaD, int x, int y) {

        return sumaD.suma(x, y);
    }
}
