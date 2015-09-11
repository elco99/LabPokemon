
package danycheong_11341019_lab8;

import java.io.Serializable;


public class Objeto implements Serializable{
    private String nombre;
    private int cantidad;

    public Objeto() {
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
        this.cantidad = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Objeto{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
}
