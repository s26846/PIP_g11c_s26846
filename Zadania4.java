import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Zadania {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Zadania zadania = new Zadania();
        zadania.pierwsze();
        zadania.czwarte();
        zadania.piate();
        zadania.szoste();
        zadania.osme();
        zadania.osmeSwing();
        zadania.scanner.close();
    }

    private void pierwsze() {
        System.out.println("Zadanie 1");
        boolean czyPada = false;
        boolean czySwieciSlonce = false;
        String wynik;
        if (czyPada && !czySwieciSlonce) {
            wynik = "plucha";
        } else if (czyPada && czySwieciSlonce) {
            wynik = "tecza";
        } else if (!czyPada && czySwieciSlonce) {
            wynik = "slonecznie";
        } else if (!czyPada && !czySwieciSlonce) {
            wynik = "pochmurno";
        } else {
            wynik = null;
        }
        System.out.println(wynik);
    }

    private void czwarte() {
        System.out.println("Zadanie 4");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        String operacja = scanner.next();
        if (operacja.equals("ADD")) {
            int suma = a + b;
            System.out.println("Wynik: " + suma);
        } else if (operacja.equals("SUB")) {
            int roznica = a - b;
            System.out.println("Wynik: " + roznica);
        } else if (operacja.equals("MUL")) {
            int iloczyn = a * b;
            System.out.println("Wynik: " + iloczyn);
        } else if (operacja.equals("DIV")) {
            if (b == 0) {
                System.out.println("Nie mozna podzielic przez 0");
            } else {
                double iloraz = (double) a / b;
                System.out.println("Wynik: " + iloraz);
            }
        } else {
            System.out.println("Brak takiej operacji");
        }
    }

    private void piate() {
        System.out.println("Zadanie 5");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        String operacja = scanner.next();
        if (operacja.equals("ADD")) {
            int suma = absoluteValue(a + b);
            System.out.println("Wynik: " + suma);
        } else if (operacja.equals("SUB")) {
            int roznica = absoluteValue(a - b);
            System.out.println("Wynik: " + roznica);
        } else if (operacja.equals("MUL")) {
            int iloczyn = absoluteValue(a * b);
            System.out.println("Wynik: " + iloczyn);
        } else if (operacja.equals("DIV")) {
            if (b == 0) {
                System.out.println("Nie mozna podzielic przez 0");
            } else {
                double iloraz = absoluteValue((double) a / b);
                System.out.println("Wynik: " + iloraz);
            }
        } else {
            System.out.println("Brak takiej operacji");
        }
    }

    private void szoste() {
        System.out.println("Zadanie 6");
        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b < a) {
            double x = b;
            b = a;
            a = x;
        }
        System.out.printf("Wybrany przedział: [%f, %f]\n", a, b);
        Random random = new Random();
        double d1 = a + random.nextDouble(b - a);
        double d2 = a + random.nextDouble(b - a);
        double d3 = a + random.nextDouble(b - a);
        System.out.println("Wartości generowane losowo:");
        System.out.printf("%f\n", d1);
        System.out.printf("%f\n", d2);
        System.out.printf("%f\n", d3);
        double min = Math.min(d1, Math.min(d2, d3));
        double max = Math.max(d1, Math.max(d2, d3));
        double mid = d1 + d2 + d3 - min - max;
        System.out.printf("Gdzie: %f < %f < %f\n", min, mid, max);
    }

    private void osme() {
        System.out.println("Zadanie 8");
        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walute:\n" +
                "1 - PLN\n" +
                "2 - JPY");
        double kurs = 30.27;
        int waluta = scanner.nextInt();
        System.out.println("Wprowadź kwotę");
        double kwota = scanner.nextDouble();
        if (waluta == 1) {
            double wynik = kwota * kurs;
            System.out.printf("%f zł => %f ¥\n", kwota, wynik);
        } else if (waluta == 2) {
            double wynik = kwota / kurs;
            System.out.printf("%f ¥ => %f zł\n", kwota, wynik);
        }
    }

    private void osmeSwing() {
        JOptionPane.showMessageDialog(null, "Witamy w kantorze!\n");
        double kurs = 30.27;
        int waluta = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Wybierz walutę:\n" +
                        "1 - PLN\n" +
                        "2 - JPY")
        );
        double kwota = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Wprowadz kwote")
        );
        if (waluta == 1) {
            double wynik = kwota * kurs;
            JOptionPane.showMessageDialog(null, String.format("%f zł => %f ¥\n", kwota, wynik));
        } else if (waluta == 2) {
            double wynik = kwota / kurs;
            JOptionPane.showMessageDialog(null, String.format("%f ¥ => %f zł\n", kwota, wynik));
        }
    }

    private int absoluteValue(int liczba) {
        if (liczba < 0) {
            return liczba * -1;
        } else {
            return liczba;
        }
    }

    private double absoluteValue(double liczba) {
        if (liczba < 0) {
            return liczba * -1;
        } else {
            return liczba;
        }
    }

}
