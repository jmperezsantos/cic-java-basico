/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatriangulo;

/**
 *
 * @author jmperezsantos
 */
public class PracticaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo t = new Triangulo(3,2,9);
        
        System.out.println("El perímetro es: " 
                + t.getPerimetro());
        
        System.out.println("El área es: " 
                + t.getArea());
        
    }
    
}
