package lesson0.recuiredTasks.task6;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 * <p>
 * Написать программу, которая переворачивает
 * положительное семизначное число
 * (к примеру, число 1234567 переворачивает в число 7654321).
 */
public class ReverseOfNumber {

    public static final int million = 1000000;
    public static final int hundredThousand = 1000000;
    public static final int tenThousand = 10000;
    public static final int thousand = 1000;
    public static final int hundred = 100;
    public static final int ten = 10;

    public static int reverseOfNumbers(int number) {

        int number1 = number % 10 * million;
        int number2 = (number /= 10) % 10 * hundredThousand;
        int number3 = (number /= 10) % 10 * tenThousand;
        int number4 = (number /= 10) % 10 * thousand;
        int number5 = (number /= 10) % 10 * hundred;
        int number6 = (number /= 10) % 10 * ten;
        int number7 = (number /= 10) % 10;


        return number1 + number2 + number3 + number4 + number5 + number6 + number7;
    }
}
