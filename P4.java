// 4. Write a program in Java to reverse the digits of a number using while loop. (CO2)

import java.util.Scanner;
class P4
{
    public static void main(String args[])
    {
        long n, r = 0, rm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextLong();
        while (n != 0)
        {
            rm = n % 10;
            r = r * 10 + rm;
            n = n / 10;
        }
        System.out.println("Reverse number: " + r);
    }
}