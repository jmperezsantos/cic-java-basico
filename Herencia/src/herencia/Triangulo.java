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
public class Triangulo extends FiguraGeometrica{

    private float altura;
    private float base;
    private float lado1;
    private float lado2;  

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public Triangulo() {
        super();
    }

    public Triangulo(float altura,
            float base, 
            float lado1,
            float lado2, 
            String color) {
        
        super(color);        
        
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public float getArea() {
        
        return (base*altura) / 2;
        
    }

    @Override
    public float getPerimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public String toString() {
        
        //        String toString = super.toString();
//        return toString + "\nCirculo{" + "radio=" + radio + '}';
        
        return "Triangulo{" + 
                "altura=" + altura + 
                ", base=" + base + 
                ", lado1=" + lado1 + 
                ", lado2=" + lado2 + 
                ", color=" + this.getColor() +"}";
    }

    @Override
    public String getColor() {
        
        String color = super.getColor();
        
        return color.toLowerCase();
    }
    
    
    
}
