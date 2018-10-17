package lesson0.recuiredTasks.task7;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 * <p>
 * Разработайте небольшую цельную программу,
 * которая меняет местами содержимое двух целочисленных переменных a и b,
 * не используя для этого дополнительных переменных.
 */
public class ChangeNumbers {

    public static int changeNumberA(int a, int b) {
        b ^= a ^= b;
        a ^= b;

        return a;
    }

    public static int changeNumberB(int a, int b) {
        b ^= a ^= b;
        a ^= b;

        return b;
    }
}
