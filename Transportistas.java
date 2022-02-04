/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

import java.util.Date;

/**
 *
 * @author jcgof
 */
public class Transportistas extends Persona{
    protected int aniosExp;
    protected String apodo;

    public Transportistas() {
    }

    public Transportistas(int aniosExp, String apodo, String nombre, int identidad, Date nacimiento) {
        super(nombre, identidad, nacimiento);
        this.aniosExp = aniosExp;
        this.apodo = apodo;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return super.toString() + "aniosExp=" + aniosExp + ", apodo=" + apodo + '}';
    }
    
    
    
    
    
    
}
