/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicateMasBifunction;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author diego
 */
public class Test {
    
    public static void main(String[] args) {
        
        List<Empleado> listaEmpleado = Arrays.asList(
                new Empleado("Oscar", 30, 4000, "IA"),
                new Empleado("Oscar", 30, 4000, "IA"),
                new Empleado("Oscar", 30, 4000, "IA"),
                new Empleado("Oscar", 30, 4000, "IA"),
                new Empleado("Oscar", 30, 4000, "IA"),
                new Empleado("Oscar", 30, 4000, "IA"),
                new Empleado("Oscar", 30, 4000, "IA"),
                new Empleado("Oscar", 30, 4000, "IA")
        );
        
        ImcrementosSalarios is = new ImcrementosSalarios();
        
        for (Empleado empelados : listaEmpleado) {
            
            double salario = is.getSalarios(empelados, 5, (salarioemple, incre)
                    -> (salarioemple * (incre / 100)));
            
            System.out.println(empelados.getSaladrio() + salario);
            
            empelados.setSaladrio(salario+empelados.getSaladrio());
            
        }
        
        for (Empleado em : listaEmpleado) {
            System.out.println("Los nuevos salarios son "+ em.getNombre() +
                    " Salarios " + em.getSaladrio());
        }
        
    }
    
}
