/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaTres;

/**
 *
 * @author diego
 */
public class Main {

    /*
    VOID-----------VOID-------------VOID
    public static void multiplicar(int a, int b) {
       
        Multiplicar multi = (x, y) -> {
            System.out.println("La multiplicacion es " + x * y);
        };

        multi.multiplicar(a, b);

    }
     */
    //fUNCION----------FUNCION-------RETURN
    public static int sumas(int a, int b) {

        Multiplicar multi = (x, y) -> {

            return x * y;
        };

        return multi.multiplicar(a, b);
    }

    public static void main(String[] args) {

        System.out.println(sumas(6, 6));

    }

}
