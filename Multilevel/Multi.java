class Inherit
{
public void add()
{
    System.out.println("hi");
}
}
class Child extends Inherit{
    void display(){
        add();
        System.out.println("hloo");

    }}
class Third extends Child{
    void sound()
    {
        display();
    }
}

public class Multi
{
    public static void main(String args[])
    {
        Third ob=new Third();
        ob.sound();
    }
}
