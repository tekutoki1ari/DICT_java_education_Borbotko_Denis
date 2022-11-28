package coffeemachine;

import java.util.Scanner;
import java.util.*;
// TODO switch - case x, assert == x
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

//        Scanner fillInput = new Scanner(System.in);
//        int userAnswer = fillInput.nextInt();
//        System.out.println("""
//                Choose what u want to fill:>> 1 - for water
//                2 - milk
//                3 - beans
//                4 - cups""");
//        switch (userAnswer) {
//            case 1:
//                this.water += fillInput.nextInt();
//            case 2:
//                this.milk += fillInput.nextInt();
//            case 3:
//                this.beans += fillInput.nextInt();
//            case 4:
//                this.cups += fillInput.nextInt();
//        }
//        if (userAnswer == 1){
//            this.water += input.nextInt();
//    }
//        else if (userAnswer == 2){
//            this.milk += input.nextInt();
//        }
//        else if (userAnswer == 3){
//            this.beans += input.nextInt();
//        }
//        else {
//            this.cups += input.nextInt();
//        }
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
        }

    }
}


public class coffeemachine {

    public static void main(String[] args) {
        Settings machine = new Settings();

        Scanner fillInput = new Scanner(System.in);
        machine.showIngredients();

        System.out.println("Write action (buy, fill, take):");
        String userDesire = fillInput.nextLine();
        if (Objects.equals(userDesire,"buy")){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int coffee = fillInput.nextInt();
            if(coffee == 1){
                machine.check(250,0,16, 4);
            }
            else if(coffee == 2){
                machine.check(350,75,20, 7);
            }
            else if(coffee == 3){
                machine.check(200,100,12, 6);
            }
            machine.showIngredients();
        } else if (Objects.equals(userDesire,"fill")){
            machine.fillIngredients(fillInput);
            machine.showIngredients();

        } else if (Objects.equals(userDesire,"take")) {
            machine.take();
            machine.showIngredients();
        }
    }
}