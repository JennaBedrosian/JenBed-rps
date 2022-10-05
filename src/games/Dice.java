package games;

import java.util.Random;

public class Dice {

    public int numOfSides;

    public Dice(){}

    public Dice(int numOfSides) {
        this.numOfSides = numOfSides;
    }
    public int roll(){
        // I want a number between 1 and 6!
        Random diceRandom = new Random();

        int result = diceRandom.nextInt(6)+1;

        // här ska det hända nåt!

        return result;

    }

}
