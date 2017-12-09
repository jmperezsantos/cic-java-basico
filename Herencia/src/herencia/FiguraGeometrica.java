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
public abstract class FiguraGeometrica {
    
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract float getArea();
    
    public abstract float getPerimetro();

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
}
