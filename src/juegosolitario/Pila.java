package juegosolitario;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author meli
 * 
 */
public class Pila {
    Nodo Cabeza;

    public Pila() {
        Cabeza=Nodo.TIERRA;
    }
    public void push(String Simbolo, int numero){
        Nodo aux=new Nodo(Simbolo, numero, Cabeza);
        Cabeza=aux;
    }
    public void push(Nodo aux){
        aux.setLink(Cabeza);
        Cabeza = aux;
    }
    public Nodo pop(){
        if(Cabeza==Nodo.TIERRA){
            System.err.print("pila vacia");
            return Cabeza;
        }
        Nodo aux=Cabeza.clone();
        Cabeza=Cabeza.link; 
        return aux;
    }
    //return el nultimp elemento sin eliminarlo
    public Nodo showCabeza(){
        return Cabeza.clone();
    }
    public boolean vacia(){
        return Cabeza.link==Nodo.TIERRA;
    }
    public int cant(){
        Nodo aux=Cabeza;
        int cont=-1;
        while(aux!=Nodo.TIERRA){
            aux=aux.getLink();
            cont++;
        }
        return cont;
    }
    public void mostrar(){
        Nodo aux=Cabeza;
        String cad="P->";
        while(aux!=Nodo.TIERRA){
            cad=cad.concat("["+aux.Simbolo+" "+aux.numero);
            aux=aux.getLink();
        }
        System.out.println(cad);
    }
}
