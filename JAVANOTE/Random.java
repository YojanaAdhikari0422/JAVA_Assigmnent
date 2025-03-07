//   15.Write a program to generate 5 Random nos. between 1 to 100.

import java.util.*;
import java.lang.Math;

class Generate{
    void Random(int num){
        int Start=1;
        int i;
        int End=100;
        
        for(i=1;i<=num;i++){
            int random=(int)(Math.random()*End);
            System.out.print(random+"  ");
            // count++;
        }
        System.out.println("Count: "+i);
    }
}

class Random
{
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  Range: ");
        int x=sc.nextInt();
        Generate g1=new Generate();
        g1.Random(x);
    }
}
