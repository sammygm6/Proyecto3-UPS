/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class vertice {
    private String nombre;
    private boolean visitado;

    public vertice() {
    }

    public vertice(String nombre) {
        this.nombre = nombre;
        this.visitado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}