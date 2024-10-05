import java.util.InputMismatchException;
import java.util.Scanner;


public class DatoveTypy {

    public static void u_o() {
        System.out.println("Výraz 6 + 4 = " + (6 + 4));
        System.out.println("Výraz \"\" + 6 + 4 = " + ("" + 6 + 4));
    }

    public static void u_i() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Zadejte byte hodnotu: ");
                int temp = scanner.nextInt();
                if (temp < Byte.MIN_VALUE || temp > Byte.MAX_VALUE) {
                    throw new Exception("Překročen rozsah hodnoty pro byte. Povolené hodnoty jsou od " + Byte.MIN_VALUE + " do " + Byte.MAX_VALUE + ".");
                }
                byte b = (byte) temp;
                System.out.println("Zadali jste byte: " + b);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Chyba: Neplatná hodnota pro byte.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Zadejte int hodnotu: ");
                long temp = scanner.nextLong();
                if (temp < Integer.MIN_VALUE || temp > Integer.MAX_VALUE) {
                    throw new Exception("Překročen rozsah hodnoty pro int. Povolené hodnoty jsou od " + Integer.MIN_VALUE + " do " + Integer.MAX_VALUE + ".");
                }
                int i = (int) temp;
                System.out.println("Zadali jste int: " + i);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Chyba: Neplatná hodnota pro int.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Zadejte long hodnotu: ");
                long l = scanner.nextLong();
                System.out.println("Zadali jste long: " + l);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Chyba: Neplatná hodnota pro long.");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Zadejte float hodnotu: ");
                float f = scanner.nextFloat();
                if (f < -Float.MAX_VALUE || f > Float.MAX_VALUE) {
                    throw new Exception("Překročen rozsah hodnoty pro float. Povolené hodnoty jsou od " + -Float.MAX_VALUE + " do " + Float.MAX_VALUE + ".");
                }
                System.out.println("Zadali jste float: " + f);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Chyba: Neplatná hodnota pro float.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Zadejte double hodnotu: ");
                double d = scanner.nextDouble();
                if (d < -Double.MAX_VALUE || d > Double.MAX_VALUE) {
                    throw new Exception("Překročen rozsah hodnoty pro double. Povolené hodnoty jsou od " + -Double.MAX_VALUE + " do " + Double.MAX_VALUE + ".");
                }
                System.out.println("Zadali jste double: " + d);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Chyba: Neplatná hodnota pro double.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Zadejte znak (char): ");
                String charInput = scanner.next();
                if (charInput.length() != 1) {
                    throw new Exception("Neplatná hodnota pro char. Musí být zadán přesně jeden znak.");
                }
                char c = charInput.charAt(0);
                System.out.println("Zadali jste znak: " + c);
                break;
            } catch (Exception e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Zadejte řetězec: ");
                String s = scanner.next();
                System.out.println("Zadali jste řetězec: " + s);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Chyba: Neplatná hodnota pro String.");
            }
        }
    }

    public static void u_ii() {
        byte byteValue = 10;
        int intValue = 100;
        long longValue = 1000L;
        float floatValue = (float) 3.14;
        double doubleValue = 2.71828;
        char charValue = 'A';
        String stringValue = "Ahoj Světe!";

        System.out.println("Deklarace a inicializace proměnných:");
        System.out.println("Byte: " + byteValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("String: " + stringValue);
    }

    public static String u_iii() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Zadej jméno: ");
        String firstName = scanner1.nextLine();
        System.out.print("Zadej příjmení: ");
        String lastName = scanner1.nextLine();

        String initials = String.valueOf(firstName.charAt(0)) + "." + String.valueOf(lastName.charAt(0));

        return firstName + " " + lastName + "\n" + initials.toUpperCase();

    }

    public static void u_vi_datovetypy() {

        /*
         * Popis formátovacích specifikátorů:
         * - %: Začátek formátovacího specifikátoru.
         * - -: Zarovnání vlevo.
         * - n: Maximální šířka sloupce (počet znaků, které se zobrazí).
         * - s: Typ dat - řetězec (string).
         * - d: Typ dat - celé číslo (integer).
         */

        System.out.println("Datové typy v jazyce Java:");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("| %-12s | %-15s | %-16s | %-16s | %-20s |\n",
                "Název", "Obalovací třída", "Velikost (bajty)", "Velikost (bity)", "Rozsah");
        System.out.println("---------------------------------------------------------------------------------------------");

        // Přidání datových typů
        System.out.printf("| %-12s | %-15s | %-16d | %-16d | %-20s |\n",
                "byte", "Byte", Byte.BYTES, Byte.BYTES * 8,
                Byte.MIN_VALUE + " až " + Byte.MAX_VALUE);

        System.out.printf("| %-12s | %-15s | %-16d | %-16d | %-20s |\n",
                "short", "Short", Short.BYTES, Short.BYTES * 8,
                Short.MIN_VALUE + " až " + Short.MAX_VALUE);

        System.out.printf("| %-12s | %-15s | %-16d | %-16d | %-20s |\n",
                "int", "Integer", Integer.BYTES, Integer.BYTES * 8,
                Integer.MIN_VALUE + " až " + Integer.MAX_VALUE);

        System.out.printf("| %-12s | %-15s | %-16d | %-16d | %-20s |\n",
                "long", "Long", Long.BYTES, Long.BYTES * 8,
                Long.MIN_VALUE + " až " + Long.MAX_VALUE);

        System.out.printf("| %-12s | %-15s | %-16d | %-16d | %-20s |\n",
                "float", "Float", Float.BYTES, Float.BYTES * 8,
                Float.MIN_VALUE + " až " + Float.MAX_VALUE);

        System.out.printf("| %-12s | %-15s | %-16d | %-16d | %-20s |\n",
                "double", "Double", Double.BYTES, Double.BYTES * 8,
                Double.MIN_VALUE + " až " + Double.MAX_VALUE);

        System.out.printf("| %-12s | %-15s | %-16d | %-16d | %-20s |\n",
                "char", "Character", Character.BYTES, Character.BYTES * 8, "'\\u0000' až '\\uffff'");

        System.out.println("---------------------------------------------------------------------------------------------");
    }

}
