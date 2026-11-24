import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = llegir.nextLine();

        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
    }
}