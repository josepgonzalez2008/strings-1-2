
public class Main {
    public static void main(String[] args) {
        String path = "home/user/index.html";

        int punto = path.lastIndexOf('.');
        int barra = path.lastIndexOf('/');

        String extension = path.substring(punto);
        String nombre = path.substring(barra + 1, punto);

        System.out.println("Extensión: " + extension);
        System.out.println("Nombre: " + nombre);
    }
}