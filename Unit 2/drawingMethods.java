/**
 * Write a description of class MethodPlus here.
 *
 * @author (Timurul H. Kazi)
 * @version (March 25th, 2019)
 */

public class drawingMethods
{
    public static void main (String args[])
    {
	new drawingMethods ();
    }
    public drawingMethods ()
    {
	System.out.println ("Here is a circle:");
	circ();
	System.out.println ("Here is a tree:");
	circ();
	lines();
	System.out.println ("Here is a spoon:");
	circ();
	lines();
	lines();
	System.out.println ("Here is a barbell:");
	circ();
	lines();
	lines();
	circ();
    }
    public void circ ()
    {
	System.out.println ("  **");
	System.out.println (" *  *");
	System.out.println ("  **");
    }
    public void lines ()
    {
	System.out.println ("  ||");
    }
}
