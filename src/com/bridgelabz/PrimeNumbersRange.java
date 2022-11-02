package com.bridgelabz;
public class PrimeNumbersRange
{
    public static void main(String[] args)
    {
        System.out.println("Prime Numbers : ");
        int i,j;
        for (i=1; i<=1000; i++)
        {
            for(j=2;j<=i;j++)
            {
                if (i % j == 0)
                    break;
            }
            if(i==j)
                System.out.print(j+" ");
        }
    }
}
