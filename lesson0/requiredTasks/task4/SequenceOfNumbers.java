package lesson0.requiredTasks.task4;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 * <p>
 * Разработайте программу, которая проверяет,
 * что цифры положительного четырёхзначного числа
 * образуют возрастающую (убывающую) последовательность
 * (к примеру, число 1357 удовлетворяет условию,
 * т.к. его цифры соответствуют следующему
 * неравенству: 1 < 3 < 5 < 7, т.е. идут в порядке возрастания).
 */
public class SequenceOfNumbers {

    public static boolean isDescendingOrIncreasingSequensOfNambers(int number) {

        int number1 = number % 10;
        int number2 = (number /= 10) % 10;
        int number3 = (number /= 10) % 10;
        int number4 = (number /= 10) % 10;

        return number1 < number2 && number2 < number3 && number3 < number4 ||
                number1 > number2 && number2 > number3 && number3 > number4;
    }
}
