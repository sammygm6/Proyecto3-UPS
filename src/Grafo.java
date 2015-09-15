import java.util.ArrayList;

public class Grafo {
    private ArrayList aristas;
    private ArrayList Nombres;

    public Grafo() {
    }

    public ArrayList getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList aristas) {
        this.aristas = aristas;
        for (int i = 0; i < aristas.size(); i++) {
            String NombreIzquierdo = ((arista)aristas.get(i)).getAnterior().getNave().getNombre();
            String NombreDerecho = ((arista)aristas.get(i)).getSiguiente().getNave().getNombre();
            if (!NombreRepetido(Nombres,NombreIzquierdo)) {
                Nombres.add(NombreIzquierdo);
            }
            if (!NombreRepetido(Nombres,NombreDerecho)) {
                Nombres.add(NombreDerecho);
            }
        }
    }
    
    public void addArista(arista arista){
        aristas.add(arista);
        String NombreIzquierdo = arista.getAnterior().getNave().getNombre();
        String NombreDerecho = arista.getSiguiente().getNave().getNombre();
        if (!NombreRepetido(Nombres,NombreIzquierdo)) {
            Nombres.add(NombreIzquierdo);
        }
        if (!NombreRepetido(Nombres,NombreDerecho)) {
            Nombres.add(NombreDerecho);
        }
    }
    public int getSize(){
        return aristas.size();
    }
    public boolean NombreRepetido(ArrayList Nombres,String nombre){
        for (int i = 0; i < Nombres.size(); i++) {
            if (nombre.equals(Nombres.get(i))) {
                return true;
            }
        }
        return false;
    }
    /////camino mas corto Dijkstra
}
