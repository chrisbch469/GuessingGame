import java.util.Scanner;


public class Prompter {

    //constructor
    public Prompter(){

    }

    public void runGame(int amount, int numberInJar, String item) {

        int playerGuess = 0;
        int guess = 0;

        //execute game with prompt
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1 and " + amount + " : ");
            playerGuess = scan.nextInt();

            if(playerGuess > amount){
                System.out.println("Your guess is larger than the amount in the jar, " +
                        "please choose a number between 1 and " +amount);
                guess--;
            }
            else if (playerGuess != numberInJar && playerGuess < numberInJar) {
                System.out.println("Sorry, but your guess was too low. ");
            }
            else if (playerGuess != numberInJar && playerGuess > numberInJar) {
                System.out.println("Sorry, but your guess was too high. ");
            }
            guess++;
        } while (playerGuess != numberInJar);

        //print results to the player
        System.out.printf("%nGreat Job! You guessed the correct number of %s in the jar. " +
                "It only took you %d tries. %n", item, guess);
    }
}