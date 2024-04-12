import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
//        System.out.println("Random Number is " + randomNum);

        System.out.println("You Have Only 6 attempt to guess a Number");
//        int tryCount = 0;
        for(int  i =0 ; i<6; i++) {
            System.out.println("Enter Your Guess Number(1-100) : ");
           Scanner  sc = new Scanner(System.in);
            int playerGuess = sc.nextInt();
//            tryCount++;

            if (playerGuess == randomNum) {
                System.out.println("Correct! You Win!🏆");
//                System.out.println("It took you " + tryCount + " tries");
                break;
            } else if (randomNum > playerGuess) {
                System.out.println("Nope! The Number is higher.Guess again.");
            } else {
                System.out.println("Nope! The Number is lower. Guess again");
            }

           if (i >= 5) {
               System.out.println();
               System.out.println("Nope! Your Limited Attempted Is Over");
               System.out.println("You Lose The Game! Better Try Next Time👍44");
               System.out.println("The number I was thinking of was " + randomNum + "!");
           }
        }
    }
}
