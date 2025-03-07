// 13.Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers?

import java.io.*;
import java.util.*;

class S
{
    int primesum(int num)
    {
        int count=0;
        if(num<2){
            System.out.println(num+" is not a prime number");
            return 0;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count ==0)
        {
            System.out.println(num+" is a prime number");
            return num;
        }
        else{
            System.out.println(num+" is not prime number");
        }
        return 0;
    }
}
class SumPrime
{
    public static void main(String []args){
        int sum=0, x, y;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x=sc.nextInt();
        System.out.print("Enter the second number: ");
        y=sc.nextInt();
        
        S obj=new S();
        int X=obj.primesum(x);
        int Y=obj.primesum(y);
        sum=X + Y;
        if(X !=0 && Y !=0)
        {
            obj.primesum(sum);
             System.out.println("Sum of two Prime number: "+sum);
        }
        else{
            System.out.println("Number are not Prime Number");
        }
    }
}
