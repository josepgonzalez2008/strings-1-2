import java.util.Scanner;

public class Main {
    static void main() {
        Scanner llegeix = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = llegeix.nextLine();

        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println(invertido);
    }
}