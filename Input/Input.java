import java.util.*;
public class Input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        while(i<n)
        {
            System.out.println("enter the value:");
            a[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<n)
        {
            System.out.println("entered the code:"+a[i]);
            i++;
        }

    }
}