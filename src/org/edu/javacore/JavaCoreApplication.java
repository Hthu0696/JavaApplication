package org.edu.javacore;

import java.util.Scanner;

public class JavaCoreApplication {
    /**
     * Bài 1: Tính S(n) = 1 + 2 + 3 + … + n
     */
    private static int exercise01(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Bài 2: Tính S(n) = 1^2 + 2^2 + … + n^2
     */
    private static int exercise02(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            int pw = (int) Math.pow(i, 2);
            sum += pw;
        }
        return sum;
    }

    /**
     * Bài 3: Tính S(n) = 1 + ½ + 1/3 + … + 1/n
     */
    private static float exercise03(int number) {
        float sum = 0;
        for (int i = 1; i <= number; i++) {
            float temp = (float) 1 / i;
            sum += temp;
        }
        return sum;
    }

    /**
     * Bài 4: Tính S(n) = ½ + ¼ + … + 1/2n
     */
    private static float exercise04(int number) {
        float sum = 0;
        for (int i = 1; i <= number; i++) {
            float temp = (float) 1 / (2 * i);
            sum += temp;
        }
        return sum;
    }


    /**
     * Bài 5: Tính S(n) = 1 + 1/3 + 1/5 + … + 1/(2n + 1)
     */
    private static float exercise05(int number) {
        float sum = 1;
        for (int i = 1; i <= number; i++) {
            float temp = (float) 1 / ((2 * i) + 1);
            sum += temp;
        }
        return sum;
    }

    /**
     * Bài 6: Tính S(n) = 1/1×2 + 1/2×3 +…+ 1/n x (n + 1)
     */
    private static float exercise06(int number) {
        float sum = 0;
        for (int i = 1; i <= number; i++) {
            float temp = (float) 1 / (i * (i + 1));
            sum += temp;
        }
        return sum;
    }

    /**
     * Bài 7: Tính S(n) = ½ + 2/3 + ¾ + …. + n / n + 1
     */
    private static float exercise07(int number) {
        float sum = 0;
        for (int i = 1; i <= number; i++) {
            float temp = (float) i / (i + 1);
            sum += temp;
        }
        return sum;
    }

    /**
     * Bài 8: Tính S(n) = ½ + ¾ + 5/6 + … + 2n + 1/ 2n + 2
     */
    private static float exercise08(int number) {
        float sum = 0;
        for (int i = 0; i <= number; i++) {
            float temp = (float) ((2 * i) + 1) / ((2 * i) + 2);
            sum += temp;
        }
        return sum;
    }

    /**
     * Bài 9: Tính T(n) = 1 x 2 x 3…x N
     */
    private static double exercise09(int number) {
        double product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        return product;
    }

    /**
     * Bài 10: Tính T(x, n) = x^n
     */
    private static double exercise10(int x, int number) {
        return Math.pow(x, number);
    }

    /**
     * Bài 11: Tính S(n) = 1 + 1.2 + 1.2.3 + … + 1.2.3….N
     */
    private static int exercise11(int number) {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
            sum += product;
        }
        return sum;
    }


    /**
     * Bài 12: Tính S(n) = x + x^2 + x^3 + … + x^n
     */
    private static int exercise12(int x, int number) {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= (int) Math.pow(x, i);
            sum += product;
        }
        return sum;
    }

    /**
     * Bài 13: Tính S(n) = x^2 + x^4 + … + x^2n
     */
    private static int exercise13(int x, int number) {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= (int) Math.pow(x, (2 * i));
            sum += product;
        }
        return sum;
    }

    /**
     * Bài 14: Tính S(n) = x + x^3 + x^5 + … + x^2n + 1
     */
    private static int exercise14(int x, int number) {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= (int) Math.pow(x, ((2 * i) + 1));
            sum += product;
        }
        return sum;
    }

    /**
     * Bài 15: Tính S(n) = 1 + 1/1 + 2 + 1/ 1 + 2 + 3 + ….. + 1/ 1 + 2 + 3 + …. + N
     */
    private static float exercise15(int number) {
        float sum = 1;
        for (int i = 1; i <= number; i++) {
            int temp = exercise01(i);
            sum += (float) 1 / temp;
        }
        return sum;
    }

    /**
     * Bài 16: Tính S(n) = x + x^2/1 + 2 + x^3/1 + 2 + 3 + … + x^n/1 + 2 + 3 + …. + N
     */

    private static float exercise16(int x, int number) {
        float total = 0;
        for (int i = 1; i <= number; i++) {
            int temp = exercise12(x, i);
            int sum = exercise01(number);
            total += (float) temp / sum;
        }
        return total;
    }

    /**
     * Bài 17: Tính S(n) = x + x^2/2! + x^3/3! + … + x^n/N!
     */
    private static float exercise17(int x, int number) {
        float sum = 0, m = 1, temp = 1, i = 1;
        while (i <= number) {
            temp *= x;
            m *= i;
            sum += temp / m;
            i++;
        }
        return sum;
    }

    /**
     * Bài 18: Tính S(n) = 1 + x^2/2! + x^4/4! + … + x^2n/(2n)!
     */
    public static void main(String... agv) {

        int a = 10;
        int b = 5;
        double c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhap vao phan tu thu " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phan tu thu " + i + ": " + numbers[i]);
        }

        System.out.println("Nhap n");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        int sum = exercise01(number);
        System.out.println("S(" + number + ") " + "= " + sum);

        int sumPow = exercise02(number);
        System.out.println("S(" + number + ") " + "= " + sumPow);

        float sumPartN = exercise03(number);
        System.out.println("S(" + number + ") " + "= " + sumPartN);

        float sumPartTwoN = exercise04(number);
        System.out.println("S(" + number + ") " + "= " + sumPartTwoN);

        float sumPartTwoNPlusOne = exercise05(number);
        System.out.println("S(" + number + ") " + "= " + sumPartTwoNPlusOne);


        float sumPartNMultiNPlusOne = exercise06(number);
        System.out.println("S(" + number + ") " + "= " + sumPartNMultiNPlusOne);

        float sumNPartNPlusOne = exercise07(number);
        System.out.println("S(" + number + ") " + "= " + sumNPartNPlusOne);


        float sumTwoNPlusOnePartTwoNPlusTwo = exercise08(number);
        System.out.println("S(" + number + ") " + "= " + sumTwoNPlusOnePartTwoNPlusTwo);

        double product = exercise09(number);
        System.out.println("S(" + number + ") " + "= " + product);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhap x");
        int x = scanner2.nextInt();
        double xPowerN = exercise10(x, number);
        System.out.println(x + " ^ " + number + " = " + xPowerN);

        int sumProductN = exercise11(number);
        System.out.println("S(" + number + ") " + "= " + sumProductN);

        int sumXExponentialN = exercise12(x, number);
        System.out.println("S(" + number + ") " + "= " + sumXExponentialN);

        int sumXExponentialTwoN = exercise13(x, number);
        System.out.println("S(" + number + ") " + "= " + sumXExponentialTwoN);

        int sumXExponentialTwoNPlusOne = exercise14(x, number);
        System.out.println("S(" + number + ") " + "= " + sumXExponentialTwoNPlusOne);

        float sumOnePartExercise01 = exercise15(number);
        System.out.println("S(" + number + ") " + "= " + sumOnePartExercise01);

        float sumExercise13PartExercise01 = exercise16(x, number);
        System.out.println("S(" + number + ") " + "= " + sumExercise13PartExercise01);

        float sumExercise17 = exercise17(x, number);
        System.out.println("S(" + number + ") " + "= " + sumExercise17);
    }

}
