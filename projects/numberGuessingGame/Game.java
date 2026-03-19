package projects.numberGuessingGame;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("===========Welcome to Number Guessing Game==========");
        System.out.println("Guess the number from 0 - 100: ");
        Random random = new Random();
        int randint = random.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int n = -2;
        while (n != randint) {
            n = sc.nextInt();
            if (n > randint) {
                System.out.println("Too high!");
            } else if (n < randint) {
                System.out.println("Too low!");
            } else {
                System.out.println("You nailed it!");
            }
        }
        sc.close();
    }
}