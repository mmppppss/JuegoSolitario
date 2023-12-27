package juegosolitario;

import javax.naming.ldap.Rdn;

/**
 *
 * @author meli
 */
public class Solitario {
/*atributos 
   pilas [5]*/
    Pila n1=new Pila();
    Pila n2=new Pila();
    Pila n3=new Pila();
    Pila n4=new Pila();
    Pila n5=new Pila();

    Pila cartasCorazon=new Pila();
    Pila cartasEspadas=new Pila();    
    Pila cartasTrebol=new Pila();
    Pila cartasDiamantes=new Pila();
    Pila baraja=new Pila();
    public Solitario() {
        int[] cartasCorazonNums=mesclar();
        int[] cartasEspadasNums=mesclar();
        int[] cartasDiamantesNums=mesclar();
        int[] cartasTrebolNums=mesclar();
        for (int i : cartasCorazonNums) {
            cartasCorazon.push("<3", i, "Rojo");
        }
        for (int i : cartasEspadasNums) {
            cartasEspadas.push("+", i, "Rojo");
        }
        for (int i : cartasDiamantesNums) {
            cartasDiamantes.push("*", i, "Negro");
        }
        for (int i : cartasTrebolNums) {
            cartasTrebol.push("%", i, "Negro");
        }
        baraja=BarajaMesclada();
    }
    public void mostrarBaraja(){
        while(!baraja.vacia()){
            Nodo aux= baraja.pop();
            System.out.println(aux.Simbolo+" "+ aux.numero +" "+aux.getColor());
        }
    }
    public int[] mesclar(){
        int cartas[]=new int[12];
        for (int i = 0; i < 12;) {
            int p=(int) (Math.random() * 12 + 1);
            boolean contains=false;
            for (int carta : cartas) {
                if(carta == p){
                    contains=true;
                }
            }
            if(!contains){
                cartas[i]=p;
                i++;
            }
        }
        return cartas;
    }
    public Pila BarajaMesclada(){
        Pila b=new Pila();
        Pila cartas[]={ cartasCorazon, cartasDiamantes,cartasEspadas,cartasTrebol};
        while(!cartas[0].vacia() || !cartas[1].vacia() || !cartas[2].vacia() || !cartas[3].vacia()){
            int ind=(int) (Math.random() * 4);
            System.out.println(ind);
            if(!cartas[ind].vacia()){
                Nodo carta=cartas[ind].pop();
                b.push(carta.getSimbolo(), carta.getNumero(), carta.getColor());
            }
        }
        return b;
    }
}
