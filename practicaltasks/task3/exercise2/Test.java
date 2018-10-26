package practicaltasks.task3.exercise2;

/**
 * Created by Dmitriy Sedin on 26.10.2018.
 */
public class Test {

    public static void main(String[] args) {

        int testMaxNumber = 12345;
        System.out.println("Максимальная цифра в числе " + testMaxNumber + " = " +
                EffectiveAlgorithm.determineMaxNumber(12345));

        int testPalindrome = 1234321;
        System.out.println("Число " + testPalindrome + " является палиндромом  = " +
                EffectiveAlgorithm.isPalindrome(testPalindrome));

        int testPrimeNumber = 53;
        System.out.println("Число " + testPrimeNumber + " является простым  = " +
                EffectiveAlgorithm.isPrimeNumber(testPrimeNumber));

        int testPrimeNumberDivider = 123456;
        System.out.println("Простыми делителями числа " + testPrimeNumberDivider +
                " являются " + EffectiveAlgorithm.determineOfPrimeNumberDivider(testPrimeNumberDivider));

        int testGCD1 = 654321;
        int testGCD2 = 123456;
        System.out.println("НОД числа " + testGCD1 + " и числа " + testGCD2 + " является число " +
                EffectiveAlgorithm.calculationOfGCD(testGCD1, testGCD2));

        int testLCM1 = 654321;
        int testLCM2 = 123456;
        System.out.println("НОК числа " + testLCM1 + " и числа " + testLCM2 + " является число " +
                EffectiveAlgorithm.calculationOfLCM(testLCM1, testLCM2));

        int testDifferentNumber = 654442211;
        System.out.println("Количество различных цифр в числе " + testDifferentNumber + " = " +
                EffectiveAlgorithm.calculationOfDifferentNumber(testDifferentNumber));

    }
}
