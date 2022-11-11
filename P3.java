/* 3. Write a program in Java to develop overloaded constructor. 
Also develop the copy constructor to create a new object with the state of the existing object. (CO1) */

class P3
{
    int x,y;
    P3(int x)
    {
        this.x=x;
        System.out.println("x= "+x+" y= "+y);
    }
    P3(int x, int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("x= "+x+" y= "+y);
    }  
    P3(P3 cp)
    {
        this.x=cp.x;
        this.y=cp.y;
        System.out.println("x= "+x+" y= "+y);
    }
    public static void main(String arg[])
    {
        P3 p1=new P3(5);
        P3 p2=new P3(5,10);
        P3 p3=new P3(p2);
    }
}