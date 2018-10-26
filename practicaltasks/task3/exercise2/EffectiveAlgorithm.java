package practicaltasks.task3.exercise2;

import java.util.*;

/**
 * Created by Dmitriy Sedin on 25.10.2018.
 * <p>
 * Разработать наиболее эффективные алгоритмы и написать код для решения
 * следующих задач:
 * найти наибольшую цифру натурального числа;
 * проверить, является ли заданное натуральное число палиндромом;
 * определить является ли заданное натуральное число простым;
 * найти все простые делители заданного натурального числа;
 * найти НОД и НОК двух натуральных чисел a и b.
 * найти количество различных цифр у заданного натурального числа.
 */
public class EffectiveAlgorithm {

        public static int determineMaxNumber(int number) {
        int max = 0;
        int temp;
        while (number > 0) {
            if (max < (temp = number % 10)) {
                max = temp;
            }
            number /= 10;
        }
        return max;
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int temp = number;
        while (temp > 0) {
            reverseNumber *= 10;
            reverseNumber += temp % 10;
            temp /= 10;
        }
        return reverseNumber == number;
    }

    public static boolean isPrimeNumber(int number) {
        boolean result = true;
        for (int i = 2; i <= number >> 1; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }

        }
        return result;
    }


    public static List<Integer> determineOfPrimeNumberDivider(int number) {

        List<Integer> primeNumberDivider = new ArrayList<Integer>();

        for (int i = 2; i <= number >> 1; i++) {
            if (number % i == 0 && isPrimeNumber(i)) {
                primeNumberDivider.add(i);
            }
        }
        return primeNumberDivider;
    }

    public static int calculationOfGCD(int a, int b) {

        if (a == 0) {
            return a;
        }
        if (b == 0) {
            return b;
        }
        if (a == b) {
            return b;
        }
        if (a == 1 || b == 1) {
            return 1;
        }

        boolean evenA = (a & 1) == 0;
        boolean evenB = (b & 1) == 0;

        if (evenA && evenB) {
            return calculationOfGCD(a >> 1, b >> 1) << 1;
        }

        if (evenA) {
            return calculationOfGCD(a >> 1, b);
        }

        if (evenB) {
            return calculationOfGCD(a, b >> 1);
        }

        if (a > b) {
            return calculationOfGCD((a - b) >> 1, b);
        }

        return calculationOfGCD((b - a) >> 1, a);


    }

    public static int calculationOfLCM(int a, int b) {

        return Math.abs(a * b) / calculationOfGCD(a, b);
    }

    public static int calculationOfDifferentNumber(int number) {

        Set<Integer> mySet = new HashSet<Integer>();

        while (number > 0) {
            int a = number % 10;
            mySet.add(a);
            number /= 10;
        }
        return mySet.size();
    }
}
