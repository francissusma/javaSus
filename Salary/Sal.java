import java.util.*;
public class Sal
{
    public static void main(String args[])
    {
    int j=1;
     while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary:");
        int salary=sc.nextInt();
        System.out.println("enter the choice:");
        int i=sc.nextInt();
        
     
        if(i==1)
        {
           double percent=salary*0.1;
           double sal=salary+percent;
            System.out.println("salary of manager is"+sal);
        }
        else if(i==2)
        {
            double percent=salary*0.2;
           double sal=salary+percent;
           System.out.println("salary of manager is"+sal);
        }
        else{
            System.out.println(salary);
        }j++;
     }
         
    }
   

    
}