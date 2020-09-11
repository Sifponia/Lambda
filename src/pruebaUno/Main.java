/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaUno;

/**
 *
 * @author diego
 */
public class Main {

    /*

    public static void saludarMain(String x) {

        Interface persona = (c) -> {
            System.out.println("Hola");
        };

        persona.saludarDos(x);

    }
     */
 /*2-
    public static int sumar(int a, int b) {
        
        Interface sumar = (x, y) -> {
            return x + y;
        };
        return sumar.suma(a, b);
    }

     */
    public static int sumas(int a, int c) {

        Interface sumas = new Interface() {
            @Override
            public int suma(int a, int b) {
                return a + b;
            }

        };

        return sumas.suma(a, c);
    }

    public static void main(String[] args) {

        //2-System.out.println(sumar(4, 4));
        System.out.println(sumas(4, 4));
    }

}
