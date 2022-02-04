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
public class Persona {
    protected String nombre;
    protected int identidad;
    protected Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, int identidad, Date nacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre="
                + nombre + ", " + "identidad=" + 
                identidad + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
    
    
}
