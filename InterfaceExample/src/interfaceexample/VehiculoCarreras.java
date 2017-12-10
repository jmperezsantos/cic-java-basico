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
public interface VehiculoCarreras {
    
    public void acelerar();
    
    public void frenar();
    
    public void rebasar(VehiculoCarreras auto);
    
}
