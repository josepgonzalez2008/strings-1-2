import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo",
                "La clave secreta del universo", "Mi universo", "Patria",
                "De mayor quiero ser feliz", "Empieza por los zapatos"};

        Scanner llegir = new Scanner(System.in);
        System.out.print("Introduce el título del libro: ");
        String titulo = llegir.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].equalsIgnoreCase(titulo)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El libro existe en el catálogo.");
        } else {
            System.out.println("El libro no existe en el catálogo.");
        }
    }
}