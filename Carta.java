package PruebaPaqueteDeCartas;

public class Carta {
    private String cara; // valor de la cara de la carta ("As", "Dos", ...)
    private String palo; // palo de la carta ("Corazones", "Diamantes", ...)

    public Carta(String cara, String palo) {
        this.cara = cara;
        this.palo = palo;
    }

    public String toString() {
        return cara + " de " + palo;
    }
}