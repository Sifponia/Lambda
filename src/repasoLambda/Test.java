/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoLambda;

/**
 *
 * @author diego
 */
public class Test {

    public static void main(String[] args) {

        
        //-Sin metodo 
        HelloWorld hw = () -> System.out.println("Hello world");
        hw.saludar();

        
        //Con metodo
        
        Test test = new Test();
        test.miMetodo(()-> System.out.println("Hola amigos"));
        
        
    }

    public void miMetodo(HelloWorld hw) {

        hw.saludar();
    }
}
