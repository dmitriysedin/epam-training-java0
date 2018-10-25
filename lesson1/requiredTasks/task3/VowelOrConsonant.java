package lesson1.requiredTasks.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Dmitriy Sedin on 21.10.2018.
 *
 * Напишите программу, которая бы определяла, является ли введённая буква
 (символ) гласной (постарайтесь сделать данное задание всеми возможными и
 невозможными способами; не обращайте внимание на запреты требования).
 */

public class VowelOrConsonant {

    public static boolean isVowelOrConsonantLetter(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' ||ch =='u' || ch == 'y' ||
        ch == 'A' || ch == 'E' || ch == 'O' ||ch == 'I' || ch == 'U' || ch == 'Y') {
            return true;
        } else {
            return false;
        }
    }
}


class VowelOrConsonant0 {

    static final List<Character> vowell = new ArrayList<Character>();

    public static boolean isVowelOrConsonantLetter(char ch){

        vowell.add('a');
        vowell.add('e');
        vowell.add('o');
        vowell.add('i');
        vowell.add('u');
        vowell.add('y');
        vowell.add('A');
        vowell.add('E');
        vowell.add('O');
        vowell.add('I');
        vowell.add('U');
        vowell.add('Y');

        if(vowell.contains(ch)){
            return true;
        } else {
            return false;
        }
    }
}


class VowelOrConsonant2 {

    static final List<Character> alphabet = new ArrayList<Character>();

    static final int numberOfVowelsLetters = 12;

    public static boolean isVowelOrConsonantLetter(char ch) {

        alphabet.add('a');
        alphabet.add('e');
        alphabet.add('o');
        alphabet.add('i');
        alphabet.add('u');
        alphabet.add('y');
        alphabet.add('A');
        alphabet.add('E');
        alphabet.add('O');
        alphabet.add('I');
        alphabet.add('U');
        alphabet.add('Y');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('z');
        alphabet.add('B');
        alphabet.add('C');
        alphabet.add('D');
        alphabet.add('F');
        alphabet.add('G');
        alphabet.add('H');
        alphabet.add('J');
        alphabet.add('K');
        alphabet.add('L');
        alphabet.add('M');
        alphabet.add('N');
        alphabet.add('P');
        alphabet.add('Q');
        alphabet.add('R');
        alphabet.add('S');
        alphabet.add('T');
        alphabet.add('V');
        alphabet.add('W');
        alphabet.add('X');
        alphabet.add('Z');

        boolean b = false;
        for (int i = 0; i < alphabet.size(); i++) {

            if (alphabet.get(i).equals(ch) && i < numberOfVowelsLetters - 1) {
                b = true;
            }
        }
        return b;
    }
}

class VowelOrConsonant3 {

    public static boolean isVowelOrConsonantLetter(char ch) {

        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('o');
        set.add('i');
        set.add('u');
        set.add('y');
        set.add('A');
        set.add('E');
        set.add('O');
        set.add('I');
        set.add('U');
        set.add('Y');

        int setSize = set.size();

        set.add(ch);

        if(setSize == set.size()){
            return true;
        } else {
            set.remove(ch);
            return false;
        }

    }
}

class VowelOrConsonant4 {

    static final String vowel = "aoeiuyAOEIUY";

    public static boolean isVowelOrConsonantLetter(char ch) {


        if(vowel.indexOf(ch) != -1){
            return true;
        } else {
            return false;
        }

    }
}

