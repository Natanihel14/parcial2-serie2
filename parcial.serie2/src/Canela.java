import java.util.Scanner;
public class Canela implements IngredienteAdicional {
    private Bebida bebida;

    public Canela(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescription() {
        return bebida.getDescription() + ", Canela";
    }

    public double costo() {
        return bebida.costo() + 0.5; // Costo adicional de la canela
    }
}
