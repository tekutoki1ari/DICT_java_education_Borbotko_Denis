package chat_bot;


import java.util.Scanner;


public class chat_bot {
    public static void main (String[] args) {

        System.out.println("Hello! My name is 2iq_bot.");
        System.out.println("I was created in 2022.");
        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        System.out.println("What a great name you have, " + name);
    }
}
