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
public class Camaro 
        extends TransporteTerrestre 
        implements VehiculoCarreras{
    
    public void serPresumido(){
        System.out.println("Miren todos mi camaro!");
    }

    @Override
    public void desplazarse() {
        this.encender();
        this.acelerar();
        
        BoteCarreras bote = new BoteCarreras();
        this.rebasar(bote);
        
    }

    @Override
    public void acelerar() {
        System.out.println("Aumentando velocidad...");
    }

    @Override
    public void frenar() {
        System.out.println("Disminuyendo velocidad...");
    }

    @Override
    public void rebasar(VehiculoCarreras auto) {
        
        auto.acelerar();
        System.out.println("Decir adiós");
        auto.frenar();
        
    }
    
}
