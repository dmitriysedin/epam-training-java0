package practicaltasks.task2.exercise2;

/**
 * Created by Dmitriy Sedin on 21.10.2018.
 *
 * На прямоугольной декартовой системе координат на плоскости заданы три
 точки с соответствующими координатами в виде пары значений (x, y). Опре-
 делить, являются ли данные точки вершинами треугольника. И если да, то до-
 полнительно определить, является ли данный треугольник прямоугольным.
 */
public class TriangleDefinition {

    private static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        if(((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) == 0){
            return false;
        } else {
            return true;
        }
    }

    public static String isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3){

        if(isTriangle(x1, y1, x2, y2, x3, y3)){
            double a = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            double b = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
            double c = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);

            if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "It is a Right Triangle";
            } else {
                return "It is not a Right Triangle";
            }
        } else {
            return "It is not a Triangle";
        }
    }
}
