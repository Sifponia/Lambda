/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

/**
 *
 * @author diego
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double saladrio;
    private String departamento;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double saladrio, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.saladrio = saladrio;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaladrio() {
        return saladrio;
    }

    public void setSaladrio(double saladrio) {
        this.saladrio = saladrio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
