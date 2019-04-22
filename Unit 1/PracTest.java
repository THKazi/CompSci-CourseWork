
/**
 * Write a description of class PracTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracTest
{
    public static void main (String args[])
    {
        new PracTest();
    }
    public PracTest()
    {
        int Mg = IBIO.inputInt("How much can the space freighter hold?: ");
        int a = Mg/625;
        int aa = Mg%625;
        int b = aa/125;
        int bb = aa%125;
        int c = bb/25;
        int cc = bb%25;
        int d = cc/5;
        int e = cc%5;
        System.out.println("\nThe freighter can hold:");
        System.out.println(a+" -- 625 Mg items");
        System.out.println(b+" -- 125 Mg items");
        System.out.println(c+" -- 25 Mg items");
        System.out.println(d+" -- 5 Mg items");
        System.out.println(e+" -- 1 Mg items");
    }
}