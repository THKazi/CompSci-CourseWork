
/**
 * February 6th; IBIO & Inputs
 *
 * @Timurul H. Kazi
 */
public class ICS_In
{
    public static void main (String args[])
    {
        new ICS_In();
    }
    public ICS_In()
    {
        int alpha = IBIO.inputInt("Submit an integer a quantity: ");
        double gamma = IBIO.inputDouble("Submit a decimal quantity: ");
        String enigma = IBIO.inputString("Give me an object: ");
        System.out.println("\n"+alpha+" "+enigma+"s. Are you sure there aren't "+gamma+"?");
        System.out.println("Just reconsider.");
    }
}
        