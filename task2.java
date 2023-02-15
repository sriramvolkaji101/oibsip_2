package oasisinternship;
//NUMBER GUESSING GAME (NGG)
import java.util.Scanner;
import java.util.Random;

public class NGGmain{
    public static void main(String args[]){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int numberOfAttempts = 1;
        int numberOfGuess;
        int score = 0;
        int originalNumber = random.nextInt(100);
        System.out.println("|**** WELCOME TO NUMBER GUESSING GAME ****| \n");
        System.out.println("You have only 10 attempts to guess the number!\n");
        System.out.println("Rules for scoring:\n");
        System.out.println("1.For every unsuccessful attempt your score will get deducted by -1 point\n");
        System.out.println("2.For successful attempt you will get 10 points\n");
        System.out.println("Guess a number between 1 and 100:\n");
        while(true)
        {
            if(input.hasNextInt())
            {
                numberOfGuess=input.nextInt();
                if(numberOfGuess == originalNumber)
                {
                    score+=10;
                    System.out.println("Congo!! You Won The Game.");
                    System.out.println("Your score is "+score+" and you guessed it in "+numberOfAttempts+" attempts");
                    break;
                } else if (numberOfGuess < originalNumber) {
                    System.out.println("Your guess is too small!!!");
                    System.out.println("Attempts remaining = "+(10 - numberOfAttempts));
                    score--;
                } else if (numberOfGuess > originalNumber) {
                    System.out.println("Your guess is too big!!!");
                    System.out.println("Attempts remaining = "+(10 - numberOfAttempts));
                    score--;
                }
                if(numberOfAttempts == 10)
                {
                    System.out.println("Sorry! You have exceeded the maximum number of attempts!");
                    System.out.println("Better Luck Next Time!!");
                    break;
                }
                numberOfAttempts++;
            }
            else {
                System.out.println("Please enter a valid number!");
                break;
            }
        }
    }
}