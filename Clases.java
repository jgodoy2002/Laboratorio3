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
public class Clases {
    protected String clase;
    protected int codigo;
    
    public Clases(){
        
    }

    public Clases(String clase, int codigo) {
        this.clase = clase;
        this.codigo = codigo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Clases{" + "clase=" + clase + ", codigo=" + codigo + '}';
    }
    
     
    
}
