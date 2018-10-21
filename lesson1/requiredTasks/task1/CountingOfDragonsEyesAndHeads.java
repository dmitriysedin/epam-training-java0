package lesson1.requiredTasks.task1;

/**
 * Created by Dmitriy Sedin on 21.10.2018.
 * <p>
 * В молодом возрасте дракон каждый год отращивает по три головы, но после
 * того, как ему исполнится 200 лет – только по две, а после 300 лет – лишь по
 * одной. Предполагается, что дракон появляется на свет сразу с тремя головами.
 * <p>
 * Разработайте программу, которая высчитывала бы, сколько голов и глаз у дра-
 * кона, которому N лет?
 *
 */
public class CountingOfDragonsEyesAndHeads {
    public static final int headsBefore200Years = 3;
    public static final int headsAfter200Years = 2;
    public static final int headsAfter300Years = 1;

    public static int countingOfDragonsHeads(int years) {

        int result;

        if (years <= 200) {
            result = 3 + years * headsBefore200Years;
        } else {
            if (years > 200 && years <= 300) {
                result = 3 + 200 * headsBefore200Years + (years - 200) * headsAfter200Years;
            } else {
                result = 3 + 200 * headsBefore200Years + 100 * headsAfter200Years + (years - 300) * headsAfter300Years;
            }
        }
        return result;
    }

    public static int countingOfDragonsEyes(int years) {

        return countingOfDragonsHeads(years) * 2;
    }
}

