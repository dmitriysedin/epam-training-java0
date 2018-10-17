package lesson0.recuiredTasks.task1;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 * <p>
 * Масса динозавра задаётся в килограммах.
 * Разработайте программу, которая вычисляет,
 * сколько это миллиграмм, грамм и тонн.
 */
public class ConvertKgToMgGTn {

    public static final int kgToMg = 1000000;

    public static final int kgToGr = 1000;

    public static final int kgToTn = 1000;

    public static double convertKgToMg(double kg) {
        return kg * kgToMg;
    }

    public static double convertKgToG(double kg) {
        return kg * kgToGr;
    }

    public static double convertKgToTn(double kg) {
        return kg / kgToTn;
    }
}
