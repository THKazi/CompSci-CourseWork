/**
 * The Daisy game - pick the petals off 1 by 1 to determine whether the subject in question has affection for you.
 *
 * @author (Timurul Hoque Kazi)
 * @version (Marh 19th, 2019)
 */
public class Daisy
{
    public static void main (String args[])
    {
        new Daisy();
    }
    public Daisy()
    {
        int petal = (int)(Math.random()*10)+15;
        while(petal>0)
        {
            petal--;
            if (petal%2==0)
                System.out.println(petal+" - They murder me.");
            else
                System.out.println(petal+" - They murder me not.");
            try
            {
                Thread.sleep(petal*10+100);
            }
            catch (InterruptedException m)
            {
                ;
            }
        }
        if (petal%2==0)
            System.out.println("\"Et tu, Brute?\"");
        else
            System.out.println("It's Caesar time.");
    }
}
