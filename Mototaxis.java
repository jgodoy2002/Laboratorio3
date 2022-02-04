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
public class Mototaxis extends Transportes{
    protected int espacio;

    public Mototaxis() {
    }

    public Mototaxis(String placa, Color color, ArrayList<Estaciones> estaciones) {
        super(placa, color, estaciones);
        this.espacio=2;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
    
    
    
    
}
