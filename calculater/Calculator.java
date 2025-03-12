public class Calculator
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    public void subtract(int a,int b)
    {
        int c=a-b;
        System.out.println(c);
    }
    public void multiply(int a,int b)
    {
        int c=a*b;
        System.out.println(c);
    }
    public void divide(int a,int b)
    {
        int c=a/b;
        System.out.println(c);
    }
    public static void main(String args[])
    {
    Calculator obj=new Calculator();
    obj.add(10,38);
    obj.subtract(45,38);
    obj.multiply(90,2);
    obj.divide(40,5);
    }
}