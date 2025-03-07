import java.io.*;
import java.util.*;
class factor
{
    void number(int num)
    {
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
class Factor
{
    public static void main(String []a)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value: ");
        int x=sc.nextInt();
        
        factor obj=new factor();
        obj.number(x);
    }
}
