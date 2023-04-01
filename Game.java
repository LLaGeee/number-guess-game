import java.util.*;
public class Game{

    public static Scanner input = new Scanner(System.in);
    private static int points = 0;
    public static void main(String[] args) {
        
        String response;
        boolean continueGame = false;
        

        System.out.println("Welcome to the NUMBER GUESSING GAME!\nYou have 3 chances to guess the number from 1 to 10. The sooner you guess the correct number, the more points you earn.");

        do{
            gameplay();
            System.out.print("To continue, press y. To exit, press any other key. -->> ");
            response = input.next();
            if(response.equalsIgnoreCase("y")){
                continueGame = true;
            }
            else {
                continueGame = false;
            }
        }while(continueGame == true);
        
    }

    public static void compareGuess(int guess, int answer){

        if(guess < answer){
            System.out.println("Try a larger number");
        }
        else{
            System.out.println("Try a smaller number");
        }
        
    }

    public static void gameplay() {
        int numGuess, numAnswer;

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
            
            do{
                numGuess = input.nextInt();
            }while(numGuess < 1 || numGuess > 10);


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
                break;
            }
            else{
                System.out.println("Not correct");
                compareGuess(numGuess, numAnswer);
            }
        }

        System.out.println("Points: " + points);
        
    }

    public static int randomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        return randomNumber;
    }
}