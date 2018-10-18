package lesson0.recuiredTasks.task5;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 */
public class Test {

    public static void main(String[] args) {

        int number = 123456;

        System.out.println("Среднее арифметическое числа " + number + " = " + AverageAndGeometricMean.averageCalculation(number));

        System.out.println("Среднее геометрическое числа " + number + " = " + AverageAndGeometricMean.geometricMeanCalculation(number));
    }
}
