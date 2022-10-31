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


        System.out.println("Let me guess your age.");
        int r3, r5, r7, age;
        System.out.println("Enter remainders of divining your age by 3, 5 and 7");
        Scanner age1 = new Scanner(System.in);
        Scanner age2 = new Scanner(System.in);
        Scanner age3 = new Scanner(System.in);
        r3 = age1.nextInt();
        r5 = age2.nextInt();
        r7 = age3.nextInt();
        age = ((r3 * 70 + r5 * 21 + r7 * 15) % 105);
        System.out.println("Your age is " + age + "; that`s a good time to start programming!");


        System.out.println("Now, i will prove u that i can count to ANY number u want");
        System.out.println("enter number");
        long number;
        Scanner cauntScan = new Scanner(System.in);
        number = cauntScan.nextInt();
            for (long x = 0; x <= number; x++) {
                if (x == number)
                        break;
                System.out.println(x + 1 + " !");
            }
    }
}
