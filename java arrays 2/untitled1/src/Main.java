
    public static void main(String[] args) {
        String cadena = "w3resource";
        String resultat;

        if (cadena.length() < 2) {
            resultat = "";
        } else {
            resultat = cadena.substring(0, 2) + cadena.substring(cadena.length() - 2);
        }

        System.out.println("'" + resultat + "'");
    }
