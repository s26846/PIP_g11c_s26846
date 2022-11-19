import java.util.Random;
import java.util.Scanner;

public class Zadania3 {

    public static void main(String[] args) {
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
    }

    private static void zadanie2() {
        int zmienna1 = zwrocLiczbeZKonsoli("Wprowadz liczbe:");
        int zmienna2;
        if (zmienna1 < 1 || zmienna1 > 6) {
            System.out.println("Liczba powinna byc z przedzialu od 1 do 6");
        } else {
            zmienna2 = zwrocLosowaLiczbeZPrzedzialu(1, 6);
            if (zmienna1 == zmienna2) {
                System.out.println("Zmienna1 i zmienna2 sa rowne");
            } else {
                System.out.println("Zmienne nie są rowne");

            }
        }
    }

    private static void zadanie3() {
        int x = zwrocLiczbeZKonsoli("Wprowadz liczbe:");
        int y = zwrocLiczbeZKonsoli("Wprowadz liczbe:");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("zamieniam");
        int z = x;
        x = y;
        y = z;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    private static void zadanie4() {
        int x = zwrocLiczbeZKonsoli("Wprowadz liczbe:");
        int y = zwrocLiczbeZKonsoli("Wprowadz liczbe:");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("zamieniam");
        x = y + x;
        y = x - y;
        x = x - y;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    private static void zadanie5() {
        int liczba = zwrocLiczbeZKonsoli("Wprowadź 3-cyfrową liczbę całkowitą i naciśnij ENTER:");
        String liczbaString = String.valueOf(liczba);
        if (liczbaString.length() < 3) {
            System.out.println("Liczba powinna mieć co najmniej 3 cyfry");
        } else {
            int pierwszaCyfra = Character.getNumericValue(liczbaString.charAt(0));
            int drugaCyfra = Character.getNumericValue(liczbaString.charAt(1));
            int trzeciaCyfra = Character.getNumericValue(liczbaString.charAt(2));
            int suma = pierwszaCyfra + drugaCyfra + trzeciaCyfra;
            System.out.println(pierwszaCyfra + " + " + drugaCyfra + " + " + trzeciaCyfra + " = " + suma);
        }
    }

    private static int zwrocLiczbeZKonsoli(String wiadomosc) {
        System.out.println(wiadomosc);
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }


    private static int zwrocLosowaLiczbeZPrzedzialu(int min, int max) {
        int liczba = new Random().nextInt(max - min + 1) + min;
        System.out.println("Wylosowana liczba to: " + liczba);
        return liczba;
    }

}
