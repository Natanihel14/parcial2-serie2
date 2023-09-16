import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bebida bebida = null;

        System.out.println("Seleccione una bebida:");
        System.out.println("1. Café");
        System.out.println("2. Té");

        int opcionBebida = scanner.nextInt();

        if (opcionBebida == 1) {
            bebida = new Cafe();
        } else if (opcionBebida == 2) {
            bebida = new Te();
        } else {
            System.out.println("Opción no válida.");
            System.exit(0);
        }

        while (true) {
            System.out.println("¿Desea agregar un ingrediente adicional?");
            System.out.println("1. Leche");
            System.out.println("2. Chocolate");
            System.out.println("3. Canela");
            System.out.println("4. Finalizar pedido");

            int opcionIngrediente = scanner.nextInt();

            if (opcionIngrediente == 1) {
                bebida = new Leche(bebida);
            } else if (opcionIngrediente == 2) {
                bebida = new Chocolate(bebida);
            } else if (opcionIngrediente == 3) {
                bebida = new Canela(bebida);
            } else if (opcionIngrediente == 4) {
                break; // Finalizar el proceso de selección de ingredientes
            } else {
                System.out.println("Opción no válida.");
            }
        }

        System.out.println("Pedido: " + bebida.getDescription());
        System.out.println("Costo total: Q" + bebida.costo());
    }
}