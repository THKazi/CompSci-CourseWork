
/**
 * Write a description of class StoryMode here.
 *
 * @author (Timurul H. Kazi)
 * @version (Februrary 8th, 2019)
 */
public class StoryMode
{
    public static void main (String args[])
    {
        new StoryMode();
    }
    public StoryMode()
    {
        int num = IBIO.inputInt("What is your favourite number? ");
        System.out.println("");
        System.out.println("Hello, Agent Applicant #000"+num);
        System.out.println("We'll begin with preliminary questioning.");
        System.out.println("");
        String code = IBIO.inputString("What is your codename? ");
        if (code.charAt(0)>91)
            code =(char)(code.charAt(0)-32)+code.substring(1);
        String alias = IBIO.inputString("What is your alias? ");
        if (alias.charAt(0)>91)
            alias =(char)(alias.charAt(0)-32)+code.substring(1);
        String meal = IBIO.inputString("What is your favourite meal of the day? ");
        String qual = IBIO.inputString("What is your favourite body part? ");
        String tgt = IBIO.inputString("Submit a traditional name? ");
        if (tgt.charAt(0)>91)
            tgt=(char)(tgt.charAt(0)-32)+tgt.substring(1);
        String blog = IBIO.inputString("What would you name a newspaper? ");
        if (blog.charAt(0)>91)
            blog=(char)(blog.charAt(0)-32)+code.substring(1);
        String cafe1 = IBIO.inputString("Submit an adjective: ");
        if (cafe1.charAt(0)>91)
            cafe1=(char)(cafe1.charAt(0)-32)+cafe1.substring(1);
        String cafe2 = IBIO.inputString("Submit your favourite snack: ");
        if (cafe2.charAt(0)>91)
            cafe2=(char)(cafe2.charAt(0)-32)+cafe2.substring(1);
        int time = IBIO.inputInt("How many years old are you? ");
        
        System.out.println("Your inputs are acceptable. The mission review will now commence.");
        System.out.println("");
        System.out.println("Agent "+code+", your mission was to take Dr. "+tgt+" out...");
        System.out.println("");
        System.out.println("... to "+meal+".");
        System.out.print("Using your exceptional "+qual+" you got the target's attention ");
        System.out.println("on \""+blog+"\"");
        System.out.println("You arrange a meeting at the Communist "+cafe1+" "+cafe2);
        System.out.println("Waiting for "+time+" days, you finally realize that they probably won't arrive.");
       
        char yn = IBIO.inputChar("Do you continue waiting? (y/n) ");
        if (yn==('y')||yn=='Y') {
            System.out.println("You have succeeded, agent.");
        }
        else {
            System.out.println("You have failed. Prepare for termination.");
        }
            
    }
}
