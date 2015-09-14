import java.util.ArrayList;

public class Grafo {
    private ArrayList aristas;

    public Grafo() {
    }

    public ArrayList getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList aristas) {
        this.aristas = aristas;
    }
    
    public void addArista(arista arista){
        aristas.add(arista);
    }
    
    /////camino mas corto Dijkstra
}
