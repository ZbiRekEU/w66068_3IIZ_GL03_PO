import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class L1 {

    private static int wpisz() {
        System.out.println("Wpisz liczbę:");
        return (new Scanner(System.in)).nextInt();
    }

    public static void zad1() {
        System.out.println("Rafal, 26 lat");
    }

    public static void zad2() {
        System.out.println("Suma dwóch numerów.");
        int[] numbers = new int[]{wpisz(), wpisz()};

        int a = numbers[0];
        int b = numbers[1];

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
    }

    public static boolean zad3(int num) {
        return num % 2 == 0;
    }

    public static boolean zad4(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }

    public static double zad5(double num) {
        return Math.pow(num, 3.0);
    }

    public static double zad6(double num) {
        return Math.pow(num, num);
    }


    public static boolean zad7() {
        int[] range = new int[]{wpisz(), wpisz()};
        int N = 3;
        int[] numbers = new int[N];
        Random random = new Random();

        int r;
        for (r = 0; r < N; ++r) {
            numbers[r] = random.nextInt(range[1] - range[0] + 1) + range[0];
        }

        Arrays.sort(numbers);
        int[] sortedNumbers = numbers;
        int sortedLength = numbers.length;

        for (int i = 0; i < sortedLength; ++i) {
            System.out.print(sortedNumbers[i]);
            System.out.print(", ");
        }

        boolean isTriangle = false;

        if (numbers[0] * numbers[0] + numbers[1] * numbers[1] == numbers[2] * numbers[2]) {
            isTriangle = true;
        }

        return isTriangle;
    }


}
