package task1.exercise4;

import java.util.Random;

/**
 * Created by Dmitriy Sedin on 23.10.2018.
 * <p>
 * Напишите программу «Mood Sensor» (эмулировать датчика настроения), кото-
 * рая «залазит» в душу пользователя и определяет его настроение в текущий
 * момент времени. Приложение будет генерировать случайное число, в зави-
 * симости от значения которого на экран выводится одно из псевдографических
 * «лиц», которое и будет отображать настроение пользователя.
 */
public class MoodSensor {

    public static String moodDisplay() {

        String mood = "";

        Random random = new Random();

        switch (random.nextInt(10)) {

            case 0:
                mood = ":)))";
                break;
            case 1:
                mood = ":-)";
                break;
            case 2:
                mood = ":-(";
                break;
            case 3:
                mood = ";-)";
                break;
            case 4:
                mood = ":-D";
                break;
            case 5:
                mood = ":-/";
                break;
            case 6:
                mood = ":-*";
                break;
            case 7:
                mood = "O_O";
                break;
            case 8:
                mood = "^_^";
                break;
            case 9:
                mood = ">_<";
                break;
        }

        return mood;
    }
}
