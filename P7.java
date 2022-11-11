/* 7. Write a small application in Java to develop Banking Application in which user 
deposits the amount Rs. 1000.00 and then start withdrawing of Rs. 400.00, Rs. 300.00 
and it throws exception "Not Sufficient Fund" when user withdraws Rs. 500 thereafter. (CO3) */

class Invalid extends Exception
{
    Invalid(String s)
    {
        super(s);
    }
}
class P7 
{
    static double dep = 1000.00;
    static void withdraw(double amt) throws Invalid
    {
        if (dep < amt)
            throw new Invalid("Not Sufficient Fund");
        else
        {
            dep = dep - amt;
            System.out.println("Available fund= " + dep);
        }
    }
    public static void main(String arg[])
    {
        try
        {
            withdraw(400.00);
            withdraw(300.00);
            withdraw(500.00);
        }
        catch (Exception m)
        {
            System.out.println(m);
        }
    }
}