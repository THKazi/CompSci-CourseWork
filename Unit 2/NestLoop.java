/**
 * Write a description of class NestLoop here.
 *
 * @author (your name)
 * @version (March 7th, 2019
 */
public class NestLoop
{
    public static void main (String args[])
    {
        new NestLoop();
    }

    public NestLoop()
    {   
        char choix = IBIO.inputChar("Choice:\na) 100 Milk\nb) Deck\nc) Multiplication\nd) Broken Tape\ne) Pyramid of Stars");
        if (choix=='a')
        {
            System.out.println("~100 Bottles of Milk on the Wall~");
            int t;
            for (t=100;t>=3;t--)
            {
                if (t>2)
                {
                    System.out.println("\n"+t+" bottles of milk on the wall.\n"+t+" bottles of milk.");
                    System.out.println("If one of those bottles should happen to fall...\nThere would be "+(t-1)+" bottles of pop on the wall.");
                }
                if (t==2)
                {
                    System.out.println("\n"+t+" bottles of milk on the wall.\n"+t+" bottles of milk.");
                    System.out.println("If one of those bottles should happen to fall...\nThere would be "+(t-1)+" last bottle of pop on the wall.");
                }
                else if (t==1)
                {
                    System.out.println("\n"+t+" bottles of milk on the wall.\n"+t+" bottles of milk.");
                    System.out.println("If one of those bottles should happen to fall...\nThere would be no more bottles of pop on the wall!");
                }
            }

        }
        else if (choix=='b')
        {
            System.out.println("Deck sans Jokers");
            for (int c=0;c<=51;c++)
            { 
                if (c%13==0)
                    System.out.print("Ace of ");
                else if (c%13==1)
                    System.out.print("Two of ");
                else if (c%13==2)
                    System.out.print("Three of ");
                else if (c%13==3)
                    System.out.print("Four of ");
                else if (c%13==4)
                    System.out.print("Five of ");
                else if (c%13==5)
                    System.out.print("Six of ");
                else if (c%13==6)
                    System.out.print("Seven of ");
                else if (c%13==7)
                    System.out.print("Eight of ");
                else if (c%13==8)
                    System.out.print("Nine of ");
                else if (c%13==9)
                    System.out.print("Ten of ");
                else if (c%13==10)
                    System.out.print("Jack of ");
                else if (c%13==11)
                    System.out.print("Queen of ");
                else if (c%13==12)
                    System.out.print("King of ");
                if (c<13)
                    System.out.println("Hearts");
                else if (c<26)
                    System.out.println("Diamonds");
                else if (c<40)
                    System.out.println("Clubs");
                else
                    System.out.println("Spades");
            }
        }
        else if (choix=='c')
        {
            for (int al=1; al<=10; al++)
            {
                for (int br=1; br<=10; br++)
                    System.out.print(al+"x"+br+"="+al*br+"  ");
                System.out.println("");
            }                
        }
        else if (choix=='d')
        {
            for (int t=1; t<=7; t++)
            {
                System.out.println("+/\\/\\/\\/\\/\\+");
                for (int s=1; s<=t; s++)
                    System.out.println("|          |");
                System.out.println("+/\\/\\/\\/\\/\\+\n");
            }
        }
        else if (choix=='e')
        {
            int r = IBIO.inputInt("How many rows would you like? ");
            for (int i=r; i>0;i--)
            {
                int blank = (r/2);
                int star = 1;
                int na=1;
                while (na <= blank)
                {
                    System.out.print(" ");
                }
                int nb=1;
                while (nb<=star)
                {   
                    System.out.println("*");
                    
                }
                blank--;   
                star+=2;
            }
        }
    }
}
