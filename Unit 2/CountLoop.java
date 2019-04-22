/**
 * Write a description of class CountLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountLoop
{
    public static void main (String args[])
    {
        new CountLoop();
    }
    public CountLoop()
    {
        System.out.println("Group A Counting\n");
        for (int i=0; i<=12; i++)
            System.out.print(i+" ");
        System.out.println("");
        for (int i=1; i<=19; i++)
            System.out.print(i+" ");
            System.out.println("");
        for (int i=12; i<=22; i++)
            System.out.print(i+" ");
            System.out.println("");
        for (int i=101; i<=115; i++)
            System.out.print(i+" ");
            System.out.println("");
            
        System.out.println("\nGroup B Backwards\n");
        for (int i=12; i>=0; i--)
            System.out.print(i+" ");
            System.out.println("");
        for (int i=20; i>=1; i--)
            System.out.print(i+" "); 
            System.out.println("");
        for (int i=22; i>=12; i--)
            System.out.print(i+" ");
            System.out.println("");
        for (int i=115; i>=101; i--)
            System.out.print(i+" ");
            System.out.println("");
            
        System.out.println("\nGroup C Skip Counting\n");
        for (int i=0; i<=18; i+=2)
            System.out.print(i+" ");
            System.out.println("");
        for (int i=1; i<=19; i+=2)
            System.out.print(i+" "); 
            System.out.println("");
        for (int i=0; i<=30; i+=3)
            System.out.print(i+" ");
            System.out.println("");
        for (int i=0; i<=40; i+=4)
            System.out.print(i+" ");
            System.out.println("");
        for (double i =1.0; i<=5.5; i+=0.5)
            System.out.print(i+" ");
            System.out.println("");
            
        System.out.println("\nGroup D One thing, Repeated\n");
        for (int i=1; i<=13; i++)
            System.out.print("* ");
            System.out.println("");
        for (int i=1; i<=13; i++)
            System.out.print("2 ");
            System.out.println("");
        for (int i=1; i<=13; i++)
            System.out.print("1 0 ");
            System.out.println("");
        for (int i=1; i<=20; i++)
            System.out.print("la");
            System.out.println("");
        for (int i=1; i<=6; i++)
            System.out.print("- 1 + 1");
            System.out.println("");
            
        System.out.println("\nGroup E Powers - Multiply and Divide\n");
        for (int i=0; i<=144; i++)
            System.out.print(Math.pow(i,2)+" ");
            System.out.println("");
        for (int i=0; i<=1728; i++)
            System.out.print(Math.pow(i,3)+" ");
            System.out.println("");
        for (int i=0; i<=11; i++)
            System.out.print(Math.pow(2,i)+" ");
            System.out.println("");
        for (int i=0; i<=10; i++)
            System.out.print(Math.pow(3,i)+" ");
            System.out.println("");
        for (double i=3; i>=-2; i--)
            System.out.print(Math.pow(10,i)+" ");
            System.out.println("");
            
        System.out.println("\nBonus - Not Required\n");
        for (int a=1, b=a+1; a<=8; a++,b++)
            System.out.print(a+"/"+b+" ");
            System.out.println("");
        for (int a=1, b=1; b<=9; a=a*b, b++)
            System.out.print(a*b+" ");
            System.out.println("");
        for (int a=0, b=1; b<=89;)
        {
            System.out.print(b+" ");
            int c=a+b;
            a=b;
            b=c;
            // Done with assistance
        }
            System.out.println("");       
    }
}