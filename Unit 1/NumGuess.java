
/**
 * Write a description of class NumGuess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumGuess
{
    public static void main (String args[])
    {
        new NumGuess();
    }
    public NumGuess()
    {
        System.out.println("Welcome to the NumGuess challenge! you have two chances to guess the right integer - OR ELSE.");
        int num = (int)(Math.ceil(Math.random()*1001));
        int g1 = IBIO.inputInt("Enter your first guess: ");
        int g2 = IBIO.inputInt("Enter another number: ");
        System.out.println("It is "+(num<=g1)+" that your first number is less than or equal to mine");
        System.out.println("It is "+(num>=g2)+" that your second number is greater than or equal to mine");
        int ans = IBIO.inputInt("Enter your final guess: ");
        System.out.println("Your answer is "+(ans==num)+"!");
    }
}