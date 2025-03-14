class Inherit
{
void add()
{
   
}
}
class Child extends Inherit{
    void add(){
        System.out.println("hi");
}

    }

 public class Over
{
    public static void main(String args[])
    {
        Child ob=new Child();
        ob.add();
    }
}