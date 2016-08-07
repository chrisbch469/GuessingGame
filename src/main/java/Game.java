import java.util.Scanner;


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
        int numberInJar = jar.getNumberInJar();
        String answer = "";

        System.out.println("\nPress ENTER to start the game...");
        scan.nextLine();
        scan.nextLine();//continues to game code


        Prompter prompt = new Prompter();
        prompt.runGame(amount, numberInJar,item);





    }//end main
}//end Game class

