/* 8. Write a program that executes two threads. 
One thread will print the even numbers and the another thread will print odd numbers from 1 to 50. (CO4) */

class Odd extends Thread
{
    Odd(String s)
    {
        super(s);
    }
    public void run()
    {
        for (int i = 1; i <= 50; i++)
        {
            if (i % 2 == 1)
            {
                System.out.println("Odd: " + i);
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class Even extends Thread
{
    Even(String s)
    {
        super(s);
    }
    public void run()
    {
        for (int i = 1; i <= 50; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even: " + i);
                try
                {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class P8
{
    public static void main(String args[])
    {
        Odd o1 = new Odd("Odd");
        Even e1 = new Even("Even");
        o1.start();
        e1.start();
    }
}