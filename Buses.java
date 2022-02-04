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
public class Buses extends Transportes {

    protected ArrayList<Alumnos> listaA;
    protected int sillas;
    protected int capacidadP;
    protected int max;

    public Buses() {
    }

    public Buses(ArrayList<Alumnos> listaA, int sillas, int capacidadP, String placa, Color color, ArrayList<Estaciones> estaciones) {
        super(placa, color, estaciones);
        this.listaA = listaA;
        this.sillas = sillas;
        this.capacidadP = capacidadP;
        int maximo = sillas + capacidadP;
        if(listaA.size()<=maximo){
            this.max = maximo;
        }
    }

    public ArrayList<Alumnos> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Alumnos> listaA) {
        this.listaA = listaA;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getCapacidadP() {
        return capacidadP;
    }

    public void setCapacidadP(int capacidadP) {
        this.capacidadP = capacidadP;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return super.toString() + "Buses{" + "listaA=" + listaA + ", sillas=" + sillas + ", capacidadP=" + capacidadP + ", max=" + max + '}';
    }

        
    
    
    
    
}
