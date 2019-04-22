
/**
 * Write a description of class MuffIns here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MuffIns
{
    public static void main (String args[])
    {
        new MuffIns();
    }
    public MuffIns()
    {
        System.out.println("Bienvenue au Rôtisserie Revolutionaire du Robespierre! Nous servons seulement les Jacobins ici.\n");
        System.out.println("**Si vous aimez les rôtis gastronomique, c'est le lieu pour vous.**\n");
        int gourmet = IBIO.inputInt("Quel plat voulez-vous?\n~Le Menu~\n1.Du Porc - $35,00\n2.Du Veau - $55,00\n3.De la Venaison - $55,00\n4.Du Boeuf - $70,00\n");
        char pâtes = IBIO.inputChar("Voulez-vous des pâtes avec ça?(y/n)\n");
        double p=0.00;
        double prix=0.00;
        if (gourmet==1)
            prix=35.00;
        else if (gourmet==2)
            prix=55.00;
        else if (gourmet==3)
            prix=55.00;
        else if (gourmet==4)
            prix=70.00;
        else 
            System.out.println("Choisir un des options, s'il te plaît.");
        if (pâtes=='y')
            p=15.00;
        double sub = (prix+p)*1.13;
        sub = Math.round(sub*100);
        sub = sub/100;
        double pb = IBIO.inputDouble("Votre addition est $"+sub+". Voulez-vous donner un pourboire?\n$");
        System.out.println("Votre total est $"+(sub+pb)+". Merci, et bon appétit!");
    }
}