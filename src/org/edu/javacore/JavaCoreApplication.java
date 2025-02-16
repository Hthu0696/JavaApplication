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
            int pw = (int) pow(i, 2);
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
        return pow(x, number);
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
            product *= (int) pow(x, i);
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
            product *= (int) pow(x, (2 * i));
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
    private static float exercise18(int x, int number) {
        int sum = 1, i = 1, temp = 1, m = 1;
        while (i <= number) {
            temp *= (int) Math.pow(x, (2 * i));
            m *= 2 * i;
            sum += temp / m;
            i++;
        }
        return sum;
    }

    /**
     * Bài 19: Tính S(n) = 1 + x + x^3/3! + x^5/5! + … + x^(2n+1)/(2n+1)!
     */
    private static float exercise19(int x, int number) {
        int sum = 1, i = 1, temp = 1, m = 1;
        while (i <= number) {
            temp *= (int) Math.pow(x, ((2 * i) + 1));
            m *= (2 * i) + 1;
            sum += temp / m;
            i++;
        }
        return sum;
    }

    /**
     * Bài 20: Liệt kê tất cả các “ước số” của số nguyên dương n
     */
    private static void exercise20(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        System.out.print("List all the divisors of positive integers " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    /**
     * Bài 21: Tính tổng tất cả các “ ước số” của số nguyên dương n
     */
    private static int exercise21(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Bài 22:Tính tích tất cả các “ước số” của số nguyên dương n
     */
    private static int exercise22(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int multi = 1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                multi *= i;
            }
        }
        return multi;
    }

    /**
     * Bài 23: Đếm số lượng “ước số” của số nguyên dương n
     */
    private static int exercise23(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Bài 24: Liệt kê tất cả các “ước số lẻ” của số nguyên dương n
     */
    private static void exercise24(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        System.out.print("List all the odd divisors of positive integers " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i % 2 == 1) {
                    System.out.print(i + "\t");
                }
            }
        }
    }

    /**
     * Bài 25: Tính tổng tất cả các “ước số chẵn” của số nguyên dương n
     */
    private static int exercise25(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    /**
     * Bài 26: Tính tích tất cả các “ước số lẻ” của số nguyên dương n
     */
    private static int exercise26(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int multi = 1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i % 2 == 1) {
                    multi *= i;
                }
            }
        }
        return multi;
    }

    /**
     * Bài 27: Đếm số lượng “ước số chẵn” của số nguyên dương n
     */
    private static int exercise27(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Bài 28: Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó
     */
    private static int exercise28(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Bài 29: Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất là 25
     */
    private static void exercise29(int number) {
        do {
            if (number <= 0) {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Please re-enter n");
            }
        } while (number <= 0);

        int max = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i % 2 == 1) {
                    if (i > max) {
                        max = i;
                    }
                }
            }
        }
        System.out.println("the largest odd divisor of positive integers " + number + ":\t" + max);
    }

    /**
     * Bài 30: Cho số nguyên dương n. Kiểm tra xem n có phải là số hoàn thiện hay không
     */
    private static boolean exercise30(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    /**
     * Bài 31: Cho số nguyên dương n. Kiểm tra xem n có phải là số nguyên tố hay không
     */
    private static boolean exercise31(int number) {
        if (number == 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Bài 32: Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
     */
    private static boolean exercise32(int number) {
        for (int i = 0; i * i <= number; ++i) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * Bài 33: Tính S(n) = CanBac2(2+CanBac2(2+….+CanBac2(2 + CanBac2(2)))) có n dấu căn
     */
    private static float exercise33(int number) {
        float sum;
        do {
            if (number < 1) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 1);
        sum = (float) Math.sqrt(2);
        int i = 2;
        while (i <= number) {
            sum = (float) Math.sqrt(2 + sum);
            i++;
        }
        return sum;
    }

    /**
     * Bài 34: Tính S(n) = CanBac2(n+CanBac2(n – 1 + CanBac2( n – 2 + … + CanBac2(2 + CanBac2(1) có n dấu căn
     */
    private static float exercise34(int number) {
        float sum = 0;
        do {
            if (number < 1) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 1);
        int i = 1;
        while (i <= number) {
            sum = (float) Math.sqrt(i + sum);
            i++;
        }
        return sum;
    }

    /**
     * Bài 35 Tính S(n)= √(1+√(2+√(3+⋯√(n-1+√n) ) ) ) có n dấu căn .
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

        float sumExercise18 = exercise18(x, number);
        System.out.println("S(" + number + ") " + "= " + sumExercise18);

        float sumExercise19 = exercise19(x, number);
        System.out.println("S(" + number + ") " + "= " + sumExercise19);

        exercise20(number);

        int totalDivisor = exercise21(number);
        System.out.println("\nTotal divisor of " + number + ": \t" + totalDivisor);

        int multiplyTheDivisors = exercise22(number);
        System.out.println("Multiply the divisors " + number + ": \t" + multiplyTheDivisors);

        int countTheDivisors = exercise23(number);
        System.out.println("Count the divisors " + number + ": \t" + countTheDivisors);

        exercise24(number);

        int sumAllTheEvenDivisorsOfPositive = exercise25(number);
        System.out.println("\nSumming up all the even divisors of positive integers " + number + ": \t" + sumAllTheEvenDivisorsOfPositive);

        int multiplyAllTheEvenDivisorsOfPositive = exercise26(number);
        System.out.println("Summing up all the odd divisors of positive integers " + number + ": \t" + multiplyAllTheEvenDivisorsOfPositive);

        int countTheEvenDivisorNumber = exercise27(number);
        System.out.println("Count the even divisor number of positive integers " + number + ": \t" + countTheEvenDivisorNumber);

        int sumOfDivisorsLessThanN = exercise28(number);
        System.out.println("Sum of divisors less than " + number + ": \t" + sumOfDivisorsLessThanN);

        exercise29(number);

        boolean isCheckPerfectNumber = exercise30(number);
        System.out.println("The " + number + " is Perfect number true or false: " + isCheckPerfectNumber);

        boolean isPrimeNumber = exercise31(number);
        System.out.println("The " + number + " is prime number true or false: " + isPrimeNumber);

        boolean isSquareNumber = exercise32(number);
        System.out.println("The " + number + " is Square number true or false: " + isSquareNumber);

        float sumSqrtNumber = exercise33(number);
        System.out.println("S(" + number + ") = " + sumSqrtNumber);

        float sumSqrtOfTheExercise34 = exercise34(number);
        System.out.println("S(" + number + ") = " + sumSqrtOfTheExercise34);
    }

}
