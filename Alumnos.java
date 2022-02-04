/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author jcgof
 */
public class Alumnos extends Persona{
    
    protected int id;
    protected ArrayList<Clases> lista;

    public Alumnos() {
    }

    public Alumnos(int id, ArrayList<Clases> lista, String nombre, int identidad, Date nacimiento) {
        super(nombre, identidad, nacimiento);
        this.id = id;
        this.lista = lista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Clases> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Clases> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumnos{" + "id=" + id + ", lista=" + lista + '}';
    }
    
    
    
    
}
