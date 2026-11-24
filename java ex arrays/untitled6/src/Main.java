import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase = "Forrest Gump";
        Scanner llegeix = new Scanner(System.in);
        char[] oculta = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                oculta[i] = ' ';
            } else {
                oculta[i] = '*';
            }
        }
        oculta[0] = frase.charAt(0);
        System.out.println(new String(oculta));

        for (int intento = 1; intento <= 3; intento++) {
            System.out.print("Intento " + intento + "/3. Sugiere una letra: ");
            String entrada = llegeix.nextLine().toLowerCase();
            if (entrada.isEmpty()) {
                continue;
            }
            char letra = entrada.charAt(0);
            for (int i = 0; i < frase.length(); i++) {
                if (Character.toLowerCase(frase.charAt(i)) == letra) {
                    oculta[i] = frase.charAt(i);
                }
            }
            System.out.println(new String(oculta));
            if (new String(oculta).equals(frase)) {
                System.out.println("¡Has acertado la frase!");
                return;
            }
        }
        System.out.println("Fin de los intentos. La frase era: " + frase);
    }
}