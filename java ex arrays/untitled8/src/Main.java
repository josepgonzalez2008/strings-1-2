import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] alumnos = {"Paula", "Santiago", "Pascual", "Jorge", "Saul", "Enrique"};
        Scanner llegeix = new Scanner(System.in);

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i]);
            if (i < alumnos.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        System.out.print("¿Qué posición quieres cambiar? ");
        int pos = llegeix.nextInt();
        llegeix.nextLine();

        if (pos >= 0 && pos < alumnos.length) {
            System.out.println("Nombre actual: " + alumnos[pos]);
            System.out.print("Nuevo nombre: ");
            alumnos[pos] = llegeix.nextLine();

            for (int i = 0; i < alumnos.length; i++) {
                System.out.print(alumnos[i]);
                if (i < alumnos.length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        } else {
            System.out.println("La posición " + pos + " no existe.");
        }
    }
}