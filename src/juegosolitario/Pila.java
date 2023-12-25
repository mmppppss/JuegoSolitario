package juegosolitario;

/**
 *
 * @author meli
 */
public class Pila {
    Nodo Cabeza;

    public Pila() {
        Cabeza=Nodo.TIERRA;
    }
    public void push(String Simbolo, int numero, String color){
        Nodo aux=new Nodo(Simbolo, numero, color, Cabeza);
        Cabeza=aux;
    }
    public Nodo pop(){
        Nodo aux=Cabeza.clone();
        Cabeza=Cabeza.link; 
        return aux;
    }
    public Nodo showCabeza(){
        return Cabeza.clone();
    }
    public boolean vacia(){
        return Cabeza==Nodo.TIERRA;
    }
    
}
