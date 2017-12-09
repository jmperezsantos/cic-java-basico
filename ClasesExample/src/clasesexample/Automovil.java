/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesexample;

public class Automovil {

    //Propiedades
    private int llantas;
    private int llantaRefaccion;
    private int puertas;
    private String color;
    private String marca;
    private String modelo;
    private double precio;

    //Métodos de acceso
    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getLlantaRefaccion() {
        return llantaRefaccion;
    }

    public void setLlantaRefaccion(int llantaRefaccion) {
        this.llantaRefaccion = llantaRefaccion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Métos de ciclo de vida
    public Automovil() {

        this(4, 1, 5, "VERDE", "NISSAN", "2017", 150000);

    }

    public Automovil(int llantas,
            int puertas,
            String marca) {

        if (llantas < 0) {
            this.llantas = 4;
        } else {
            this.llantas = llantas;
        }
        this.puertas = puertas;
        this.marca = marca;

    }

    public Automovil(String color,
            String marca,
            String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(int llantas,
            int llantaRefaccion,
            int puertas,
            String color,
            String marca,
            String modelo,
            double precio) {

        if (llantas < 0) {
            this.llantas = 4;
        } else {
            this.llantas = llantas;
        }

        this.llantaRefaccion = llantaRefaccion;
        this.puertas = puertas;
        this.color = color;
        this.marca = marca;

        if (modelo == null) {
            this.modelo = "";
        } else {
            this.modelo = modelo;
        }

        this.precio = precio;

    }

    @Override
    public String toString() {
        return "Automovil{" + "llantas=" + llantas + ", llantaRefaccion=" + llantaRefaccion + ", puertas=" + puertas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

}
