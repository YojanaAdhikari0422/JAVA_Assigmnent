// Write a java program to find GCD of two number?

import java.io.*;
import java.util.*;

class GCD
{
	void gcd(int a,int b){
		//int a, b;
		int rem;
		
		while(b!=0){
			rem=a%b;
			a=b;
			b=rem;
			
		}
		
		System.out.print("The value of GCD: "+a);
		// return a;
	}
}

class checkGCD{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int x=sc.nextInt();
		System.out.print("Enter second Number: ");
		int y=sc.nextInt();
		GCD obj=new GCD();
		obj.gcd(x,y);
		// obj.g(y);

	}
}
