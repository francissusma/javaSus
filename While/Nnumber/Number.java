import java.util.*;
public class Number
{
    public static void main (String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s1.nextInt();
        int i=1;
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }
        }
}