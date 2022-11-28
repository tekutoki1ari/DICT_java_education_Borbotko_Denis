package coffeemachine;

import java.util.Scanner;
import java.util.*;
class Settings {
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;

    public void take() {
        System.out.println("I will give you " + this.money);
        this.money = 0;
    }
    public void fillIngredients(Scanner fillInput) {
        System.out.println("Write how many ml of water the coffee machine has:");
        this.water += fillInput.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        this.milk += fillInput.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        this.beans += fillInput.nextInt();

        System.out.println("Write how many cups the coffee machine has:");
        this.cups += fillInput.nextInt();

    }

    public void showIngredients(){
        System.out.println("The coffee machine has:\n" +
                this.water + " of water\n" +
                this.milk + " of milk\n" +
                this.beans + " of coffee beans\n" +
                this.cups + " of disposable cups\n" +
                this.money + " of money");
    }
    public int checkWater() {
        return water;
    }
    public int checkCups() {
        return cups;
    }
    public int checkBeans() {
        return beans;
    }
    public int checkMilk() {
        return milk;
    }

    public void check(int water, int milk, int beans, int money){

        if(checkWater()-water>=0 && checkMilk()-milk>=0 && checkCups()>0 && checkBeans()-beans>=0){
            this.water -= water;
            this.milk -= milk;
            this.cups -= 1;
            this.beans -= beans;
            this.money += money;
            System.out.println("I have enough resources,making you a coffee!");
        }else{
            if (checkWater()-water<0){
                System.out.println("Sorry, not enough water");
            }
            if (checkMilk()-milk<0){
                System.out.println("Sorry, not enough milk");
            }
            if (checkCups() == 0){
                System.out.println("Sorry, not enough cups");
            }
            if(checkBeans()-beans<0){
                System.out.println("Sorry, not enough beans");
            }
        }

    }
}


public class coffeemachine {

    public static void main(String[] args) {
        Settings machine = new Settings();

        Scanner fillInput = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take,remaining,exit):");
            String action = fillInput.nextLine();

            if (Objects.equals(action, "buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
                int coffee = fillInput.nextInt();
                switch (coffee) {
                    case 1 -> machine.check(250, 0, 16, 4);
                    case 2 -> machine.check(350, 75, 20, 7);
                    case 3 -> machine.check(200, 100, 12, 6);
                    case 4 -> { }
                }

            } else if (Objects.equals(action, "fill")) {
                machine.fillIngredients(fillInput);

            } else if (Objects.equals(action, "take")) {
                machine.take();

            } else if (Objects.equals(action, "remaining")) {
                machine.showIngredients();

            } else if (Objects.equals(action, "exit")) {
                break;
            }
        }
    }
}