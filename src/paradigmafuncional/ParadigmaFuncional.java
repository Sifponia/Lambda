/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradigmafuncional;

import interfacePrueba.Saludar;
import static java.awt.Color.red;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author diego
 */
public class ParadigmaFuncional {

    /**
     * @param args the command line arguments
     */
    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("Oscar");
        lista.add("Maurio");
        lista.add("Tabora");
        lista.add("z");

        /*
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });
         */
        //Expresion Lamda
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        //Imprimir por pantalla
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {

        //Constructor de la misma clase
        ParadigmaFuncional p = new ParadigmaFuncional();
        p.ordenar();
        calcular();

        //CVonstructor abstract
    }

    public static void calcular() {
        /*
        Saludar promedio = new Saludar() {
            @Override
            public double promedio(double Numero1, double Numero2) {
                return (Numero1 + Numero2) / 2;
            }

        };

        System.out.println(promedio.promedio(4, 3));

         */

        Saludar opera = (double x, double y) -> (x + y) / 2;
        // opera.promedio(3, 3);
        System.out.println(opera.promedio(3, 7));
    }
}
