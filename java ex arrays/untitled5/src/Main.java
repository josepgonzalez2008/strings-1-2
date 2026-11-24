import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.println("cual de estos no es un tipo primitivo en java");
        System.out.println("a) int");
        System.out.println("b) char");
        System.out.println("c) boolean");
        System.out.println("d) string");
        System.out.print("Respuesta: ");
        String respuesta = llegir.nextLine().trim().toLowerCase();

        if (!(respuesta.equals("a") || respuesta.equals("b")
                || respuesta.equals("c") || respuesta.equals("d"))) {
            System.out.println("Respuesta no válida. Fin del programa.");
        } else if (respuesta.equals("d")) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta era la b.");
        }
    }
}