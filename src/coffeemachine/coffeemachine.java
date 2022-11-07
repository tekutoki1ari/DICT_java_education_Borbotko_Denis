package coffeemachine;


import java.util.Scanner;


public class coffeemachine {
    public static void main(String[] args) {
        System.out.println("Coffee Machine> enter amount of cups you will need: ");
        int water = 200;
        int milk = 50;
        int beans = 15;

        Scanner userInput = new Scanner(System.in);

        int userAnswer = userInput.nextInt();

        int water_need = userAnswer * water;
        int milk_need = userAnswer * milk;
        int beans_need = userAnswer * beans;

        System.out.println("For " + userAnswer + " cups, u will need " + water_need + "ml of water, \n" + milk_need +
                "ml of milk, " + beans_need + "g of coffee beans");


    }
}
