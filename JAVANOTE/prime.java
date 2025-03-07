import java.io.*;
class prime_one_to_thousand
{
 public static void main(String arg[])
 {
  B ob1 = new B();
  ob1.check(1000);
 }
}

class B
{
 void check(int n)
 {
  for(int i=1; i<n; i++)
  {
   int count =0;
   for(int j=1; j<=i; j++)
   {
    if (i % j == 0)
     count++;
    }
   if(count == 2)
   {
    System.out.println(i);
   }

  }
 }
}

