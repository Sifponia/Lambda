/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biFunction;

/**
 *
 * @author diego
 */
public class EjercicioDosEmpleado {

    String nombre;
    double saladrio;

    public EjercicioDosEmpleado(String nombre, double saladrio) {
        this.nombre = nombre;
        this.saladrio = saladrio;
    }

    public EjercicioDosEmpleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaladrio() {
        return saladrio;
    }

    public void setSaladrio(double saladrio) {
        this.saladrio = saladrio;
    }

}
