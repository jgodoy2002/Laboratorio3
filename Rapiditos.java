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
public class Rapiditos extends Transportes{
    protected int sillas;
    protected ArrayList<Alumnos> listaA;
    protected int max;

    public Rapiditos() {
    }

    public Rapiditos(int sillas, ArrayList<Alumnos> listaA, String placa, Color color, ArrayList<Estaciones> estaciones) {
        super(placa, color, estaciones);
        this.sillas = sillas;
        this.listaA = listaA;
        if(sillas>=listaA.size()){
            this.max=sillas;
        }
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public ArrayList<Alumnos> getListaA() {
        return listaA;
    }

    public void setListaA(ArrayList<Alumnos> listaA) {
        this.listaA = listaA;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return super.toString()+ "Rapiditos{" + "sillas=" + sillas + ", listaA=" + listaA + ", max=" + max + '}';
    }
    
    
    
    
    
    
    
    
    
}
