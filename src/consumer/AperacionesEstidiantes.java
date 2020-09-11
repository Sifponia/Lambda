/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author diego
 */
public class AperacionesEstidiantes {

    public void setEstudiantes(List<Estudiante> listaEstudiantes,
            Consumer<Estudiante> conumer) {

        for (Estudiante estudiante : listaEstudiantes) {
            conumer.accept(estudiante);
        }
    }
}
