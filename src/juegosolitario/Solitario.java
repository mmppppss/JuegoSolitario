package juegosolitario;

import javax.naming.ldap.Rdn;

/**
 *
 * @author meli
 */
public class Solitario {
/*atributos 
   pilas [5]*/
    Pila ordCorazon= new Pila();
    Pila ordDiamante= new Pila();
    Pila ordTrebol= new Pila();
    Pila ordEspada= new Pila();
    
    Pila n1=new Pila();
    Pila n2=new Pila();
    Pila n3=new Pila();
    Pila n4=new Pila();
    Pila n5=new Pila();
    Pila columnas[]={n1, n2, n3, n4,  n5};
    
    Pila baraja=new Pila();
    
    public Solitario() {    
        baraja=BarajaMesclada();
        cargarPilas();
    }
    public void mostrarBaraja(){
        while(!baraja.vacia()){
            Nodo aux= baraja.pop();
            System.out.println(aux.Simbolo+" "+ aux.numero );
        }
    }
    public int[] mesclar(){
        int cartas[]=new int[12];
        for (int i = 0; i < 12;) {
            int p=(int) (Math.random() * 12 + 1);//6.3.6.9
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
        Pila cartasCorazon=new Pila();
        Pila cartasEspadas=new Pila();    
        Pila cartasTrebol=new Pila();
        Pila cartasDiamantes=new Pila();
        int[] cartasCorazonNums=mesclar();
        int[] cartasEspadasNums=mesclar();
        int[] cartasDiamantesNums=mesclar();
        int[] cartasTrebolNums=mesclar();
        for (int i : cartasCorazonNums)
            cartasCorazon.push("♥", i);
        for (int i : cartasEspadasNums) 
            cartasEspadas.push("♠", i);
        for (int i : cartasDiamantesNums)
            cartasDiamantes.push("♦", i);
        for (int i : cartasTrebolNums)
            cartasTrebol.push("♣", i);
        
        Pila b=new Pila();
        Pila cartas[]={ cartasCorazon, cartasDiamantes,cartasEspadas,cartasTrebol};
        while(!cartas[0].vacia() || !cartas[1].vacia() || !cartas[2].vacia() || !cartas[3].vacia()){
            int ind=(int) (Math.random() * 4);//1/3
            if(!cartas[ind].vacia()){
                Nodo carta=cartas[ind].pop();//saca un nodo
                b.push(carta);
            }
        }
        return b;
    }
    public void cargarPilas(){
        for(int i=0; i < 5; i++){
            for(int j=0; j<=i ; j++){
                columnas[i].push(baraja.pop());
            }
        }
    }
    
}
