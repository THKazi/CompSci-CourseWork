
/**
 * Write a description of class MethCon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MethConvert
{
    public static void main (String args[])
    {
        new MethConvert();
    }
    public MethConvert()
    {
        int int2 = IBIO.inputInt("Enter an binary number with 8 bits or less: ");
        int h = int2/10000000 * 128;
        int h1 = int2%10000000;
        int i = h1/1000000 * 64;
        int i1 = h1%1000000;
        int j = i1/100000 * 32;
        int j1 = i1%100000;
        int k = j1/10000 * 16;
        int k1 = j1%10000;
        int l = k1/1000 * 8;
        int l1 = k1%1000;
        int m = l1/100 * 4;
        int m1 = l1%100;
        int n = m1/10 * 2;
        int n1 = m1%10;
        int hn = h+i+j+k+l+m+n+n1;
        System.out.println(int2+" is "+hn+" in decimal.");
        
        int int1 = IBIO.inputInt("Enter an integer less than 256: ");
        int a = int1/128 * 10000000;
        int a1 = int1%128;
        int b = a1/64 * 1000000;
        int b1 = a1%64;
        int c = b1/32 * 100000;
        int c1 = b1%32;
        int d = c1/16 * 10000;
        int d1 = c1%16;
        int e = d1/8 * 1000;
        int e1 = d1%8;
        int f = e1/4 * 100;
        int f1 = e1%4;
        int g = f1/2 * 10;
        int g1 = f1%2;
        int ag = (a+b+c+d+e+f+g+g1);
        System.out.println(int1+" is "+ag+" in binary.");
        
        int GL=ag%2;
        int NL = hn%10;
        System.out.println("The last digits of your numbers are "+NL+" and "+GL+" respectively.");
        int n2 = NL+5;
        int g2 = GL+5;
        System.out.println(NL+" + 5 ="+n2+" and "+GL+" + 5 = "+g2);
        int gn = n2*g2;
        System.out.println(n2+" x "+g2+" = "+gn);
        System.out.println("The square root of "+gn+" is "+Math.sqrt(gn));
        
    }
}