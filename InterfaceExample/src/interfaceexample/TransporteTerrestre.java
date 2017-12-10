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
public abstract class TransporteTerrestre {
    
    public void encender(){
        System.out.println("Prendiendo Transporte");
    }
    
    public void apagarse(){
        System.out.println("Apagando Transporte");
    }
    
    public abstract void desplazarse();
    
}
