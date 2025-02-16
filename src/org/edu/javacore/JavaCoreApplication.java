package org.edu.javacore;

import java.util.Scanner;

import static java.lang.Math.*;

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
            product *= (int) pow(x, ((2 * i) + 1));
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
        int sum = 1, i = 1, m, n = 1;
        int temp = 1;
        while (i <= number) {
            temp *= (int) pow(x, (2 * i));
            m = 2 * i;
            n = n * factorial(m);
            if (n != 0) {
                sum = (sum + temp) / n;
            }
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
            temp *= (int) pow(x, ((2 * i) + 1));
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
        sum = (float) sqrt(2);
        int i = 2;
        while (i <= number) {
            sum = (float) sqrt(2 + sum);
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
            sum = (float) sqrt(i + sum);
            i++;
        }
        return sum;
    }

    /**
     * Bài 35 Tính S(n)= √(1+√(2+√(3+⋯√(n-1+√n) ) ) ) có n dấu căn .
     */
    private static float exercise35(int number) {
        float sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += (float) sqrt(i);
        }
        return sum;
    }

    /**
     * Bài 36: Tính S(n)=√(n!+√((n-1)!+√((n-2)!+⋯+√(2!+√1!) ) ) ) có n dấu căn.
     */
    private static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    private static float exercise36(int number) {
        float sum = 0;
        for (; number > 0; number--) {
            sum = (float) sqrt(factorial(number) + sum);
        }
        return sum;
    }

    /**
     * Bài 37: Tính S(n) = CanBac N(N + CanBac N – 1(N – 1 + ... + CanBac3(3 + CanBac2(2))) có n – 1 dấu căn
     */
    private static float exercise37(int number) {
        do {
            if (number < 2) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 2);
        float sum = 0, i = 2;
        while (i <= number) {
            sum = (float) pow(i + sum, 1.0 / i);
            i++;
        }
        return sum;
    }

    /**
     * Bài 38: Tính S(n) = CanBac N + 1(N + CanBac N(N – 1 +...+CanBac3(2 + CanBac2(1)))) có n dấu căn
     */
    private static float exercise38(int number) {
        do {
            if (number < 2) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 2);
        float sum = 0, i = 2;
        while (i <= number) {
            sum = (float) pow(i + sum, 1.0 / (i + 1));
            i++;
        }
        return sum;
    }

    /**
     * Bài 39: Tính S(n) = CanBac N + 1(N! + CanBacN((N – 1)! + ... + CanBac3(2!CanBac2(1!))) có n dấu căn
     */
    private static float exercise39(int number) {
        do {
            if (number < 1) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 1);
        float sum = 0, i = 2, j = 1, fac = 1;
        while (i <= number) {
            fac *= j;
            sum = (float) pow(fac + sum, 1.0 / i);
            i++;
            j++;

        }
        return sum;
    }

    /**
     * Bài 40: Tính S(n) = CanBac2(x^n + CanBac2(x^n-1 + ... + CanBac2(x^2 + CanBac2(x)))) có n dấu căn
     */
    private static float exercise40(int number, int x) {
        do {
            if (x < 0) {
                System.out.println("Please re-enter x");
                Scanner scanner = new Scanner(System.in);
                x = scanner.nextInt();
            }
        } while (x < 0);

        do {
            if (number < 1) {
                System.out.println("Please re-enter n");
                Scanner scanner01 = new Scanner(System.in);
                number = scanner01.nextInt();
            }
        } while (number < 1);
        int i = 1;
        float temp = 1, sum = 0;
        while (i <= number) {
            temp *= x;
            sum = (float) sqrt(temp + sum);
            i++;
        }
        return sum;
    }

    /**
     * Bài 41: Tính S(n) = 1 / (1 + 1 / ( 1 + 1 / (.... 1 + 1 / 1 + 1))) có n dấu phân số
     */
    private static float exercise41(int number) {
        float sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = (float) (1 + 1.0 / sum);
        }
        return sum;
    }

    /**
     * Bài 42: Cho n là số nguyên dương. Hãy tìm giá trị nguyên dương k lớn nhất sao cho S(k) &lt; n. Trong đó chuỗi k được định nghĩa như sau: S(k) = 1 + 2 + 3... + k
     */
    private static void exercise42(int number) {
        float sum = 0;
        int i = 0;
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        while (sum + i < number) {
            i++;
            sum += i;
        }
        System.out.println("The max value S(k) = 1 + ... + k < n " + sum);
    }

    /**
     * Bài 43: Hãy đếm số lượng chữ số của số nguyên dương n
     */
    private static int exercise43(int number) {
        do {
            if (number <= 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number <= 0);
        int temp;
        int count = 0;
        temp = number;
        if (number == 0) {
            count = 1;
        }
        while (temp != 0) {

            count++;
            temp /= 10;
        }
        return count;
    }

    /**
     * Bài 44: Hãy tính tổng các chữ số của số nguyên dương n
     */
    private static int exercise44(int number) {
        int sum = 0, temp;
        while (number != 0) {
            temp = number % 10;
            sum += temp;
            number /= 10;
        }
        return sum;
    }

    /**
     * Bài 45: Hãy tính tích các chữ số của số nguyên dương n
     */
    private static int exercise45(int number) {
        int multi = 1, temp;
        while (number != 0) {
            temp = number % 10;
            multi *= temp;
            number /= 10;
        }
        return multi;
    }

    /**
     * Bài 46: Hãy đếm số lượng chữ số lẻ của số nguyên dương n
     */

    private static int exercise46(int number) {
        do {
            if (number <= 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number <= 0);
        int count = 0;
        while (number != 0) {
            int temp = number % 10;
            if (temp % 2 == 1) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    /**
     * Bài 47: Hãy tính tổng các chữ số chẵn của số nguyên dương n
     */
    private static int exercise47(int number) {
        do {
            if (number <= 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number <= 0);
        int sum = 0;
        while (number != 0) {
            int temp = number % 10;
            if (temp % 2 == 0) {
                sum += temp;
            }
            number /= 10;
        }
        return sum;
    }

    /**
     * Bài 48: Hãy tính tích các chữ số lẻ của số nguyên dương n
     */
    private static int exercise48(int number) {
        do {
            if (number <= 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number <= 0);
        int multi = 1;
        while (number != 0) {
            int temp = number % 10;
            if (temp % 2 == 1) {
                multi *= temp;
            }
            number /= 10;
        }
        return multi;
    }

    /**
     * Bài 49: Cho số nguyên dương n. Hãy tìm chữ số đầu tiên của n
     */
    private static int exercise49(int number) {
        do {
            if (number <= 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number <= 0);
        int temp = number, max;
        max = temp % 10;
        return max;
    }

    /**
     * Bài 50: Hãy tìm số đảo ngược của số nguyên dương n
     */
    private static int exercise50(int number) {
        do {
            if (number <= 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number <= 0);
        int reverse = 0, temp;
        while (number > 0) {
            temp = number % 10;
            reverse = reverse * 10 + temp;
            number /= 10;
        }
        return reverse;
    }

    /**
     * Bài 51: Tìm chữ số lớn nhất của số nguyên dương n
     */
    private static int exercise51(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        int temp, max = 0;
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    /**
     * Bài 52: Tìm chữ số nhỏ nhất của số nguyên dương n
     */
    private static int exercise52(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        int temp, min = number;
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    /**
     * Bài 53: Hãy đếm số lượng chữ số lớn nhất của số nguyên dương n
     */
    private static int exercise53(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        int max = 0;
        int temp = number, count = 0;
        while (number != 0) {
            int sum = number % 10;
            if (max < sum) {
                max = sum;
            }
            number /= 10;
        }
        while (temp != 0) {
            int tmp = temp % 10;
            if (tmp == max) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    /**
     * Bài 54: Hãy đếm số lượng chữ số nhỏ nhất của số nguyên dương n
     */
    private static int exercise54(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        int min = number;
        int temp = number, count = 0;
        while (number != 0) {
            int sum = number % 10;
            if (sum < min) {
                min = sum;
            }
            number /= 10;
        }
        while (temp != 0) {
            int tmp = temp % 10;
            if (tmp == min) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    /**
     * Bài 55: Hãy dếm số lượng chữ số đầu tiên của số nguyên dương n
     */
    private static int exercise55(int number) {
        do {
            if (number <= 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number <= 0);
        int temp = number, max, count = 0;
        max = temp % 10;
        while (temp != 0) {
            int tmp = temp % 10;
            if (tmp == max) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    /**
     * Bài 56: Hãy kiểm tra số nguyên dương n có toàn chữ số lẻ hay không
     */
    private static boolean exercise56(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        boolean check = true;
        while (number != 0) {
            if ((number % 10) % 2 == 0) {
                check = false;
                break;
            }
            number /= 10;
        }
        return check;
    }

    /**
     * Bài 57:Hãy kiểm tra số nguyên dương n có tao2n chữ số chẵn hay không?
     */
    private static boolean exercise57(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        boolean check = true;
        while (number != 0) {
            if ((number % 10) % 2 == 1) {
                check = false;
                break;
            }
            number /= 10;
        }
        return check;
    }

    /**
     * Bài 58:Hãy kiểm tra số nguyên dương n có tao2n chữ số chẵn hay không?
     */
    private static boolean exercise58(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        boolean check = true;
        while (number != 0) {
            if ((number % 10) % 2 == 1) {
                check = false;
                break;
            }
            number /= 10;
        }
        return check;
    }

    /**
     * Bài 59: Hãy kiểm tra s nguyên dương n có đối xứng hay không?
     */
    private static boolean exercise59(int number) {
        int sum = 0, temp, tmp;
        for (temp = number; number != 0; number = number / 10) {
            tmp = number % 10;
            sum = sum * 10 + tmp;
        }
        if (temp == sum) {
            return true;
        }
        return false;

    }

    /**
     * Bài 60: Hãy kiểm tra các chữ số nguyên dương n có tăng tần từ trái sang phải hay không
     */
    private static boolean exercise60(int number) {
        do {
            if (number < 0) {
                System.out.println("Please re-enter n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
            }
        } while (number < 0);
        boolean isAscending = true;
        int temp = number;

        int endNumber = temp % 10;
        temp /= 10;
        while (temp != 0) {
            int beforeEndNumber = temp % 10;
            temp /= 10;
            if (endNumber < beforeEndNumber) {
                isAscending = false;
                break;
            } else {
                endNumber = beforeEndNumber;
            }
        }
        if (isAscending) {
            return true;
        }

        return false;
    }

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

        float sumSqrtOfTheExercise35 = exercise35(number);
        System.out.println("S(" + number + ") = " + sumSqrtOfTheExercise35);

        float sumFactorial = exercise36(number);
        System.out.println("S(" + number + ") = " + sumFactorial);

        float sumExercise37 = exercise37(number);
        System.out.println("S(" + number + ") = " + sumExercise37);

        float sumExercise38 = exercise38(number);
        System.out.println("S(" + number + ") = " + sumExercise38);

        float sumExercise39 = exercise39(number);
        System.out.println("S(" + number + ") = " + sumExercise39);

        float sumExercise40 = exercise40(number, x);
        System.out.println("S(" + number + ") = " + sumExercise40);

        float sumExercise41 = exercise41(number);
        System.out.println("S(" + number + ") = " + sumExercise41);

        exercise42(number);

        float countOfDivisors = exercise43(number);
        System.out.println("Count Numerical digit " + number + ": " + countOfDivisors);

        int sumNumericalDigit = exercise44(number);
        System.out.println("Sum Numerical digit " + number + ": " + sumNumericalDigit);

        int multiNumericalDigit = exercise45(number);
        System.out.println("Multi Numerical digit " + number + ": " + multiNumericalDigit);

        int countOddNumericalDigit = exercise46(number);
        System.out.println("Count Odd Numerical Digit " + number + ": " + countOddNumericalDigit);

        int sumParityNumericalDigit = exercise47(number);
        System.out.println("sum Parity numerical digit " + number + ": " + sumParityNumericalDigit);

        int multiOddNumericalDigit = exercise48(number);
        System.out.println("Multi Odd Numerical digit " + number + ": " + multiOddNumericalDigit);

        int firstUpNumericalDigit = exercise49(number);
        System.out.println("first Up Numerical Digit " + number + ": " + firstUpNumericalDigit);

        int reverseNumericalDigit = exercise50(number);
        System.out.println("first Up Numerical Digit " + number + ": " + reverseNumericalDigit);

        int maximumNumericalDigit = exercise51(number);
        System.out.println("maximum Numerical Digit " + number + ": " + maximumNumericalDigit);

        int minimumNumericalDigit = exercise52(number);
        System.out.println("minimum Numerical Digit " + number + ": " + minimumNumericalDigit);

        int countMaximumNumericalDigit = exercise53(number);
        System.out.println("count Maximum Numerical Digit " + number + ": " + countMaximumNumericalDigit);

        int countMinimumNumericalDigit = exercise54(number);
        System.out.println("count minimum Numerical Digit " + number + ": " + countMinimumNumericalDigit);

        int countFirstUpNumericalDigit = exercise55(number);
        System.out.println("count First Up Numerical Digit " + number + ": " + countFirstUpNumericalDigit);

        boolean checkOddNumericalDigit = exercise56(number);
        System.out.println("The Odd Numerical Digit " + number + ": " + checkOddNumericalDigit);

        boolean checkParityNumericalDigit = exercise57(number);
        System.out.println("The Parity Numerical Digit " + number + ": " + checkParityNumericalDigit);

        boolean checkParityNumerical = exercise58(number);
        System.out.println("The Parity Numerical Digit " + number + ": " + checkParityNumerical);

        boolean checkPalindrome = exercise59(number);
        System.out.println(number + "is a palindrome true or false: " + checkPalindrome);

        boolean checkAscending = exercise60(number);
        System.out.println(number + " has ascending from left to right (true or false) " + checkAscending);
    }

}
