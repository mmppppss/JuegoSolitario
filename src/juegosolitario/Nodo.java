package juegosolitario;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author meli
 */
public class Nodo implements Cloneable{
    String Simbolo;
    int numero;
    String color;
    Nodo link;
    static final Nodo TIERRA = null;
    public Nodo() {
        this.link=TIERRA;
    }
    public Nodo(String simbolo, int numero, String color, Nodo link){
        this.Simbolo=simbolo;
        this.color=color;
        this.numero=numero;
        this.link=link;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setSimbolo(String Simbolo) {
        this.Simbolo = Simbolo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    public String getColor() {
        return color;
    }

    public int getNumero() {
        return numero;
    }

    public String getSimbolo() {
        return Simbolo;
    }

    public Nodo getLink() {
        return link;
    }

    @Override
    protected Nodo clone() {
        try {
            return (Nodo)super.clone();
        } catch (Exception e) {
           Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, e);
        }
        return TIERRA;
    }
    
}

