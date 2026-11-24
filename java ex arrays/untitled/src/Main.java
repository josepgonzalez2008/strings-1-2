
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = llegir.nextLine();

        if (texto.isEmpty()) {
            System.out.println("Texto vacío. Fin del programa.");
            return;
        }

        System.out.print("Introduce una palabra a buscar: ");
        String palabra = llegir.nextLine();

        if (texto.contains(palabra)) {
            System.out.println("La palabra '" + palabra + "' SÍ se encuentra en el texto.");
        } else {
            System.out.println("La palabra '" + palabra + "' NO se encuentra en el texto.");
        }
    }
}