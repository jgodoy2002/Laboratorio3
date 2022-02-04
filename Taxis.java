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
public class Taxis extends Transportes {

    protected int numeroTaxi;
    protected ArrayList<Alumnos> listaA;

    public Taxis() {
    }

    public Taxis(int numeroTaxi, ArrayList<Alumnos> listaA, String placa, Color color, ArrayList<Estaciones> estaciones) {
        super(placa, color, estaciones);
        this.numeroTaxi = numeroTaxi;
        if (listaA.size() <= 4) {
            this.listaA = listaA;
        }
    }

    public int getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(int numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    public ArrayList<Alumnos> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Alumnos> listaA) {
        this.listaA = listaA;
    }

    @Override
    public String toString() {
        return super.toString()+ "Taxis{" + "numeroTaxi=" + numeroTaxi + ", listaA=" + listaA + '}';
    }
    
    
    
    
}
