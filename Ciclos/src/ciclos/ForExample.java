/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author jmperezsantos
 */
public class ForExample {

    public static void main(String[] args) {

        //for (valorInicio; condiciónPermanencia; incremento){}
        //++ => i = i+1  //i++ i+=2 i+=3 
        //-- => i = i-1  //i-- i-=2 i-=3
        for (int i = 0; i < 3; i = i + 1) {

            for (int j = 0; j < 3; j++) {

                String formato = String.format("[%d,%d]", i, j);
                System.out.println(formato);

            }
            
            System.out.println("---");

        }

    }

}
