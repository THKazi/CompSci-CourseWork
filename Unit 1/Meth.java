
/**
 * Write a description of class Meth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Meth
{
    public static void main (String args[])
    {
        new Meth();
    }

    public Meth()
    {
        // +, -, *, /,%, Math.PI, Math.pow(base,exponent)//
        System.out.println(10%0);
        int hamburg = IBIO.inputInt("How many hamburgers? ");
        int drink = IBIO.inputInt("How many drinks? ");
        int fries = IBIO.inputInt("How many fries? ");

        double subtotal = hamburg*1 + drink*0.5 + fries*0.25;
        double tax = subtotal*0.14;
        double total = subtotal + tax;
        System.out.println("subtotal: $"+subtotal);
        System.out.println("tax: $"+tax);
        System.out.println("total: $"+total);

        System.out.println(10%2 +" "+10%3);
    }
}