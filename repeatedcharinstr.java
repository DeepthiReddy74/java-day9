import java.util.*;
class repeatedcharinstr
{
    public static void main(String args[])
    {
        String a="RajuBhaai";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
        int max=0;
        int index=0;
        for(int i=0;i<26;i++)
        {
            if(c[i]>max)
            {
              max=c[i];
                index=i;
            }
        }
        System.out.println("the most accurerated character is:"+(char)(index+65));
    }
}