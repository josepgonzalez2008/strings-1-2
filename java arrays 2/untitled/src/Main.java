public static void main(String[] args) {
        String cadena = "google.com";
        String vistos = "";
        String resultat = "{";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (vistos.indexOf(c) == -1) {
                vistos = vistos + c;

                int cont = 0;
                for (int j = 0; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == c) {
                        cont++;
                    }
                }}}}