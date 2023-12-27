package juegosolitario;

/**
 *
 * @author meli
 */
public class JuegoSolitario {

    public static void main(String[] args) {
        Solitario juego=new Solitario();
        JFJuego solitario = new JFJuego(juego);
        solitario.setVisible(true);
    }   
}
