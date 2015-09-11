
package danycheong_11341019_lab8;


public class Ataques {
    private String nombre,tipo;
    private int pp,poder,precision;

    public Ataques() {
    }

    public Ataques(String nombre, String tipo, int pp, int poder, int precision) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.pp = pp;
        this.poder = poder;
        this.precision = precision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
