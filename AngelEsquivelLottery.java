/**
 *
 * @author aesqu
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class AngelEsquivelLottery {

    
    public static void main(String[] args) {
        
        int userOne;
        int userTwo;
        int userThr;
        List<Integer> user = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        Random ranNumber = new Random();
        final int LIMIT = 9;
        
        //generate random #'s
        final int numOne = ranNumber.nextInt(LIMIT);
        final int numTwo = ranNumber.nextInt(LIMIT);
        final int numThr = ranNumber.nextInt(LIMIT);
        
        //winning awards
        final int awZero = 0;
        final double awTen = 10;
        final double awHun = 100;
        final double awTh = 1000;
        final double awMill = 1000000;
        
        //user makes guess
        System.out.println("Enter your first guess: ");
        userOne = input.nextInt();
        user.add(userOne);
        System.out.println("Enter your second guess: ");
        userTwo = input.nextInt();
        user.add(userTwo);
        System.out.println("Enter your third guess: ");
        userThr = input.nextInt();
        user.add(userThr);
        
        //output
        System.out.println("You guessed: " + userOne + " " + userTwo + " " + userThr);
        System.out.println("The random winning number is: " + numOne + " " + 
                numTwo + " " + numThr);
        List<Integer> lottery = new ArrayList<>();
        lottery.add(numOne);
        lottery.add(numTwo);
        lottery.add(numThr);
        
        if (user.equals(lottery))
        {
            System.out.println("You won: $" + awMill);
        }
        else
        {
            int match = 0;
            for (Integer value : user)
            {
                if (lottery.contains(value))
                {
                    match++;
                    lottery.remove(value);
                }
            }
            
            switch (match)
            {
                case 0:
                    System.out.println("You won: $" + awZero);
                    break;
                case 1:
                    System.out.println("You won: $" + awTen);
                    break;
                case 2:
                    System.out.println("You won: $" + awHun);
                    break;
                case 3:
                    System.out.println("You won: $" + awTh);
                    break;
            }
        }
        
        
        
    }
    
}
