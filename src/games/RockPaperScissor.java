package games;

import java.util.Random;
import java.util.Scanner;

//FIXME: maybe you had a package called "games.rockpaperscissor" before, but it's gone now.
//FIXME: Tip: You don't have to do an import if the used class is in the same package
import static games.rockpaperscissor.Fist.*;

public class RockPaperScissor {

    public static void play (Player player){
        Scanner input = new Scanner(System.in);
            int playChoice = 0;

        while (playChoice != 4){
            System.out.println("Rock, Scissors or Paper or Quit?");
            String choice = input.nextLine();
            switch (choice) {
                case "Rock" -> playChoice = ROCK;
                case "Paper" -> playChoice = PAPER;
                case "Scissors" -> playChoice = SCISSORS;
                case "Quit" -> playChoice = 4;
            }
            Random random = new Random();
            int aiChoice = random.nextInt(2);
            boolean playerWins = false;

            if (aiChoice == playChoice) {
                System.out.println("Draw!");
            } else if(aiChoice == ROCK && playChoice == PAPER){
                System.out.println("You win! Paper beats Rock");
                playerWins = true;
            } else if(aiChoice == PAPER && playChoice == ROCK){
                System.out.println("You loose! Paper beats Rock");
            } else if(aiChoice == SCISSORS && playChoice == ROCK){
                System.out.println("You win! Rock beats Scissor!");
                playerWins = true;
            } else if(aiChoice == ROCK && playChoice == SCISSORS){
                System.out.println("You loose! Rock beats Scissor!");
            } else if(aiChoice == PAPER && playChoice == SCISSORS){
                System.out.println("You win! Rock beats Scissor!");
                playerWins = true;
            } else if(aiChoice == PAPER && playChoice == SCISSORS){
                System.out.println("You win! Rock beats Scissor!");
                playerWins = true;
            }

            if(playerWins) {
                player.setScore(player.getScore() + 1);
            }
        }
        System.out.println("Player score is " + player.getScore());

    }



}
