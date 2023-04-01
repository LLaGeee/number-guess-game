import java.util.*;
public class Game{
    public static void main(String[] args) {
        System.out.println("Welcome to the NUMBER GUESSING GAME!\nYou have 3 chances to guess the number between 0 and 10. The sooner you guess the correct number, the more points you earn.");

    }

    public int randomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);
        return randomNumber;
    }
}