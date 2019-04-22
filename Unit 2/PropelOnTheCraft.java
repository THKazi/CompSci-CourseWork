/**
 * Wheels on the bus - Steampunked.
 *
 * @author (Timurul H. Kazi)
 * @version (March 21st, 2019)
 */
public class PropelOnTheCraft
{
    public static void main (String args[])
    {
        new PropelOnTheCraft();
    }
    public PropelOnTheCraft()
    {
        System.out.println("Welcome to our aircraft!");
        //Initialize
        String act1, go1, act2, go2, act3, go3;
        //OBJECTS
        String obj1 = IBIO.inputString("What 3 objects on the craft move?\n::");
        String obj2 = IBIO.inputString("::");
        String obj3 = IBIO.inputString("::");
        //Plurality
        if ((obj1.charAt(obj1.length() - 1))=='s'||(obj1.charAt(obj1.length() - 1))=='S')
        {
            act1 = IBIO.inputString("What sound do "+obj1+" make? :: ");
            go1 = "go";
        }
        else
        {
            act1 = IBIO.inputString("What sound does a "+obj1+" make? :: ");
            go1 = "goes";
        }
        if ((obj2.charAt(obj2.length() - 1))=='s'||(obj2.charAt(obj2.length() - 1))=='S')
        {
            act2 = IBIO.inputString("What sound do "+obj2+" make? :: ");
            go2 = "go";
        }
        else
        {
            act2 = IBIO.inputString("What sound does a "+obj2+" make? :: ");
            go2 = "goes";
        }
        if ((obj3.charAt(obj3.length() - 1))=='s'||(obj3.charAt(obj3.length() - 1))=='S')
        {
            act3 = IBIO.inputString("What sound do "+obj3+" make? :: ");
            go3 = "go";
        }
        else
        {
            act3 = IBIO.inputString("What sound does a "+obj3+" make? :: ");
            go3 = "goes";
        }
        
        craft(obj1, act1, go1);
        craft(obj2, act2, go2);
        craft(obj3, act3, go3);
    }
    public static void craft(String obj, String act, String go)
    {
        System.out.println("\nThe "+obj+" on the airship "+go+" "+act+", "+act+", "+act);
        System.out.println(act+", "+act+", "+act);
        System.out.println(act+", "+act+", "+act);
        System.out.println("The "+obj+" on the airship "+go+" "+act+", "+act+", "+act);
        System.out.println("All 'cross the skies.");
    }
}