/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author jmperezsantos
 */
public class Circulo extends FiguraGeometrica {

    private float radio;

    public float getRadio() {

        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo() {
        super();
    }

    public Circulo(String color, float radio) {

        super(color);

        this.radio = radio;

    }
    
    public float getDiametro(){
        return radio * 2;
    }

    @Override
    public float getArea() {

        double area = Math.PI * Math.pow(radio, 2);

        return (float) area;
    }

    @Override
    public float getPerimetro() {
       
        double per = Math.PI * (getDiametro());        
        
        return (float)per;
    }

    @Override
    public String toString() {

//        String toString = super.toString();
//        return toString + "\nCirculo{" + "radio=" + radio + '}';
        return "Circulo{radio=" + radio
                + ", color=" + this.getColor() + "}";

    }

    @Override
    public String getColor() {
        
        String color = super.getColor();
        
        return color.toUpperCase();
        
    }
    
    

}
