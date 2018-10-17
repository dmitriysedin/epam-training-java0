package lesson0.recuiredTasks.task3;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 */
public class Test {

    public static void main(String[] args) {

        double r1 = 2.0;
        double r2 = 1.5;

        System.out.println("Площадь кольца между окружностями с общим центром и радиусами " +
                r1 + " и " + r2 + " равна " + SquareOfRing.squareOfRing(r1, r2));
    }
}
