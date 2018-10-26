package practicaltasks.task3.exercise1;

import java.util.Random;

/**
 * Created by Dmitriy Sedin on 25.10.2018.
 *
 * Необходимо написать программу «Heads or Tails?» («Орёл или решка?»), кото-
 * рая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
 * сколько раз выпал орёл, а сколько – решка.
 */
public class HeadsOrTails {

    public static String countingHeadsAndTails(int numberOfToss){

        int countOfHeads = 0;
        Random random = new Random();

        for(int i = 0; i < numberOfToss; i++){
            if(random.nextInt(numberOfToss) >> 1 == 0) {
                countOfHeads++;
            }
        }

        int countOfTails = numberOfToss - countOfHeads;

        return "Number of Heads = " + countOfHeads + ", number of Tails = " + countOfTails;
    }
}
