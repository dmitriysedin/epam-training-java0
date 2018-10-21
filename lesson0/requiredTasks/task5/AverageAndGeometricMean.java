package lesson0.requiredTasks.task5;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 * <p>
 * Написать программу, которая находит арифметическое
 * и геометрическое среднее цифр положительного шестизначного числа.
 */
public class AverageAndGeometricMean {

    public static final int numberOfDigits = 6;

    public static double averageCalculation(int number) {

        int sum = number % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;

        return sum / numberOfDigits;
    }

    public static double geometricMeanCalculation(int number) {

        int multiple = number % 10;
        multiple *= (number /= 10) % 10;
        multiple *= (number /= 10) % 10;
        multiple *= (number /= 10) % 10;
        multiple *= (number /= 10) % 10;
        multiple *= (number /= 10) % 10;


        return Math.pow(multiple, (1.0 / numberOfDigits));
    }
}
