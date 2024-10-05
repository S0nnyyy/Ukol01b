public class ZnakText {

    public static void main(String[] args) {
        char znak = 'A';
        TiskInfoZnak(znak);
        System.out.println(DejTabulkuASCII());
    }

    public static void TiskInfoZnak(char z) {
        System.out.println(DejInfoZnak(z));
    }

    public static String DejInfoZnak(char z) {
        int ascii = z;
        return "Znak: " + z + "\nASCII kód (dekadicky): " + ascii + "\nASCII kód (hexadecimálně): " + Integer.toHexString(ascii);
    }

    public static void tiskASCII() {
        System.out.println(DejTabulkuASCII());
    }

    public static String DejTabulkuASCII() {
        StringBuilder sb = new StringBuilder();
        sb.append("ASCII tabulka:\n");
        sb.append("-----------------------------------------------------------------------------------------------------------\n");
        sb.append("| Znak | ASCII (dekadicky)  | ASCII (hexadecimálně)  | Znak | ASCII (dekadicky)  | ASCII (hexadecimálně)  |\n");
        sb.append("-----------------------------------------------------------------------------------------------------------\n");

        for (char pismeno = 'A'; pismeno <= 'Z'; pismeno++) {
            int ascii = pismeno;
            sb.append(String.format("|   %c  |         %d         |           %s           |", pismeno, ascii, Integer.toHexString(ascii)));
            int asciiLower = Character.toLowerCase(pismeno);
            sb.append(String.format("   %c  |         %d         |           %s           |\n", asciiLower, asciiLower, Integer.toHexString(asciiLower)));
        }

        sb.append("------------------------------------------------------------------------------------------------------------\n");

        for (char cislo = '0'; cislo <= '9'; cislo++) {
            int ascii = cislo;
            sb.append(String.format("|   %c  |         %d         |           %s           |\n", cislo, ascii, Integer.toHexString(ascii)));
        }

        sb.append("------------------------------------------------------\n");
        return sb.toString();
    }
}
