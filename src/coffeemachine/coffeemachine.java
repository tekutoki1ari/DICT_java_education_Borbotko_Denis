package coffeemachine;


import java.util.Scanner;


public class coffeemachine {
    public static void main(String[] args) {
        System.out.println("Write how many ml of water the coffee machine has: ");
        Scanner userInpWater = new Scanner(System.in);

        System.out.println("Write how many ml of milk the coffee machine has: ");
        Scanner userInpMilk = new Scanner(System.in);

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        Scanner userInpBeans = new Scanner(System.in);

        int userAnswWater = userInpWater.nextInt();
        int userAnswMilk = userInpMilk.nextInt();
        int userAnswBeans = userInpBeans.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        Scanner userInput = new Scanner(System.in);
        int cups = userInput.nextInt();

        int oneCupWater = userAnswWater / 250;
        int oneCupMilk = userAnswMilk / 50;
        int oneCupBeams = userAnswBeans / 15;

        int oneCupMin = Math.min(oneCupWater, oneCupMilk);
        int oneCupMin2 = Math.min(oneCupBeams, oneCupMin);

        if (oneCupMin2 < cups) {
            System.out.println("No, I can make only "+oneCupMin2+" cups of coffee");
        }
        else if (oneCupMin2 == cups){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else {
            int min = oneCupMin2 - cups;
            System.out.println("Yes, I can make that amount of coffee (and even "+min+" more than that)");
        }
    }
}
