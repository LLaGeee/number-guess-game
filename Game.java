import java.util.*;
public class Game{

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        String response = "y";
        boolean continueGame = true;
        

        System.out.println("Welcome to the NUMBER GUESSING GAME!\nYou have 3 chances to guess the number from 1 to 10. The sooner you guess the correct number, the more points you earn.");

        gameplay();
    }

    public static int randomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        return randomNumber;
    }

    public static void gameplay() {
        int numGuess, numAnswer, points = 0;

        numAnswer = randomNumber();

        for(int attempt = 1; attempt <= 3; attempt++){
            if(attempt == 1){
                System.out.print("First try: ");
            }
            else if(attempt == 2){
                System.out.print("Second try: ");
            }
            else{
                System.out.print("Third try: ");
            }
            numGuess = input.nextInt();
            if(numGuess == numAnswer){
                System.out.println("Correct");
                if(attempt == 1){
                    points += 5;
                }
                else if(attempt == 2){
                    points += 3;
                }
                else{
                    points += 1;
                }
                return;
            }
            else{
                System.out.println("Not correct");
            }
        }

        System.out.println("Points: " + points);
        
    }
}