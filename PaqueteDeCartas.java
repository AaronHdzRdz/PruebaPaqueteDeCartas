package PruebaPaqueteDeCartas;

public class PaqueteDeCartas {
    private Carta[] paquete;
    private int cartaActual;
    private static final int NUMERO_DE_CARTAS = 52;
    private static final String[] CARAS = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho",
        "Nueve", "Diez", "Joto", "Quina", "Rey" };
    private static final String[] PALOS = { "Corazones", "Diamantes", "Treboles", "Espadas" };

    public PaqueteDeCartas() {
        paquete = new Carta[NUMERO_DE_CARTAS];
        cartaActual = 0;

        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            paquete[cuenta] = new Carta(CARAS[cuenta % 13], PALOS[cuenta / 13]);
        }
    }

    public void barajar() {
        cartaActual = 0;

        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = (int) (Math.random() * NUMERO_DE_CARTAS);

            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }

    public Carta repartirCarta() {
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++];
        } else {
            return null;
        }
    }
}