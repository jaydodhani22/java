/*  2. Write a program in Java to demonstrate use of this keyword. 
Check whether this can access the private members of the class or not. (CO1) */

class P2
{
    private int x=10;
    void print(int x)
    {
        System.out.println("Instance variable= "+this.x);
        System.out.println("Local variable= "+x);
    }
    void show()
    {
        int x=50;
        System.out.println("Instance variable= "+this.x);
        System.out.println("Local variable= "+x);
    }
    public static void main(String args[])
    {
        P2 d1=new P2();
        P2 d2=new P2();
        d1.print(20);
        d2.show();
    }
}