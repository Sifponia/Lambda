/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradigmafuncional;

import interfacePrueba.Suma;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author diego
 */
public class ConAtributos implements Suma {

    @Override
    public double sumar(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {

        ConAtributos atributos = new ConAtributos();

        /*
        List<String> lista = new ArrayList<>();
        lista.add("Oscar");
        lista.add("Maurio");
        lista.add("Oscar");
        lista.add("Maurio");
        lista.add("Oscar");
        lista.add("Maurio");
        lista.add("Oscar");
        lista.add("Maurio");

        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);

      
         */
        sumarr(3, 3);
        System.out.println(sumarr(3, 3));
    }

    public static double sumarr(double c, double d) {

        /*
        Suma suma = (a, b) -> {
            return a + b;

        };
         */
        return c + d;
    }

}
