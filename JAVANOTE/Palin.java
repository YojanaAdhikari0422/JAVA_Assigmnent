// Write a java program to check whether a given number is palindrome number or not.

import java.io.*;
import java.util.*;

class N{
    void palindrome(int num){
        int rem=0, rev=0;
        int X=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }
        
        // System.out.println(rev);
        if(X==rev){
            System.out.println(rev+" : This is a Palindrome number");
            }
        else 
            System.out.println(rev+" : This number is not Palindrome Number");
    }
}
class Palin
{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you number: ");
        int x=sc.nextInt();
        N obj=new N();
        obj.palindrome(x);
    }
}
