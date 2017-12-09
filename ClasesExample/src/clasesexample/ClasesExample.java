/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesexample;

/**
 *
 * @author jmperezsantos
 */
public class ClasesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Automovil auto = new Automovil(4,
                1,
                5,
                "Verde",
                "Nissan",
                "2017",
                100000);

        System.out.println(auto);
        /*System.out.println(
                "El precio del auto es: " + auto.getPrecio());
        
        System.out.println(
                "El color es: "+auto.getColor());*/
        
        Automovil auto2 = new Automovil();
        
        /*System.out.println(
                "El precio del auto2 es: " + auto2.getPrecio());
        
        System.out.println(
                "El color2 es: "+auto2.getColor());*/
        System.out.println(auto2);
        
        Automovil auto3 = new Automovil("blanco", "Audi", "2018");
        
        /*System.out.println(
                "El precio del auto3 es: " + auto3.getPrecio());
        
        System.out.println(
                "El color3 es: "+auto3.getColor());*/
        System.out.println(auto3);
        
        Automovil auto4 = new Automovil(-7, 5, "Ford");
        auto4.setModelo("Cualquier cosa");
        
        /*System.out.println(
                "El precio del auto4 es: " + auto4.getPrecio());
        
        System.out.println(
                "El color4 es: "+auto4.getColor());*/
        System.out.println(auto4);
        

    }

}
