/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatriangulo;

/**
 *
 * @author jmperezsantos
 */
public class Triangulo {
    
    private float base;
    private float alto;
    private float ancho;

    public float getAncho() {
        return ancho;
    }

    
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return alto;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAltura(float altura) {
        this.alto = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }
    
    public float getPerimetro(){
        return base * 3;
    }
    
    public float getArea(){
        return (base * alto)/2;
    }
    
    public float getVolumen(){
        
        return this.getArea() * this.ancho;
        
    }

    public Triangulo() {
        
    }

    public Triangulo(float base, float altura, float ancho) {
        this.base = base;
        this.alto = altura;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + alto + '}';
    }
  
    
    
}
