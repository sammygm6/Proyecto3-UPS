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
    private nodo nave;

    public vertice() {
    }

    public vertice(nodo nave) {
        this.nave = nave;
    }

    public nodo getNave() {
        return nave;
    }

    public void setNave(nodo nave) {
        this.nave = nave;
    }

    @Override
    public String toString() {
        return "vertice{" + "nave=" + nave.toString() + '}';
    }
    
    
}
