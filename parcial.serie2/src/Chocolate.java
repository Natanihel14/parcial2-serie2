import java.util.Scanner;
public class Chocolate implements IngredienteAdicional {
    private Bebida bebida;

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescription() {
        return bebida.getDescription() + ", Chocolate";
    }

    public double costo() {
        return bebida.costo() + 3.0; // Costo adicional del chocolate
    }
}