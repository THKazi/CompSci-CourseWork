
/**
 * .
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IfOnly
{
    public static void main (String args[])
    {
        new IfOnly();
    }
    public IfOnly()
    {
        System.out.println("Do you want to see... YOUR FUTURE?");
        System.out.println("Well I don't care - I shall show you regardless.\n");
        
        int n = (int) (Math.random()*18);
        if (n==1)
            System.out.println("Your future is dark.");
        else if (n==2)
            System.out.println("You have no hope.");
        else if (n==3)
            System.out.println("There is no light in the universe left for you.");
        else if (n==4)
            System.out.println("The eternal void stares unto YOU.");
        else if (n==5)
            System.out.println("CTHULU SEES YOU (;,;)");
        else if (n==6)
            System.out.println("The darkness consumes you.");
        else if (n==7)
            System.out.println("You will forever be lost to time.");
        else if (n==8)
            System.out.println("Be wary of the water. They say that some folk walk in and never walk out.");
        else if (n==9)
            System.out.println("Fire is pretty, isn't it? Perhaps you should get a better look.");
        else if (n==10)
            System.out.println("Anything can kill you. That's not a threat; just a fact.");
        else if (n==11)
            System.out.println("I see your future dimming before your eyes.");
        else if (n==12)
            System.out.println("It'll all be over soon.");
        else if (n==13)
            System.out.println("You can have hope.");
        else if (n==14)
            System.out.println("Perhaps you won't perish in a gruesome manner.");
        else if (n==15)
            System.out.println("Your future isn't darker than the eternal void. Have hope.");
        else if (n==16)
            System.out.println("Nope. Not happening.");
        else
            System.out.println("CTHULHU CUDDLES YOU (;,;)");
    }
}