import java.util.*;
class splitofsen
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String sp[]=a.split("");
        System.out.print(Arrays.toString(sp));
    }
}