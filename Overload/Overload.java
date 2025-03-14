public class Overload
{
    public int subtract(int a,int b){
        return a-b;
    }
    public int subtract(int a,int b,int c)
    {
        return a-b*c;
    }
    public static void main(String args[]){
    Overload obj=new Overload();
    int c=obj.subtract(10,20);
    int d=obj.subtract(10,20,45);
     System.out.println(c);
     System.out.println(d);
    }
}