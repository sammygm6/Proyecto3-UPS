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
            String NombreIzquierdo = ((arista)aristas.get(i)).getAnterior().getNombre();
            String NombreDerecho = ((arista)aristas.get(i)).getSiguiente().getNombre();
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
        String NombreIzquierdo = arista.getAnterior().getNombre();
        String NombreDerecho = arista.getSiguiente().getNombre();
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
    
    public String[] getNombres(){
        String[] nombres = null;
        for (int i = 0; i < Nombres.size(); i++) {
            nombres[i] = Nombres.get(i).toString();
        }
        return nombres;
    }
    /////camino mas corto Dijkstra
}
