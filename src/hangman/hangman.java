package hangman;


import java.util.Arrays;
import java.util.Scanner;


public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");

        byte attemps = 8;

        String[] dict = new String[]{"python", "java", "javascript", "kotlin"};
        String hiddenWord = dict[(int) (Math.random() * dict.length)];
        char[] hiddenWordArray = hiddenWord.toCharArray();
        char[] hiddenWordChar = new char[hiddenWordArray.length];
        for (int i = 0; i < hiddenWordArray.length; i++)
            hiddenWordChar[i] = '-';
        Scanner userAnswer = new Scanner(System.in);
        while (attemps > 0) {
            System.out.printf("You life: %d\nGuess the word %s: ", attemps, String.valueOf(hiddenWordChar));
            char char_answer = userAnswer.nextLine().toCharArray()[0];
            char[] hiddenWordChar_N = checkout(hiddenWordArray, hiddenWordChar.clone(), char_answer);
            if (hiddenWordChar_N == null) {
                attemps--;
                System.out.println("That letter doesn`t appear in the word");
            }
            else if (Arrays.equals(hiddenWordChar_N, hiddenWordArray)) {
                System.out.println("You win!");
                break;
            } else if (Arrays.equals(hiddenWordChar, hiddenWordChar_N)) {
                System.out.println("No improvements");
                attemps--;
            } else if (!(boolean) Arrays.equals(hiddenWordChar_N, hiddenWordChar)) {
                hiddenWordChar = hiddenWordChar_N.clone();
            }
        }
        if (attemps <= 0)
            System.out.println("You lost!");
    }
    public static char[] checkout (char[] dict, char[] hiddenWordChar, char userAnswer) {
        byte changed = 0;

        for (int i = 0; i < hiddenWordChar.length; i++) {
            if (userAnswer == dict[i]) {
                hiddenWordChar[i] = userAnswer;
                changed++;
            }
        }
        if (changed != 0)
            return hiddenWordChar;
        else
            return null;
        }
    }


