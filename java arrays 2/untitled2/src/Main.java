public class Main {
    public static String afegirIng(String s) {
        if (s.length() < 3) {
            return s;
        }
        if (s.endsWith("ing")) {
            return s + "ly";
        }
        return s + "ing";
    }

    public static void main(String[] args) {
        System.out.println(afegirIng("abc"));    // abcing
        System.out.println(afegirIng("string")); // stringly
        System.out.println(afegirIng("ab"));     // ab
    }
}