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
public class DoWhileExample {

    public static void main(String[] args) {

        int op = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Antes del ciclo");

        do {
            //while (op != 5) {

            //Pedir 2 numeros por teclado
            System.out.println("Ingresa el primer número");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingresa el segundo número");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            //Mostrar un menú
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");

            System.out.println("Selecciona una opción del menú");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("ERROR!, el divisor no puede ser cero");
                    } else {
                        System.out.println("La división es: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Adios, pasala bien!");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida, intenta de nuevo");

            }

            //}
        } while (op != 5);

        System.out.println("Se salió del ciclo");

    }

}
