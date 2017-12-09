/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerexample;

/**
 *
 * @author jmperezsantos
 */
public class TrueTableExample {
    
    public static void main(String[] args) {
        
        //Tabla de verdad del AND
        System.out.println("true && true");
        if ((true && false) && true){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("true && false");
        if (true && false){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("false && true");
        if (false && true){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("false && false");
        if (false && false){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        //Tabla de verdad del OR
        System.out.println("true || true");
        if (false || false){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("true || false");
        if (true || false){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("false || true");
        if (false || true){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("false || false");
        if (false || false){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        //Tabla de verdad del XOR
        System.out.println("true ^ true");
        if (true ^ true){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("true ^ false");
        if (true ^ false){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("false ^ true");
        if (false ^ true){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        System.out.println("false ^ false");
        if (false ^ false){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        // 5 + 5 * 5 * 5 = 
        int edad = 36;
        int ant = 6;
        
        if (edad >= 18 && edad < 35 || ant > 5){
            System.out.println("FUE TRUE!!");
        } else {
            System.out.println("FUE FALSE!!");
        }
    }
    
}
