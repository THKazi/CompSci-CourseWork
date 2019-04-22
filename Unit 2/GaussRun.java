
/**
 * Write a description of class GaussRun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GaussRun
{
    public static void main (String args[])
    {
        new GaussRun();
    }
    public GaussRun()
    {
        char opt = IBIO.inputChar("\nWhich operation do you want to perform? \n1.Gauss Sum \n2.Factorial \n3.Summation");
        if (opt=='1')
        {
            int sum = 0;
            for (int i = 1; i<= 100; i++)
            {
                sum+=i;
                System.out.print(sum+" ");
            }
        }
        if(opt=='2')
        {
            int sum = 1;
            for (int i = 1; i<= 10; i++)
            {
                sum*=i;
                System.out.print(sum+" ");
            }
        }
        if(opt=='3')
        {
            int sum = 0;
            for (int i = 0; i<5; i++)
            {
                sum+=i*2;
                System.out.print(sum+" ");
            }
        }
    }
}
