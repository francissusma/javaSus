public class Methods
{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b*c;
    }
    public static void main(String args[]){
    Methods obj=new Methods();
    int c=obj.add(10,20);
    int d=obj.add(10,20,45);
     System.out.println(c);
     System.out.println(d);
    }
}