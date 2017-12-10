/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author jmperezsantos
 */
public class BoteCarreras implements VehiculoCarreras {

    @Override
    public void acelerar() {
        System.out.println("Moviendo elices");
    }

    @Override
    public void frenar() {
        System.out.println("Moviendo elices en reversa");
    }

    @Override
    public void rebasar(VehiculoCarreras auto) {
        System.out.println("Decir adios");
    }
    
}
