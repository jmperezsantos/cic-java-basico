/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapplication.controller;

/**
 *
 * @author jmperezsantos
 */
public class MyFirstApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola Mundo!");
        
        //Valores primitivos
        int entero = 5;
        System.out.println(entero);
        long largo = 5;
        System.out.println(largo);
        
        float flotante = 5.4f;
        System.out.println(flotante);
        double doble = 5.5;
        System.out.println(doble);
        
        char caracter = 'c';
  
        
        int otroEntero;
        otroEntero = 10;
        
        boolean buleano = true;
        
        int sumando1 = 10;
        int sumando2 = 20;
        int sumaEntero = sumando1 + sumando2;
        System.out.println("Suma = " + sumaEntero);
        
        float sumandof1 = 10.2f;
        float sumandof2 = 20.3333f;
        float sumaFloat = sumandof1 + sumandof2;
        System.out.println("Suma = " + sumaFloat);
        
        float f1 = 2.3f;
        int i1 = 5;
        double d1 = 5.77777;
        long l1 = 5;
        
        int ri = i1 + (int)l1 + (int)f1 + (int)d1;
        float rf = i1 + l1 + f1 + (float)d1;
   
        
        System.out.println("Suma = " + ri);
        System.out.println("Suma = " + rf);
    }
    
}
