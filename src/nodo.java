
import java.awt.Image;

public class nodo {
    private String nombre;
    private Image imagen;
    
    public nodo() {
    }

    public nodo(String nombre) {
        this.nombre = nombre;
    }

    public nodo(String nombre, Image imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }
    
    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
