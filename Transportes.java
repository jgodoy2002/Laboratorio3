/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author jcgof
 */
public class Transportes {
    protected String placa;
    protected Color color;
    protected ArrayList<Estaciones> estaciones;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Estaciones> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estaciones> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Transportes{" + "placa=" + placa + ", color=" + color + ", estaciones=" + estaciones + '}';
    }
    
    
    
    
    
    
    
    
}
