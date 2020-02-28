package lab.assignment.beforerefactoring;

import lab.assignment.beforerefactoring.MochaMaker;
import lab.assignment.beforerefactoring.CappuccinoMaker;
import lab.assignment.beforerefactoring.AmericanoMaker;

public class CoffeeClient {

    public static void main(String[] args) {
        (new CappuccinoMaker()).prepareCoffee();
        System.out.println("********************");

        (new MochaMaker()).prepareCoffee();
        System.out.println("********************");

        (new AmericanoMaker()).prepareCoffee();
        System.out.println("********************");
    }
}