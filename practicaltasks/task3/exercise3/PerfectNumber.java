package practicaltasks.task3.exercise3;

/**
 * Created by Dmitriy Sedin on 26.10.2018.
 * <p>
 * Натуральное число называют совершенным, если оно равно сумме всех
 * своих делителей, не считая только его самого (например, 28=1+2+3+7+14 –
 * совершенное число). Напишите программу, которая проверяет, является ли
 * введённое натуральное число совершенным. Для проверки работоспособно-
 * сти программы приводится список некоторых совершенных чисел: 6, 28, 496,
 * 8128.
 */
public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        int sumOfDivider = 0;

        for (int i = 1; i <= number >> 1; i++) {
            if (number % i == 0) {
                sumOfDivider += i;
            }
        }
        return sumOfDivider == number;
    }
}
