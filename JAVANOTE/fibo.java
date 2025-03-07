import java.io.*;
class fib_sum
{
 public static void main(String a[])
 {
  A ob1 =new A();
  ob1.check(10);
 }
}

class A
{
 void check(int n)
 {
  int a=0,b=1,sum=0;
  System.out.println(a + " " + b + " ");
  for(int i = 2; i < n; i++)
  {
   sum = a+b;
   System.out.println(sum + " ");
   a = b;
   b = sum;
  }
  System.out.println("The total sum is:" + sum);
 }
}

