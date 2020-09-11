/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoLambda.RepasoConParametros;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        //atributos 
        int num1 = 5;
        int num2 = 10;

        //Lambda con parametros
        Operaciones ope = (x, y) -> System.out.println("La suma es " + (x + y));
        ope.suma(3, 3);

        //Con parametros
        Test test = new Test();

        test.suma((x, y) -> System.out.println("La suma es " + (x + y)), num1, num2);

        test.suma(ope, 4, 4);

    }

    public void suma(Operaciones operaciones, int x, int y) {

        operaciones.suma(x, y);
    }
}
