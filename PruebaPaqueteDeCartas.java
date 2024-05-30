package PruebaPaqueteDeCartas;

public class PruebaPaqueteDeCartas {
    public static void main(String args[]) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();

        for (int i = 0; i < 13; i++) {
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                miPaqueteDeCartas.repartirCarta(),
                miPaqueteDeCartas.repartirCarta(),
                miPaqueteDeCartas.repartirCarta(),
                miPaqueteDeCartas.repartirCarta());
        }
    }
}