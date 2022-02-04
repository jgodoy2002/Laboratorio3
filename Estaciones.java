/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

/**
 *
 * @author jcgof
 */
public class Estaciones {
    protected String nombre;
    protected int cordX;
    protected int cordY;

    public Estaciones() {
    }

    public Estaciones(String nombre, int cordX, int cordY) {
        this.nombre = nombre;
        this.cordX = cordX;
        this.cordY = cordY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    @Override
    public String toString() {
        return "Estaciones{" + "nombre=" + nombre + ", cordX=" + cordX + ", cordY=" + cordY + '}';
    }
    
    
    
    
}
