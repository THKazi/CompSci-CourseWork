/**
 * Write a description of class FirstMethod here.
 *
 * @author (Timurul H. Kazi)
 * @version (March 25th, 2019)
 */
//At the bottom of this class are a series of methods
//Fill them in, according to their instructions.
//Run them as you go, to verify if they are working.

public class firstMethods
{
    public static void main (String args[])
    {
        new firstMethods ();
    }

    public firstMethods ()
    {
        square ();
        blank ();
        circle ();
        blank ();
        cat ();
        blank ();
        line ();
        blank ();
        count ();
        blank ();
        signature ();
    }

    public void blank ()
    { System.out.println("");
    }

    public void square ()
    { System.out.println(" _____");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println(" -----");
    }

    public void circle ()
    {
        System.out.println("   *****");
        System.out.println(" *       *");
        System.out.println("*         *");
        System.out.println(" *       *");
        System.out.println("   *****");
    }

    public void cat ()
    {
        System.out.println(" |\\_/|     ");
        System.out.println("(. .)");
        System.out.println(" =w= (\\   ");
        System.out.println("/ ^ \\//   ");
        System.out.println("(|| ||)");
        System.out.println(",\"\"_\"\"_ .");
    }

    public void line ()
    { 
        for (int i=1; i<15; i++)
            System.out.print("*");
    }

    public void count ()
    {
        for (int i=1; i<11; i++)
            System.out.print(i+", ");
    }

    public void signature ()
    { 
        System.out.println(" ,ggggggggggggggg ,ggg,        gg   ,ggg,        gg                              ");
        System.out.println("dP\"\"\"\"\"\"88\"\"\"\"\"\"\"dP\"\"Y8b       88  dP\"\"Y8b       dP                              ");
        System.out.println("Yb,_    88       Yb, `88       88  Yb, `88      d8'                              ");
        System.out.println(" `\"\"    88        `\"  88       88   `\"  88    ,dP'                           gg  ");
        System.out.println("        88            88aaaaaaa88       88aaad8\"                             \"\"  ");
        System.out.println("        88            88\"\"\"\"\"\"\"88       88\"\"\"\"Yb,      ,gggg,gg     ,gggg,   gg  ");
        System.out.println("        88            88       88       88     \"8b    dP\"  \"Y8I    d8\"  Yb   88  ");
        System.out.println("  gg,   88            88       88       88      `8i  i8'    ,8I   dP    dP   88  ");
        System.out.println("   \"Yb,,8P   d8b      88       Y8, d8b  88       Yb,,d8,   ,d8b,,dP  ,adP' _,88,_");
        System.out.println("     \"Y8P'   Y8P      88       `Y8 Y8P  88        Y8P\"Y8888P\"`Y88\"   \"\"Y8d88P\"\"Y8");
        System.out.println("                                                                      ,d8I'      ");
        System.out.println("                                                                    ,dP'8I       ");
        System.out.println("                                                                   ,8\"  8I       ");
        System.out.println("                                                                   I8   8I       ");
        System.out.println("                                                                   `8, ,8I       ");
        System.out.println("                                                                   `Y8P\"        ");
        
        System.out.println("Turner Fenton Secondary School \n Grade 10 \n International Baccalaureate");
        System.out.println("To kill time is not murder; it's suicide.");
    }
}