import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.print("Introdueix una cadena: ");
        String cadena = llegir.nextLine();

        System.out.println("La longitud és: " + cadena.length());
    }
}