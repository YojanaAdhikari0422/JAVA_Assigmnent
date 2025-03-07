//  Write a java program to print a Fibonacci sequence where only first 8 positive prime numbers are present. 
// Also print the prime numbers separately.

// Q3.


import java.io.*;
import java.util.*;

class sequence
{
    void prime(int n)
    {
        int n1=-1, n2=1, n3, i, j;
        System.out.print("Prime Fibonacci: ");
        for(i=1;i<=n;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            //System.out.print(n3+" ");

            if(n3>=2){
                int count=0;
                for(j=2;j*j<=n3;j++){
                    
                    if(n3%j==0){
                        // System.out.print("jkd "+j+" ");
                        count++;
                        break;

                    }

                }
                if(count==0)
                System.out.print(n3+" ");
            }
            
        }
    }
}

public class printPrime{
    public static void main(String[] args){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to print Fibonacci Prime number: ");
        num=sc.nextInt();
        
        sequence obj= new sequence();
        obj.prime(num);

}
}
