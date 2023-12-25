/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        Pila baraja=new Pila();
        for(int i = 0; i<48; i++){
            int simbolo=(int) (Math.random() * 4 + 1);
            Nodo carta=Nodo.TIERRA;
            if(simbolo==1){
                if(cartasCorazon.vacia())
                    simbolo=2;
                carta = cartasCorazon.pop();
            }
            if(simbolo==2){
                if(cartasEspadas.vacia())
                    simbolo=3;
                carta = cartasEspadas.pop();
            }
            if(simbolo==3){
                if(cartasDiamantes.vacia())
                    simbolo=4;
                carta = cartasDiamantes.pop();
            }
            if(simbolo==4){
                if(cartasTrebol.vacia())
                    simbolo=1;
                carta = cartasTrebol.pop();
            }
            baraja.push(carta.getSimbolo(), carta.getNumero(), carta.getColor());
            i++;
        }
        return baraja;
    }
}
