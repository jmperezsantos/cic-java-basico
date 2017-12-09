/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author jmperezsantos
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Circulo c = new Circulo("AmArILlo", 5);
        Triangulo t = new Triangulo(5, 10, 5, 2, "NARANJA");

        System.out.println("El Área de C es: " + c.getArea());
        System.out.println("El Perímetro de C es: " + c.getPerimetro());
        System.out.println("El Color de C es: " + c.getColor());

        System.out.println("El Área de T es: " + t.getArea());
        System.out.println("El Perímetro de T es: " + t.getPerimetro());
        System.out.println("El Color de T es: " + t.getColor());

        FiguraGeometrica fc = new Circulo("AmArILlo", 5);

        FiguraGeometrica ft = new Triangulo(5, 10, 5, 2, "NARANJA");

        System.out.println("El Área de FC es: " + fc.getArea());
        System.out.println("El Perímetro de FC es: " + fc.getPerimetro());
        System.out.println("El Color de FC es: " + fc.getColor());

        System.out.println("El Área de FT es: " + ft.getArea());
        System.out.println("El Perímetro de FT es: " + ft.getPerimetro());
        System.out.println("El Color de FT es: " + ft.getColor());

        FiguraGeometrica fg = t;

        if (fg instanceof Circulo) {
            System.out.println("Hola Mundo!");
        } else if (fg instanceof Triangulo) {
            System.out.println("Los odio a todos!");
        }
        
        System.out.println("---------------");
        hacerFigura(c);
        hacerFigura(t);

    }

    public static void hacerFigura(FiguraGeometrica f) {

        System.out.println("a: " + f.getArea());
        System.out.println("p: " + f.getPerimetro());

        if (f instanceof Triangulo) {
            Triangulo t = (Triangulo) f;
            System.out.println("Hola Mundo + h:" + t.getAltura());
        } else if (f instanceof Circulo){
            
            Circulo c = (Circulo) f;
            System.out.println("Alzar las manos + r:" + c.getRadio());
        }
        
        System.out.println("La figura es: " + f.toString());
        System.out.println("La figura es de color: " + f.getColor());

    }

    public static void hacerTriangulo(Triangulo t) {

        System.out.println("a: " + t.getArea());
        System.out.println("p: " + t.getPerimetro());

        System.out.println("Hola Mundo + h:" + t.getAltura());

    }

    public static void hacerCirculo(Circulo c) {

        System.out.println("a: " + c.getArea());
        System.out.println("p: " + c.getPerimetro());

        System.out.println("Alzar las manos + r:" + c.getRadio());
    }

}
