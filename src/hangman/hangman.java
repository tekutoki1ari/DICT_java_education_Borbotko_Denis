package hangman;


import java.util.Scanner;


public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");
        System.out.println("guess world: ");

        String[] dict = new String[]{"python", "java", "javascript", "kotlin"};
        String hiddenWord = dict[(int) (Math.random() * dict.length)];
        char[] hiddenWord_a = hiddenWord.toCharArray();
        for (int i = 2; i< hiddenWord_a.length; i++)
            hiddenWord_a[i] = '-';
        System.out.printf("HANGMAN\nGuess the word %s: ", String.valueOf(hiddenWord_a));
        Scanner userAnswer = new Scanner(System.in);
        if (userAnswer.nextLine().equals(hiddenWord)){
            System.out.println("You survived!");
        }
        else
            System.out.println("You lost!");
    }
}
