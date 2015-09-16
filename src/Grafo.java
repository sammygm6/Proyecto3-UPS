
import java.util.ArrayList;

public class Grafo {

    private ArrayList<arista> aristas = new ArrayList();
    private ArrayList Nombres = new ArrayList();

    public Grafo() {
    }

    public ArrayList getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList aristas) {
        this.aristas = aristas;
        for (int i = 0; i < aristas.size(); i++) {
            String NombreIzquierdo = ((arista) aristas.get(i)).getAnterior().getNombre();
            String NombreDerecho = ((arista) aristas.get(i)).getSiguiente().getNombre();
            if (!NombreRepetido(Nombres, NombreIzquierdo)) {
                Nombres.add(NombreIzquierdo);
            }
            if (!NombreRepetido(Nombres, NombreDerecho)) {
                Nombres.add(NombreDerecho);
            }
        }
    }

    public void addArista(arista viene_arista) {
        //this.aristas.add(viene_arista);
        String NombreIzquierdo = viene_arista.getAnterior().getNombre();
        String NombreDerecho = viene_arista.getSiguiente().getNombre();
        if (!NombreRepetido(Nombres, NombreIzquierdo)) {
            Nombres.add(NombreIzquierdo);
        }
        if (!NombreRepetido(Nombres, NombreDerecho)) {
            Nombres.add(NombreDerecho);
        }
        aristas.add(viene_arista);
    }

    public int getSize() {
        return aristas.size();
    }

    public boolean NombreRepetido(ArrayList Nombres, String nombre) {
        for (int i = 0; i < Nombres.size(); i++) {
            if (nombre.equals(Nombres.get(i))) {
                return true;
            }
        }
        return false;
    }

    public ArrayList getNombres() {
        return Nombres;
    }

    public boolean ModificarArista(String nombre1, String nombre2, String nombre1_nuevo, String nombre2_nuevo, int peso) {
        for (int i = 0; i < aristas.size(); i++) {
            String NOMBRE1 = aristas.get(i).getAnterior().getNombre();
            String NOMBRE2 = aristas.get(i).getSiguiente().getNombre();
            if (nombre1.equals(NOMBRE1) && nombre2.equals(NOMBRE2)) {
                vertice vertice1_nuevo = new vertice(nombre1_nuevo);
                vertice vertice2_nuevo = new vertice(nombre2_nuevo);
                aristas.get(i).setAnterior(vertice1_nuevo);
                aristas.get(i).setSiguiente(vertice2_nuevo);
                aristas.get(i).setPeso(peso);
                return true;
            }
        }
        return false;
    }

    public boolean EliminarArista(String nombre1, String nombre2) {
        for (int i = 0; i < aristas.size(); i++) {
            String NOMBRE1 = aristas.get(i).getAnterior().getNombre();
            String NOMBRE2 = aristas.get(i).getSiguiente().getNombre();
            if (nombre1.equals(NOMBRE1) && nombre2.equals(NOMBRE2)) {
                aristas.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean WARP(String nombre1, String nombre2){
        for (int i = 0; i < aristas.size(); i++) {
            String NOMBRE1 = aristas.get(i).getAnterior().getNombre();
            String NOMBRE2 = aristas.get(i).getSiguiente().getNombre();
            if (nombre1.equals(NOMBRE1) && nombre2.equals(NOMBRE2)) {
                aristas.get(i).setPeso(0);
                return true;
            }
        }
        return false;
    }
    /////camino mas corto Dijkstra
    public void getDijkstra(String nombre1, String nombre2){
        vertice origen = new vertice(nombre1);
        vertice destino = new vertice(nombre2);
        
    }
}
