/* 1. Write a static block which will be executed 
before main() method in a class. (CO1) */

class P1
{
    static
    {
        System.out.println("Static block executed");
    }
    public static void main(String args[])
    {
        P1 d=new P1();
        System.out.println("Main block executed");
        d.show();
    }
    void show()
    {
        System.out.println("Show method executed");
    }
}