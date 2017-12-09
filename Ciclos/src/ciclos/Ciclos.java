/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author jmperezsantos
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        System.out.println("Antes del ciclo");

        int x = 0;
        String respuesta = "";
        
        while (x<10) {

            System.out.println("Dentro del ciclo");
            
            System.out.println("Volver a entrar?");
            
            respuesta = s.nextLine();
            
            x = x + 1;

        }

        System.out.println("Fuera del ciclo x=" + x);

    }

}
