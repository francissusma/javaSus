import java.util.*;
public class Calculation
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.divition");
        System.out.println("Enter your choice");
        int choice=s1.nextInt();
        System.out.println("Enter value of a:");
        int a=s1.nextInt();
        System.out.println("Enter value of b:");
        int b=s1.nextInt();
        if(choice==1)
        {
            System.out.println(a+b);
        }
        else if(choice==2)
        {
            System.out.println(a-b);
        }
        else if(choice==3)
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println(a/b);
        }
       
    }
}