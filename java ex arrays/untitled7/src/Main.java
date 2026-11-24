import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.print("Introduce un texto (termina con un punto): ");
        String texto = llegir.nextLine().trim();
        int fin = texto.lastIndexOf('.');
        String sinPunto = (fin != -1) ? texto.substring(0, fin) : texto;
        String[] palabras = sinPunto.trim().isEmpty()
                ? new String[0]
                : sinPunto.trim().split(" ");
        String vocales = "aeiouáéíóúü";
        int numVocales = 0;
        String minusculas = texto.toLowerCase();
        for (int i = 0; i < minusculas.length(); i++) {
            if (vocales.indexOf(minusculas.charAt(i)) != -1) {
                numVocales++;
            }
        }

        System.out.println("Palabras: " + palabras.length);
        System.out.println("Vocales: " + numVocales);
    }
}