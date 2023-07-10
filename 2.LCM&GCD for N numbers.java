import java.io.*;
import java.util.Scanner;

class lcmgcdforn{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int lcm = calculateLCM(numbers);
        int gcd = calculateGCD(numbers);

        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }

    private static int calculateLCM(int[] numbers) {
        int lcm = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            lcm = calculateLCM(lcm, numbers[i]);
        }

        return lcm;
    }

    private static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    private static int calculateGCD(int[] numbers) {
        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = calculateGCD(gcd, numbers[i]);
        }

        return gcd;
    }

    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
    }
}