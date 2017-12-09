/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesexample;

import java.util.Scanner;

/**
 *
 * @author jmperezsantos
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        MyClass c1 = new MyClass();
        
        System.out.println("c1.v1= " + c1.getV1());
        
        System.out.println("c1.v2= " + c1.getV2());
        
        Scanner s = new Scanner(System.in);
        
        int i = s.nextInt();
        
        c1.setV2(i);
        
        System.out.println("c1.v2= " + c1.getV2());
        
    }
    
}
