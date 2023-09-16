import java.util.Scanner;
public class Leche implements IngredienteAdicional {
    private Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescription() {
        return bebida.getDescription() + ", Leche";
    }

    public double costo() {
        return bebida.costo() + 2.0; // Costo adicional de la leche
    }
}