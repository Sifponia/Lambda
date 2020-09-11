/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        Consumer<String> consumer = x -> System.out.println(x);

        consumer.accept("Hello world".toUpperCase());

        List<Estudiante> listaEstudiante = Arrays.asList(
                new Estudiante("Oscar", 55532.2),
                new Estudiante("Oscar", 232.2),
                new Estudiante("Oscar", 33332.2),
                new Estudiante("Oscar", 232.2),
                new Estudiante("Oscar", 111.2),
                new Estudiante("Oscar", 3332.2),
                new Estudiante("Oscar", 632.2),
                new Estudiante("Oscar", 332.2)
        );

        AperacionesEstidiantes operaciones = new AperacionesEstidiantes();

       
        Consumer<Estudiante> consu = x
                -> System.out.println("Nombre " + x.getNombre()
                        + " Cali " + x.getCalificacion());

        System.out.println("Sin actualizar");
        operaciones.setEstudiantes(listaEstudiante, consu);

        DecimalFormat formato1 = new DecimalFormat("#.00");
        Consumer<Estudiante> conIncre = x
                ->  x.setCalificacion(x.getCalificacion() * 1.15);

        System.out.println("aCTUALIZADA");
        operaciones.setEstudiantes(listaEstudiante, conIncre);
        
       
        operaciones.setEstudiantes(listaEstudiante, consu);
        
        

    }

}
