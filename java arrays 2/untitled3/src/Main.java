public class Main {
    public static void main(String[] args) {
        String[] paraules = {"sol", "programació", "java", "cadena", "ordinador", "text"};

        String llarga = paraules[0];
        for (int i = 1; i < paraules.length; i++) {
            if (paraules[i].length() > llarga.length()) {
                llarga = paraules[i];
            }
        }

        System.out.println("La paraula més llarga és: " + llarga);
        System.out.println("Longitud: " + llarga.length());
    }
}
