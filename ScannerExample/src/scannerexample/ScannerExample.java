/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerexample;

import java.util.Scanner;

/**
 *
 * @author jmperezsantos
 */
public class ScannerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre:");
        String nombre = s.nextLine();
        
        System.out.println("Escribe dónde vives:");
        
        String pais = s.nextLine();
        
        System.out.println("Escribe tu edad:");
        
        int edad = s.nextInt();
        s.nextLine();
        
        System.out.println("Escribe qué estudiaste:");
        
        String carrera = s.nextLine();
        
        System.out.println("Escribe en qué escuela estudiaste:");
        
        String escuela = s.nextLine();
        
        //VALIDACIONES
        
        if (edad > 0 && edad < 100){
            
            System.out.println("La edad es válida");
            
        } else {
            System.out.println("La edad no es válida");
        }
        
    }
    
}
