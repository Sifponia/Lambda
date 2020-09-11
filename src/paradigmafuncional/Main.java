/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradigmafuncional;

import interfacePrueba.SaludarDos;

/**
 *
 * @author diego
 */
public class Main {

    public static void main(String[] args) {

        //Metodo lamba
        //saludar();
        //Metodo largo
        saludar();
        System.out.println(" ");

        //Multiples variables
        concatenar();

        sumar();
    }

    public static void sumar() {

        SaludarDos suma = () -> (2);

        System.out.println(suma.suma());

    }

    public static void concatenar() {
        /*
        SaludarDos sa = () -> {
            String Hola = "Hola";
            String Adios = "Adios";

            return Hola + " " + Adios;

        };

        System.out.println(sa.saludarDos());
         */
    }

    public static void saludar() {

        //1)-Metodo lamba basico
        // SaludarDos saludar = () -> ("Adios");
        //System.out.println(saludar.saludarDos());
        //Metodo instancia
        /*
        SaludarDos saludar1 = new SaludarDos() {
            @Override
            public String saludarDos() {
                return "Hola";
            }

        };

        System.out.println(saludar1.saludarDos());


         */
    }

}
