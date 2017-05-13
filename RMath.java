/*
This math class provides static methods that perform mathematical operations that are not found in Java's math class
*/

public class RMath
{
    /*
    This method returns the greatest common denominator of two integers using the Euclidean Algorithm
    */
    public static int gcd(int x, int y)
    {
        int a=x;
        int b=y;
        int result=a%b;
        while(result>0)
        {
            a=b;
            b=result;
            result=a%b;
        }
        return b;
    }
}