public class arista {
    private int peso;
    private vertice anterior;
    private vertice siguiente;

    public arista() {
    }

    public arista(int peso, vertice anterior, vertice siguiente) {
        this.peso = peso;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public vertice getAnterior() {
        return anterior;
    }

    public void setAnterior(vertice anterior) {
        this.anterior = anterior;
    }

    public vertice getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(vertice siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return Integer.toString(peso);
    }
    
    
}
