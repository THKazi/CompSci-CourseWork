
/**
 * Write a description of class Zoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoop
{
    public static void main(String args[])
    {
        new Zoop();
    }
    public Zoop()
    {
        System.out.println("Let's play... Z00P Z4P!");
        int ss = IBIO.inputInt("To what number would you like to Z00PZ4P your way to?");
        for (int i=1;i<=ss;i++)
        if (i%3==0&&i%5==0)
            System.out.print("Z00P/Z4P ");
        else if (i%3==0)
            System.out.print("Z00P ");
        else if (i%5==0)
            System.out.print("Z4P ");
        else 
            System.out.print(i+" ");
    }
}
