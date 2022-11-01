package hangman;


import java.util.Scanner;


public class hangman {
    public static void main(String[] args){
        System.out.println("HANGMAN");
        System.out.println("The game will be available soon.");
        System.out.println("enter world: ")
        String answerTrue = "java";
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();
        if (answerTrue.equals(answer)){
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }

    }
}
