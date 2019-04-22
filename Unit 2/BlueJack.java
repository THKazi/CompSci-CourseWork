/**
 * BlackJack for BlueJay.
 *
 * @author (Timurul Hoque Kazi)
 * @version (March 2nd, 2019)
 */
public class BlueJack
{
    public static void main(String args[])
    {
        new BlueJack();
    }
    public BlueJack()
    {
        System.out.println("******************\n*Hygeian BlueJack*\n******************");
        System.out.println("\n*You enter the broken down shack out on Hygeia. The weaselly teller beckons you to the table.*");
        char yn = IBIO.inputChar("Welcome, citizen. Would you like to join me in a game of Black Jack?(y/n)");
        int $ = 200;
        int c=0;
        if (yn=='y')
            System.out.println("//RULES\\\\\nYou will be delt 2 cards.\n1.if they're greater than 21, you lose. \n2.If they're equal to 21, you win.\n3.If they're less than 21, you can keep asking for more cards until you're at 21 (win) or over (lose).");
        while (yn=='y')
        {      
            //ANTE
           System.out.println("\nYou have "+$+" credits.");
           int ante = IBIO.inputInt("How much do you want to put in? :: ");
           while (ante>$||ante<0)
               ante = IBIO.inputInt("Hey, you can't do that. How much do you really want to put in? :: ");
           System.out.println(ante+" credit(s). Alright.");
           $=$-ante;
           
            //DEALING
           int c1 = (int)(Math.random()*12+2);
           System.out.println("\nYour first card is "+c1);
           char deal = 'y';
           char next ='y';
           for (int dealNum=0;deal=='y'&&dealNum<5;dealNum++)
           {
               int c2 = (int)(Math.random()*12+2);
               System.out.println("Your next card is "+c2);
               c = c1+c2;
               System.out.println("**Your card total is "+c+"**");
           
               //IF: Can they be dealt another card?
               if (c<21&&$>=20)
               {
                   System.out.println("**You have "+$+" credits.**");
                   deal = IBIO.inputChar("Want to up the ante by 20 and keep going?(y/n) :: ");
                   System.out.println("");
                   if (deal=='y')
                   {
                       c1=c;
                       $=$-20;
                       ante=ante+20;
                   }
                   else
                   {
                       System.out.println("Round's over then.");
                   }
               }
               else
               {
                   deal='n';
                   System.out.println("Round's over.");
               }
           }
           
           //IF: Can they play another round?
           int dc=0;
           if (c<21) //MAKE THIS ENTIRE ELSE FIRST - HAVE TO REDIRECT TO WIN OR LOSE ifs
           {
               System.out.println("\nDealer's run.");
               int dc1 = (int)(Math.random()*12+2);
               System.out.println("\nThe dealer's first card is "+dc1);
               while (dc<17)
               {
                   int dc2 = (int)(Math.random()*12+2);
                   System.out.println("The dealer's next card is "+dc2);
                   dc = dc1+dc2;
                   System.out.println("The dealer got "+dc+".");
                   dc1=dc;
               }               
           }
           if (c==21||dc<c||dc>21)
           {
               $=2*ante+$;
               yn=IBIO.inputChar("Congratulations - you won "+(ante*2)+" credits to a total of "+$+" credits. Want to play another round?(y/n) :: ");
               if (yn!='y')
                    System.out.println("You leave the shack with your "+$+" credits. Farewell, spacefarer.\n\n");
           }
           else if ($<=0)
           {
               System.out.println("\"You're done pal. You've got no more credits.\"\nYou leave the shack in a regretful silence, pondering your destitution.\n\n");
               yn='n';
           }
           else if (c>21||dc>c)
           {
               yn=IBIO.inputChar("You lost - you have "+$+" credits left. You gonna stay for another round? (y/n) :: ");
               if (yn!='y')
                    System.out.println("No shame in walking away.\n *You lose "+ante+" credits, and walk away with "+$+".\n\n");
           }
        }
    }
}
