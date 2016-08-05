import java.util.Scanner;

/**
 * Created by chris on 8/3/2016.
 */
public class Game {

    public static void main(String[] args){

        //scanner class to scan user input
        Scanner scan = new Scanner(System.in);

        //Administrator Section to specify type in jar and number in jar
        System.out.println("Welcome to The Guessing Game! \n\n");

        System.out.println("********Administrator Setup********");
        System.out.printf("What type of item is in the jar? %n");
        String item = scan.nextLine();
        System.out.printf("What is the maximum number of %s in the jar? %n", item);
        int amount = scan.nextInt();

        //Create Jar Object
        Jar jar = new Jar(amount, item);


        //switch to player to play the game
        System.out.println("********Player********");
        System.out.printf("The object of the game is for you to guess how many %s are in the jar. " +
                "Your guess should be between 1 and %d. %n", item, amount);


        //set up user attributes
        int guess = 0;
        int numberInJar = jar.getNumberInJar();
        int playerGuess;
        String answer = "";

        System.out.println("\nPress ENTER to start the game...");
        scan.nextLine();
        scan.nextLine();//continues to game code


        //execute game with prompt
        do {
            System.out.println("Enter a number between 1 and " + amount + " : ");
            playerGuess = scan.nextInt();

            if (playerGuess != numberInJar && playerGuess < numberInJar) {
                System.out.println("Sorry, but your guess was too low.");
            }
            if(playerGuess != numberInJar && playerGuess > numberInJar) {
                System.out.println("Sorry, but your guess was too high.");
            }
            guess++;
        } while (playerGuess != numberInJar);

        //print results to the player
       System.out.printf("%nGreat Job! You guessed the correct number of %s in the jar. " +
               "It only took you %d tries. %n", item, guess);

    }//end main
}//end Game class