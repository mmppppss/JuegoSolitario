package juegosolitario;

/**
 *
 * @author meli
 */
public class JuegoSolitario {

    public static void main(String[] args) {
       /* JFJuego solitario = new JFJuego();
        solitario.setVisible(true);*/
        Solitario x=new Solitario();
        System.out.println(x.baraja.cant());
        x.mostrarBaraja();
    }   
}
