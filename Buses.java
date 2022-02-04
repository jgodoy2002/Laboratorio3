/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

import java.util.ArrayList;

/**
 *
 * @author jcgof
 */
public class Buses extends Transportes {

    protected ArrayList<Alumnos> listaA;
    protected int sillas;
    protected int capacidad;
    protected int max = listaA.size() + sillas + capacidad;

    public Buses() {
    }

    public Buses(ArrayList<Alumnos> listaA, int sillas, int capacidad) {
        this.listaA = listaA;
        this.sillas = sillas;
        this.capacidad = capacidad;
    }
    
    
    
    
}
