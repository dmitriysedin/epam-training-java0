package lesson0.recuiredTasks.task1;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 */
public class Test {

    public static void main(String[] args) {

        double massOfDino = 1.0;

        System.out.println("Масса динозавра массой " + massOfDino + " килограмм в милиграммах составляет " +
                ConvertKgToMgGTn.convertKgToMg(massOfDino) + " милиграмм");

        System.out.println("Масса динозавра массой " + massOfDino + " килограмм в граммах составляет " +
                ConvertKgToMgGTn.convertKgToG(massOfDino) + " грамм");

        System.out.println("Масса динозавра массой " + massOfDino + " килограмм в тоннах составляет " +
                ConvertKgToMgGTn.convertKgToTn(massOfDino) + " тонн");
    }
}
