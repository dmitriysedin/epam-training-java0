package lesson0.requiredTasks.task3;

/**
 * Created by Dmitriy Sedin on 16.10.2018.
 * <p>
 * На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
 * Разработайте программу нахождения площади кольца, внешний радиус которого равен R1,
 * а внутренний радиус равен R2.
 */
public class SquareOfRing {

    public static double computeSquareOfRing(double r1, double r2) {

        return Math.PI * (r1 * r1 - r2 * r2);
    }
}
