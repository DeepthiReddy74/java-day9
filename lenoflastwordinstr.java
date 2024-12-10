import java.util.*;
class lenoflastwordinstr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        int d=s1.length;
        String h=s1[d-1];
        int c=h.length();
        System.out.println(c);
    }
}