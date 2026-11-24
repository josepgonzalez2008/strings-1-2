import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo",
                "La clave secreta del universo", "Mi universo", "Patria",
                "De mayor quiero ser feliz", "Empieza por los zapatos"};

        Scanner llegir = new Scanner(System.in);
        System.out.print("Introduce una palabra o palabras del título: ");
        String busqueda = llegir.nextLine().toLowerCase();

        boolean encontrado = false;
        System.out.println("Resultados:");
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].toLowerCase().contains(busqueda)) {
                System.out.println(" - " + catalogo[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ningún libro.");
        }
    }
}