package danycheong_11341019_lab8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

public class Pokemon implements Serializable{

    private String nombre, tipo1, tipo2;
    private int nivel, ataque, defensa, velocidad, ataque_especial, defensa_especial, rareza,hp;
    private ArrayList<Ataques> ataques = new ArrayList();
    private ImageIcon sprite;

    Random r = new Random();

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo1, String tipo2, int rareza, ImageIcon sprite,ArrayList<Ataques> ataques) {
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.nivel = 20 + r.nextInt(80);
        this.ataque = (2 + r.nextInt(2)) * this.nivel;
        this.defensa = (2 + r.nextInt(2)) * this.nivel;
        this.velocidad = (2 + r.nextInt(2)) * this.nivel;
        this.ataque_especial = (2 + r.nextInt(2)) * this.nivel;
        this.defensa_especial = (2 + r.nextInt(2)) * this.nivel;
        this.hp = (2 + r.nextInt(2))*this.nivel;
        this.ataques = ataques;
        this.rareza = rareza;
        this.sprite = sprite;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAtaque_especial() {
        return ataque_especial;
    }

    public void setAtaque_especial(int ataque_especial) {
        this.ataque_especial = ataque_especial;
    }

    public int getDefensa_especial() {
        return defensa_especial;
    }

    public void setDefensa_especial(int defensa_especial) {
        this.defensa_especial = defensa_especial;
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    public ArrayList<Ataques> getAtaques() {
        return ataques;
    }

    public void setAtaques(ArrayList<Ataques> ataques) {
        this.ataques = ataques;
    }

    public ImageIcon getSprite() {
        return sprite;
    }

    public void setSprite(ImageIcon sprite) {
        this.sprite = sprite;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + '}';
    }

    
    
}
