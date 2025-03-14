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
class Third extends Inherit{
    void sound()
    {
        add();
    }
}

public class Hierarichal
{
    public static void main(String args[])
    {
        Third ob=new Third();
        ob.sound();
        Child obj=new Child();
        obj.display();
    }
}
