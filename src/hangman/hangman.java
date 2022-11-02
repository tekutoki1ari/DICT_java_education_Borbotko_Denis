package hangman;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hangman {

    public static void main(String[] args) {
        System.out.println("HANGMAN");
        Scanner menuInp = new Scanner(System.in);
        while (true) {
            System.out.print("Type \"play\" to play game, \"exit\" to quit: ");
            String input = menuInp.next().trim().toLowerCase();

            if (input.equals("play")) {
                System.out.println();
                break;
            }

            if (input.equals("exit")) {
                return;
            }
        }
        List<Character> used = new ArrayList<>();

        byte attemps = 8; //attempts

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
            if (97 <= Character.hashCode(char_answer) & Character.hashCode(char_answer) <= 122) {
                if (used.isEmpty() | !used.contains(char_answer)) {
                    used.add(char_answer);
                    char[] new_result_char = checkout(hiddenWordArray, hiddenWordChar.clone(), char_answer);
                    if (new_result_char == null) {
                        attemps--;
                        System.out.println("That letter doesn't appear in the word");
                    } else if (Arrays.equals(new_result_char, hiddenWordArray)) {
                        System.out.println("You win!!!");
                        System.out.println("The word → " + hiddenWord);
                        break;
                    } else if (!(boolean) Arrays.equals(new_result_char, hiddenWordChar))
                        hiddenWordChar = new_result_char.clone();
                } else if (used.contains(char_answer))
                    System.out.println("You`ve already guessed this letter");
            }else
                System.out.println("Please enter a lowercase English letter");
            }
        if (attemps <= 0)
            System.out.println("You lost!");
            System.out.println("The word → " + hiddenWord);
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
