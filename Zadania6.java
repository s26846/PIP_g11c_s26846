import java.util.Random;
import java.util.Scanner;

public class Zadania6 {

    public static void main(String[] args) {

        //pierwsze
        int[] genArr = generateArray();
        printArray(genArr);


        //drugie
        int[] sortedArr = sortArray(genArr);
        printArray(sortedArr);

        //trzecie
        int[] revArr = reverse(sortedArr);
        printArray(revArr);

        //czwarte
        System.out.println(equalsReverse(sortedArr, revArr));


    }

    public static int[] generateArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj liczbe calkowita");
        int n = scan.nextInt();
        int[] arr = new int[n];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }
        return arr;
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                int tmp = 0;
                if (x[i] > x[j]) {
                    tmp = x[j];
                    x[j] = x[i];
                    x[i] = tmp;
                }

            }
        }
        return x;
    }

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean equalsReverse(int[] x, int[] y) {
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (y[i] != x[x.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
