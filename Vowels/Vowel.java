import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String arr[]={"a","e","i","o","u"};
        System.out.println("enter the letter:");
        String letter=sc.nextLine();
        int i=0;
        int d=0;
        while(i<=4)
        {
        if(letter.equals(arr[i]))
        {
            d=1;
        }i=i+1;
        }
        if(d==1)
        {
              System.out.println("it is vowel");
        }
        else{
            System.out.println("not vowel");
        }
        
    }
}