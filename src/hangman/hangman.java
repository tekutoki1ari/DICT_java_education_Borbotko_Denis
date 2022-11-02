package hangman;


import java.util.Random;
import java.util.Scanner;


public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");
        System.out.println("guess world: ");

        String[] dict = new String[]{"python", "java", "javascript", "kotlin"};
        String hiddenWord = dict[(int) (Math.random() * dict.length)];
        Scanner userAnswer = new Scanner(System.in);
        if (userAnswer.nextLine().equals(hiddenWord)){
            System.out.println("You survived!");
        }
        else
            System.out.println("You lost!");
    }
}
